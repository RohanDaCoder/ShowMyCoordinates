package me.rohandacoder.showMyCoordinates

import me.rohandacoder.showMyCoordinates.commands.PingCommand
import me.rohandacoder.showMyCoordinates.commands.ShowCommand
import org.bukkit.plugin.java.JavaPlugin

class ShowMyCoordinates : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Loaded Plugin.")
        registerCommands()
    }

    private fun registerCommands() {
        getCommand("ping")?.setExecutor(PingCommand())
        getCommand("show")?.setExecutor(ShowCommand())
        logger.info("Registered Commands")

    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Unloaded Plugin.")
    }
}
