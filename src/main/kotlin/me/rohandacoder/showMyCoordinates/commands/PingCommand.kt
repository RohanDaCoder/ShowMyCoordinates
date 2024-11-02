package me.rohandacoder.showMyCoordinates.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class PingCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, p1: Command, p2: String, p3: Array<out String>?): Boolean {
        sender.sendMessage("[Show My Coordinates] Pong!")
        return false
    }
}