package org.plugin.concentration;

import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.WorldType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Item;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustByBlockEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

  @Override
  public void onEnable() {
    Bukkit.getPluginManager().registerEvents(this, this);
  }

  /**
   * プレイヤーの周囲のモブ(プレイヤーを含む)が炎上したというイベントを受け取り、メッセージを周囲のプレイヤーに表示する
   *
   * @param e イベント
   */
  @EventHandler
  public void onEntityCombust(EntityCombustByBlockEvent e) {
    Entity entity = e.getEntity();
    Location location = entity.getLocation();
    List<Entity> nearByEntities = entity.getNearbyEntities(10, 10, 10);
    if(entity instanceof Mob) {
      for (Entity nearByEntity : nearByEntities) {
        if (nearByEntity instanceof Player) {
          Player player = (Player) nearByEntity;
          player.sendMessage(entity.getName() + ":あっちっち！");
        }
      }
    }
    if (entity instanceof Player) {
      Player player = (Player) entity;
      player.sendMessage(player.getName() + ":あっちっち！");
    }
  }

  @EventHandler
  public void PortalCreate(PortalCreateEvent e){
    if(e.getEntity() instanceof Player) {
      Player player = (Player) e.getEntity();
      World world = player.getWorld();
      if(player.getWorld().getEnvironment() == Environment.NORMAL){
          player.sendMessage("ネザーの主:ん？お前は…");
        if(player.getLevel() < 10){
          e.setCancelled(true);
          player.playSound(player,Sound.ENTITY_WITHER_SPAWN,30,10);
          player.sendMessage("ネザーの主:レベルが足りないな。\nお前にはこの世界に足を踏み入れる資格がない。\nレベルを上げて出直してくるんだな。");
        }else{
          e.setCancelled(false);
          player.playSound(player,Sound.ENTITY_WITHER_AMBIENT,30,10);
          player.sendMessage("ネザーの主:お前にはこの世界に足を踏み入れる資格がある。"+player.getName()+"、君を歓迎しよう。");
        }
      }else if(player.getWorld().getEnvironment() == Environment.NETHER){
        player.playSound(player,Sound.ENTITY_WITHER_AMBIENT,30,10);
        player.sendMessage("ネザーの主:また会おう。お前が封印を解く日を楽しみにしているぞ。フッフッフ..。");
      }
    }
  }
}
