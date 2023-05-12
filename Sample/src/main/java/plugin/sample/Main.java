package plugin.sample;

import java.io.IOException;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

  private int count;


  @Override
  public void onEnable() {
    saveDefaultConfig();

    Bukkit.getPluginManager().registerEvents(this, this);
    getCommand("setLevel").setExecutor(new SetLevelCommand(this));
    getCommand("awake").setExecutor(new Awake());
    getCommand("AllSetLevel").setExecutor(new AllSetLevelCommand());
  }

  @EventHandler
  public void PlayerMoveEvent(PlayerMoveEvent e) {
    Player player = e.getPlayer();
    World world = player.getWorld();
    Location playerLocation = player.getLocation();

//    Chicken chicken = world.spawn(new Location(world, playerLocation.getX() + 3,playerLocation.getY() + 3,playerLocation.getZ() + 3), Chicken.class);
//    if(world.getBlockAt(new Location(world, playerLocation.getX(), playerLocation.getY() - 1, playerLocation.getZ())).isEmpty()){
//
//    }else{
//    world.getBlockAt(new Location(world, playerLocation.getX(), playerLocation.getY() - 1, playerLocation.getZ())).setType(Material.EMERALD_BLOCK);
//    }
//    if(world.getBlockAt(new Location(world, playerLocation.getX() + 1, playerLocation.getY() - 1, playerLocation.getZ())).isEmpty()){
//
//    }else{
//    world.getBlockAt(new Location(world, playerLocation.getX() + 1, playerLocation.getY() - 1, playerLocation.getZ())).setType(Material.COAL_BLOCK);
//    }
//    if(world.getBlockAt(new Location(world, playerLocation.getX() - 1, playerLocation.getY() - 1, playerLocation.getZ())).isEmpty()){
//
//    }else{
//    world.getBlockAt(new Location(world, playerLocation.getX() - 1, playerLocation.getY() - 1, playerLocation.getZ())).setType(Material.IRON_BLOCK);
//    }
//    if(world.getBlockAt(new Location(world, playerLocation.getX(), playerLocation.getY() - 1, playerLocation.getZ() + 1)).isEmpty()) {
//
//    }else{
//    world.getBlockAt(new Location(world, playerLocation.getX(), playerLocation.getY() - 1, playerLocation.getZ() + 1)).setType(Material.DIAMOND_BLOCK);
//    }
//    if (world.getBlockAt(new Location(world, playerLocation.getX(), playerLocation.getY() - 1, playerLocation.getZ() - 1)).isEmpty()){
//
//    }else{
//    world.getBlockAt(new Location(world, playerLocation.getX(), playerLocation.getY() - 1, playerLocation.getZ() - 1)).setType(Material.GOLD_BLOCK);
//    }
//    if(world.getBlockAt(new Location(world, playerLocation.getX() + 1, playerLocation.getY() - 1, playerLocation.getZ() + 1)).isEmpty()){
//
//    }else{
//    world.getBlockAt(new Location(world, playerLocation.getX() + 1, playerLocation.getY() - 1, playerLocation.getZ() + 1)).setType(Material.LAPIS_BLOCK);
//    }
//    if(world.getBlockAt(new Location(world, playerLocation.getX() + 1, playerLocation.getY() - 1, playerLocation.getZ() - 1)).isEmpty()){
//
//    }else{
//    world.getBlockAt(new Location(world, playerLocation.getX() + 1, playerLocation.getY() - 1, playerLocation.getZ() - 1)).setType(Material.COPPER_BLOCK);
//    }
//    if(world.getBlockAt(new Location(world, playerLocation.getX() - 1, playerLocation.getY() - 1, playerLocation.getZ() + 1)).isEmpty()){
//
//    }else{
//    world.getBlockAt(new Location(world, playerLocation.getX() - 1, playerLocation.getY() - 1, playerLocation.getZ() + 1)).setType(Material.NETHERITE_BLOCK);
//    }
//
//    if(world.getBlockAt(new Location(world, playerLocation.getX() - 1, playerLocation.getY() - 1, playerLocation.getZ() - 1)).isEmpty()){
//
//    }else{
//    world.getBlockAt(new Location(world, playerLocation.getX() - 1, playerLocation.getY() - 1, playerLocation.getZ() - 1)).setType(Material.QUARTZ_BLOCK);
//    }
  }

  /**
   * プレイヤーがスニークを開始/終了する際に起動されるイベントハンドラ。
   *
   * @param e イベント
   */
  @EventHandler
  public void onPlayerToggleSneak(PlayerToggleSneakEvent e) throws IOException {
    // イベント発生時のプレイヤーやワールドなどの情報を変数に持つ。
    Player player = e.getPlayer();
    World world = player.getWorld();

    List<Color> colorList = List.of(Color.RED, Color.GREEN, Color.WHITE);

    // val が素数であるかの判定 isProbablePrimeメソッドを使用
    if (count % 2 == 0) {
      for (Color color : colorList) {

        // 花火オブジェクトをプレイヤーのロケーション地点に対して出現させる。
        Firework firework = world.spawn(player.getLocation(), Firework.class);

        // 花火オブジェクトが持つメタ情報を取得。
        FireworkMeta fireworkMeta = firework.getFireworkMeta();

        // メタ情報に対して設定を追加したり、値の上書きを行う。
        // 今回は緑色＋黒色で大きなボール型の花火を打ち上げる。
        fireworkMeta.addEffect(
            FireworkEffect.builder()
                .withColor(color)
                .with(Type.BURST)
                .withFlicker()
                .build());
        fireworkMeta.setPower(2);

        // 追加した情報で再設定する。
        firework.setFireworkMeta(fireworkMeta);
      }
//      Path path = Path.of("firework.text");
//      Files.writeString(path, "たーまやー");
//      player.sendMessage(Files.readString(path));
    }
    count++;
  }

  @EventHandler
  public void PlayerJoinEvent(PlayerJoinEvent e) throws IOException {
    Player player = e.getPlayer();
    World world = player.getWorld();
    player.sendMessage("ようこそMinecraftの世界へ！");

  }

/*
  @EventHandler
  public void onPlayerBedEvent(PlayerBedEnterEvent e){
    Player player = e.getPlayer();
    ItemStack[] ItemStacks = player.getInventory().getContents();
    Arrays.stream(ItemStacks)
        .filter(item -> !Objects.isNull(item) && item.getMaxStackSize() == 64 && item.getAmount() < 64)
        .forEach(item -> item.setAmount(0));

    player.getInventory().setContents(ItemStacks);
  }
*/
}