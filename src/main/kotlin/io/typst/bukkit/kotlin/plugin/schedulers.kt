package io.typst.bukkit.kotlin.plugin

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitRunnable

fun JavaPlugin.runTaskAsync(runnable: () -> Unit) {
    object : BukkitRunnable() {
        override fun run() = runnable.invoke()
    }.runTaskAsynchronously(this)
}

fun JavaPlugin.runTask(runnable: () -> Unit) {
    object : BukkitRunnable() {
        override fun run() = runnable.invoke()
    }.runTask(this)
}
