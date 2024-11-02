package me.rohandacoder.showMyCoordinates.commands

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.Bukkit.getServer
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class ShowCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val player = getServer().getPlayer(sender.name)

        if (player != null) {
            player.playSound(player.location, org.bukkit.Sound.AMBIENT_CAVE, 1.0f, 1.0f)



            player.sendActionBar(
                Component.text("You shared your location yay").color(NamedTextColor.YELLOW)
                    .decorate(TextDecoration.BOLD)
            )

            getServer().sendMessage(
                Component.text("${sender.name}'s coordinates are ").color(NamedTextColor.GREEN).append(
                    Component.text("X: ${player.location.x.toInt()} Y: ${player.location.y.toInt()} Z: ${player.location.z.toInt()}")
                        .color(NamedTextColor.AQUA)
                )
            )
            return true
        } else {
            sender.sendMessage(
                Component.text("That player doesn't exist.").color(NamedTextColor.RED)
            )
            return false
        }
    }
}
