package com.sandu.mybatisgen.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * CopyRight (c) 2017 Sandu Technology Inc.<p>
 *
 * mybatis-gen
 *
 * @author songjianming@sanduspace.cn <p>
 * 2017年12月20日
 */

public class DaoAnnotationsPlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}
	
	@Override
	public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		interfaze.addAnnotation("@Repository");
		interfaze.addImportedType(new FullyQualifiedJavaType("org.springframework.stereotype.Repository"));
		return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
	}
}
