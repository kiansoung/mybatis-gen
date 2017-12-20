# mybatis-gen

## 注解插件 
### com.sandu.mybatisgen.plugin.DaoAnnotationsPlugin
```xml
<plugin type="com.sandu.mybatisgen.plugin.DaoAnnotationsPlugin" />
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
