package me.boost183.qcore.title;

import org.bukkit.entity.Player;

class BukkitTitleAPI implements InternalTitleAPI {

    BukkitTitleAPI() {
    }

    @Override
    public void sendTitle(Player player, String title, String subtitle, int fadeIn, int stay, int fadeOut) {
        player.sendTitle(title, subtitle);
    }
}
