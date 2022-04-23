package com.testframework.config;

import org.aeonbits.owner.ConfigCache;

public final class FactoryConfig {

	private FactoryConfig() {

	}

	public static FrameworkConfig getConfig() {
		return ConfigCache.getOrCreate(FrameworkConfig.class);
	}

}
