package com.sandu.mybatisgen.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;
import java.util.Properties;

/**
 * CopyRight (c) 2017 Sandu Technology Inc.
 * <p>
 *
 * mybatis-gen
 * 
 * lombok注解插件
 * @author songjianming@sanduspace.cn
 *         <p>
 *         2017年12月19日
 */

public class LombokPlugin extends PluginAdapter {
	
	private boolean suppressGetterMethod;
	private boolean suppressSetterMethod;
	
	public boolean validate(List<String> warnings) {
		return true;
	}
	
	@Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        suppressGetterMethod = Boolean.valueOf(properties.getProperty("suppressGetterMethod")); 
        suppressSetterMethod = Boolean.valueOf(properties.getProperty("suppressSetterMethod")); 
    }
	
	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		topLevelClass.addJavaDocLine("");
		topLevelClass.addAnnotation("@Data");
		topLevelClass.addImportedType(new FullyQualifiedJavaType("lombok.Data"));
		return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
	}
	
	@Override
	public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, 
			IntrospectedTable introspectedTable, ModelClassType modelClassType) {
		return suppressGetterMethod;
	}
	
	@Override
	public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, 
			IntrospectedTable introspectedTable, ModelClassType modelClassType) {
		return suppressSetterMethod;
	}
}
