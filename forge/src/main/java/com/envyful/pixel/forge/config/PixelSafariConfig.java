package com.envyful.pixel.forge.config;

import com.envyful.api.config.data.ConfigPath;
import com.envyful.api.config.yaml.AbstractYamlConfig;
import com.google.common.collect.Lists;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;

import java.util.List;

@ConfigPath("config/PixelSafari/config.yml")
public class PixelSafariConfig extends AbstractYamlConfig {

    private String worldName;
    private List<ZoneInfo> zones = Lists.newArrayList(
            new ZoneInfo("Main", 0, 100, 0),
            new ZoneInfo("Main", 10, 100, 10)
    );

    public PixelSafariConfig() {
        super();
    }

    public String getWorldName() {
        return this.worldName;
    }

    public List<ZoneInfo> getZones() {
        return this.zones;
    }

    @ConfigSerializable
    private class ZoneInfo {

        private String name;
        private int x;
        private int y;
        private int z;

        public ZoneInfo(String name, int x, int y, int z) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public String getName() {
            return this.name;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public int getZ() {
            return this.z;
        }
    }
}