package plugin.sample;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AllSetLevelCommand implements CommandExecutor {


  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if(sender instanceof Player player) {
      player.sendMessage("このコマンドは実行できません");
    } else {
      for(Player player : sender.getServer().getOnlinePlayers()) {
        player.setLevel(Integer.parseInt(args[0]));
        System.out.println("プレイヤーのレベルを" + args[0] + "に変更しました");
      }
    }
    return false;
  }
}
