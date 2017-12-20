package com.sandu.mybatisgen.plugin;

import java.util.List;

import org.mybatis.generator.api.PluginAdapter;

/**
 * CopyRight (c) 2017 Sandu Technology Inc.<p>
 *
 * mybatis-gen
 *
 * @author songjianming@sanduspace.cn <p>
 * 2017年12月19日
 */

public class SwaggerPlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}
}
