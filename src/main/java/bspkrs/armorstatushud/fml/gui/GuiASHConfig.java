package bspkrs.armorstatushud.fml.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import bspkrs.armorstatushud.fml.Reference;
import cpw.mods.fml.client.config.GuiConfig;

public class GuiASHConfig extends GuiConfig
{
    @SuppressWarnings("rawtypes")
    public GuiASHConfig(GuiScreen parent) throws NoSuchMethodException, SecurityException
    {
        super(parent, (new ConfigElement(Reference.config.getCategory(Configuration.CATEGORY_GENERAL))).getChildElements(),
                Reference.MODID, false, false, GuiConfig.getAbridgedConfigPath(Reference.config.toString()));
    }
}
