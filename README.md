# mybatis-gen

## 注解插件 
### com.sandu.mybatisgen.comment.DefaultCommentGenerator
```xml
<!-- 这里的type里写的是你的实现类的类全路径 -->
<commentGenerator type="com.sandu.mybatisgen.comment.DefaultCommentGenerator">
	<property name="addRemarkComments" value="true"/>
</commentGenerator>
```
## lombok 注解插件 
### com.sandu.mybatisgen.plugin.LombokPlugin
```xml
<!-- 
   suppressGetterMethod -> 是否支持Getter方法
   suppressSetterMethod -> 是否支持Setter方法
-->
<plugin type="com.sandu.mybatisgen.plugin.LombokPlugin">
    <property name="suppressGetterMethod" value="false"/>
    <property name="suppressSetterMethod" value="false"/>
</plugin>
```
## Dao层的Repository注解插件
### com.sandu.mybatisgen.plugin.DaoAnnotationsPlugin
<!-- @Repository 注解插件 -->
```xml
<plugin type="com.sandu.mybatisgen.plugin.DaoAnnotationsPlugin" />
```
