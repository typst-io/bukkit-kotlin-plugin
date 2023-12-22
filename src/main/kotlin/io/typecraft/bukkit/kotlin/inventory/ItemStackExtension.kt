package io.typecraft.bukkit.kotlin.inventory

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

fun item(
    material: Material,
    amount: Int = 1,
    displayName: String = "",
    lore: List<String> = emptyList(),
    customModelData: Int = -1,
): ItemStack =
    ItemStack(material, amount).apply {
        if (displayName.isNotEmpty() || lore.isNotEmpty() || customModelData >= 0) {
            itemMeta = itemMeta?.apply {
                if (customModelData >= 0) {
                    setCustomModelData(customModelData)
                }
                if (displayName.isNotEmpty()) {
                    setDisplayName(displayName)
                }
                if (lore.isNotEmpty()) {
                    setLore(lore)
                }
            }
        }
    }
