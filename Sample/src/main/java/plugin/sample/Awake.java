package plugin.sample;

import static org.bukkit.Material.CHAINMAIL_BOOTS;
import static org.bukkit.Material.CHAINMAIL_CHESTPLATE;
import static org.bukkit.Material.CHAINMAIL_HELMET;
import static org.bukkit.Material.CHAINMAIL_LEGGINGS;
import static org.bukkit.Material.DIAMOND_BOOTS;
import static org.bukkit.Material.DIAMOND_CHESTPLATE;
import static org.bukkit.Material.DIAMOND_HELMET;
import static org.bukkit.Material.DIAMOND_LEGGINGS;
import static org.bukkit.Material.DIAMOND_SWORD;
import static org.bukkit.Material.GOLDEN_BOOTS;
import static org.bukkit.Material.GOLDEN_CHESTPLATE;
import static org.bukkit.Material.GOLDEN_HELMET;
import static org.bukkit.Material.GOLDEN_LEGGINGS;
import static org.bukkit.Material.GOLDEN_SWORD;
import static org.bukkit.Material.IRON_BOOTS;
import static org.bukkit.Material.IRON_CHESTPLATE;
import static org.bukkit.Material.IRON_HELMET;
import static org.bukkit.Material.IRON_LEGGINGS;
import static org.bukkit.Material.IRON_SWORD;
import static org.bukkit.Material.LEATHER_BOOTS;
import static org.bukkit.Material.LEATHER_CHESTPLATE;
import static org.bukkit.Material.LEATHER_HELMET;
import static org.bukkit.Material.LEATHER_LEGGINGS;
import static org.bukkit.Material.NETHERITE_BOOTS;
import static org.bukkit.Material.NETHERITE_CHESTPLATE;
import static org.bukkit.Material.NETHERITE_HELMET;
import static org.bukkit.Material.NETHERITE_LEGGINGS;
import static org.bukkit.Material.NETHERITE_SWORD;
import static org.bukkit.Material.STONE;
import static org.bukkit.Material.STONE_SWORD;
import static org.bukkit.Material.WOODEN_SWORD;
import static org.bukkit.potion.PotionEffectType.ABSORPTION;
import static org.bukkit.potion.PotionEffectType.GLOWING;
import static org.bukkit.potion.PotionEffectType.HEALTH_BOOST;
import static org.bukkit.potion.PotionEffectType.HUNGER;
import static org.bukkit.potion.PotionEffectType.INCREASE_DAMAGE;
import static org.bukkit.potion.PotionEffectType.LUCK;
import static org.bukkit.potion.PotionEffectType.NIGHT_VISION;
import static org.bukkit.potion.PotionEffectType.registerPotionEffectType;

