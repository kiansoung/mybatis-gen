package com.sandu.mybatisgen.comment;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.util.StringUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

public class DefaultCommentGenerator implements org.mybatis.generator.api.CommentGenerator {

	/** The properties. */
	private Properties properties;

	/** The suppress all comments. */
	private boolean suppressAllComments;

	/**
	 * The addition of table remark's comments. If suppressAllComments is true, this
	 * option is ignored
	 */
	private boolean addRemarkComments;

	/**
	 * Instantiates a new default comment generator.
	 */
	public DefaultCommentGenerator() {
		super();
		properties = new Properties();
		addRemarkComments = false;
		suppressAllComments = false;
	}

	public void addConfigurationProperties(Properties properties) {
		this.properties.putAll(properties);

		suppressAllComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
		addRemarkComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));
	}

	public void addEnumComment(InnerEnum arg0, IntrospectedTable arg1) {

	}

	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

	}

	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
			return;
		}
		
		IntrospectedColumn firstColumn = introspectedTable.getAllColumns().get(0);
		if (firstColumn.equals(introspectedColumn)) {
			field.addJavaDocLine("");
		}
		
		field.addJavaDocLine("/**");

		StringBuilder sb = new StringBuilder();

		String remarks = introspectedColumn.getRemarks();
		if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
			sb.append(" * ");
			sb.append(remarks);
			sb.append("<p>");
			field.addJavaDocLine(sb.toString());
			sb.setLength(0);
		}

		sb.append(" * ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		sb.append('.');
		sb.append(introspectedColumn.getActualColumnName());
		field.addJavaDocLine(sb.toString());

		field.addJavaDocLine(" */");
	}

	/**
	 * This method returns a formated date string to include in the Javadoc tag and
	 * XML comments. You may return null if you do not want the date in these
	 * documentation elements.
	 * 
	 * @return a string representing the current timestamp, or null
	 */
	protected String getDateString() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
	}

	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		if (suppressAllComments || !addRemarkComments) {
			return;
		}

		StringBuilder sb = new StringBuilder();

		topLevelClass.addJavaDocLine("/**");
		topLevelClass.addJavaDocLine(" * CopyRight (c) 2017 Sandu Technology Inc.<p>");
		
		topLevelClass.addJavaDocLine(" * ");
		String remarks = introspectedTable.getRemarks();
		if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
			sb.append(" * ");
			sb.append(remarks);
			topLevelClass.addJavaDocLine(sb.toString());
			sb.setLength(0);
		}
		
		topLevelClass.addJavaDocLine(" * ");
		topLevelClass.addJavaDocLine(" * @author songjianming@sanduspace.cn <p>");
		topLevelClass.addJavaDocLine(" * " + getDateString());
		topLevelClass.addJavaDocLine(" */");
	}

	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
	}

	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
	}

	public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
	}

	public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
	}

	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
	}

	public void addJavaFileComment(CompilationUnit compilationUnit) {
	}

	public void addComment(XmlElement xmlElement) {
	}

	public void addRootComment(XmlElement rootElement) {
	}
}
