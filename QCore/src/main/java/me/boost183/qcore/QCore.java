package me.boost183.qcore;

import org.bukkit.plugin.java.JavaPlugin;

public final class QCore extends JavaPlugin {

    private static QCore INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;

    }

    public static QCore getInstance(){
        return INSTANCE;
    }

}