import java.util.Collection;
import java.util.Collections;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Awake implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if(sender instanceof Player player){
      if(player.getLevel() > 0 && player.getLevel() <= 9) {
        player.addPotionEffects(Collections.singleton(new PotionEffect(HEALTH_BOOST, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(INCREASE_DAMAGE, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(LUCK, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(NIGHT_VISION, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(GLOWING, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(HUNGER, 6000, player.getLevel())));
        player.sendEquipmentChange(player, EquipmentSlot.HEAD, new ItemStack(LEATHER_HELMET, 1));
        player.sendEquipmentChange(player, EquipmentSlot.CHEST, new ItemStack(LEATHER_CHESTPLATE, 1));
        player.sendEquipmentChange(player, EquipmentSlot.LEGS, new ItemStack(LEATHER_LEGGINGS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.FEET, new ItemStack(LEATHER_BOOTS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.HAND, new ItemStack(WOODEN_SWORD, 1));
      }else if(player.getLevel() > 9 && player.getLevel() <= 19) {
        player.addPotionEffects(Collections.singleton(new PotionEffect(HEALTH_BOOST, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(INCREASE_DAMAGE, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(LUCK, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(NIGHT_VISION, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(GLOWING, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(HUNGER, 6000, player.getLevel())));
        player.sendEquipmentChange(player, EquipmentSlot.HEAD, new ItemStack(GOLDEN_HELMET, 1));
        player.sendEquipmentChange(player, EquipmentSlot.CHEST, new ItemStack(GOLDEN_CHESTPLATE, 1));
        player.sendEquipmentChange(player, EquipmentSlot.LEGS, new ItemStack(GOLDEN_LEGGINGS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.FEET, new ItemStack(GOLDEN_BOOTS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.HAND, new ItemStack(GOLDEN_SWORD, 1));
      }else if(player.getLevel() > 19 && player.getLevel() <= 29) {
        player.addPotionEffects(Collections.singleton(new PotionEffect(HEALTH_BOOST, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(INCREASE_DAMAGE, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(LUCK, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(NIGHT_VISION, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(GLOWING, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(HUNGER, 6000, player.getLevel())));
        player.sendEquipmentChange(player, EquipmentSlot.HEAD, new ItemStack(CHAINMAIL_HELMET, 1));
        player.sendEquipmentChange(player, EquipmentSlot.CHEST, new ItemStack(CHAINMAIL_CHESTPLATE, 1));
        player.sendEquipmentChange(player, EquipmentSlot.LEGS, new ItemStack(CHAINMAIL_LEGGINGS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.FEET, new ItemStack(CHAINMAIL_BOOTS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.HAND, new ItemStack(STONE_SWORD, 1));
      }else if(player.getLevel() > 29 && player.getLevel() <= 39) {
        player.addPotionEffects(Collections.singleton(new PotionEffect(HEALTH_BOOST, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(INCREASE_DAMAGE, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(LUCK, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(NIGHT_VISION, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(GLOWING, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(HUNGER, 6000, player.getLevel())));
        player.sendEquipmentChange(player, EquipmentSlot.HEAD, new ItemStack(IRON_HELMET, 1));
        player.sendEquipmentChange(player, EquipmentSlot.CHEST, new ItemStack(IRON_CHESTPLATE, 1));
        player.sendEquipmentChange(player, EquipmentSlot.LEGS, new ItemStack(IRON_LEGGINGS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.FEET, new ItemStack(IRON_BOOTS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.HAND, new ItemStack(IRON_SWORD, 1));
      }else if(player.getLevel() > 39 && player.getLevel() <= 99) {
        player.addPotionEffects(Collections.singleton(new PotionEffect(HEALTH_BOOST, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(INCREASE_DAMAGE, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(LUCK, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(NIGHT_VISION, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(GLOWING, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(HUNGER, 6000, player.getLevel())));
        player.sendEquipmentChange(player, EquipmentSlot.HEAD, new ItemStack(DIAMOND_HELMET, 1));
        player.sendEquipmentChange(player, EquipmentSlot.CHEST, new ItemStack(DIAMOND_CHESTPLATE, 1));
        player.sendEquipmentChange(player, EquipmentSlot.LEGS, new ItemStack(DIAMOND_LEGGINGS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.FEET, new ItemStack(DIAMOND_BOOTS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.HAND, new ItemStack(DIAMOND_SWORD, 1));
      }else if(player.getLevel() > 99) {
        player.addPotionEffects(Collections.singleton(new PotionEffect(HEALTH_BOOST, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(INCREASE_DAMAGE, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(LUCK, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(NIGHT_VISION, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(GLOWING, 6000, player.getLevel())));
        player.addPotionEffects(Collections.singleton(new PotionEffect(HUNGER, 6000, player.getLevel())));
        player.sendEquipmentChange(player, EquipmentSlot.HEAD, new ItemStack(NETHERITE_HELMET, 1));
        player.sendEquipmentChange(player, EquipmentSlot.CHEST, new ItemStack(NETHERITE_CHESTPLATE, 1));
        player.sendEquipmentChange(player, EquipmentSlot.LEGS, new ItemStack(NETHERITE_LEGGINGS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.FEET, new ItemStack(NETHERITE_BOOTS, 1));
        player.sendEquipmentChange(player, EquipmentSlot.HAND, new ItemStack(NETHERITE_SWORD, 1));
      }else if(player.getLevel() > 128) {
        player.addPotionEffects(Collections.singleton(new PotionEffect(HEALTH_BOOST, 6000, 128)));
        player.addPotionEffects(Collections.singleton(new PotionEffect(INCREASE_DAMAGE, 6000, 128)));
        player.addPotionEffects(Collections.singleton(new PotionEffect(LUCK, 6000, 128)));
        player.addPotionEffects(Collections.singleton(new PotionEffect(NIGHT_VISION, 6000, 128)));
        player.addPotionEffects(Collections.singleton(new PotionEffect(GLOWING, 6000, 128)));
        player.addPotionEffects(Collections.singleton(new PotionEffect(HUNGER, 6000, 128)));
      }else if( player.getLevel() == 0){
        player.removePotionEffect(HEALTH_BOOST);
        player.removePotionEffect(INCREASE_DAMAGE);
        player.removePotionEffect(LUCK);
        player.removePotionEffect(NIGHT_VISION);
        player.removePotionEffect(GLOWING);
        player.removePotionEffect(HUNGER);
      }else{
        player.sendMessage("エラー！");
      }
    }
    return false;
  }
}
