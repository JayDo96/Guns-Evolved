package com.jaydo.gunsev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jaydo.gunsev.proxy.CommonProxy;
import com.jaydo.gunsev.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static final Logger GUNSEV_LOG = LogManager.getLogger(Reference.MODID);
	public static final Logger LOGGER = LogManager.getLogger();
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		LOGGER.debug("preInit");
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		LOGGER.debug("init");
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		LOGGER.debug("postInit");
	}
	
	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
		GUNSEV_LOG.warn("Invalid fingerprint detected! The file " + event.getSource().getName() + " may have been tampered with. This version will NOT be supported by the author!");
	}
}
	