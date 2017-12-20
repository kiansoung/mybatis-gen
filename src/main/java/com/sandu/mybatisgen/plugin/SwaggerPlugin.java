package com.sandu.mybatisgen.plugin;

import java.util.List;

import org.mybatis.generator.api.PluginAdapter;

public class SwaggerPlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}
}
