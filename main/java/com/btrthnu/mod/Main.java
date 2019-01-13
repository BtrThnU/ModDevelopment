package com.btrthnu.mod;

import com.btrthnu.mod.proxy.CommonProxy;
import com.btrthnu.mod.tabs.CreativeTab;
import com.btrthnu.mod.util.Reference;
import com.btrthnu.mod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Main 
{
	public static final CreativeTabs CREATIVE_TAB = new CreativeTab("items");
	
	@Instance
    public static Main instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.preInitRegistries(event);
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries(event);
    }
    
    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {
        RegistryHandler.postInitRegistries(event);
    }
}