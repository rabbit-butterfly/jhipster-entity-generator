# jhipster-entity-generator
jhipster项目 实体生成器

<<<<<<< HEAD
# Quick 使用 
=======
# Quick start 
>>>>>>> 2391cd7cfd3e443d68b166ba1e015e8b171a9000
下载代码
git clone 

# 环境配置
<<<<<<< HEAD
*** 打开`/resources/jeg-mysql.xml`这个文件
=======
>>>>>>> 2391cd7cfd3e443d68b166ba1e015e8b171a9000
* 生成目录
><xml:variable name="root" select="D:/ds/islamic/doc/code" />
* 生成包名
><xml:variable name="package" select="com.jumore.ds.finace" />

* 生成mybaits对象

>`<javaModelGenerator targetPackage="$package"   targetProject="$root">
    <!-- enableSubPackages:是否让schema作为包的后缀 -->
    <property name="enableSubPackages" value="true" />
    <!-- 从数据库返回的值被清理前后的空格 -->
    <property name="trimStrings" value="true" />
</javaModelGenerator>`

* 生成基础的curl操作xml 
>`<sqlMapGenerator targetPackage="$package"
    targetProject="$root">
    <property name="enableSubPackages" value="false" />
</sqlMapGenerator>`

* 生成手功配置的xml 1,自己写的SQL可以放到此文件中,再次生成不会影响之的sql -->
>`<sqlMapGenerator targetPackage="$package" targetBody="false"
    targetProject="$root">
    <property name="enableSubPackages" value="true" />
</sqlMapGenerator>
<javaClientGenerator type="XMLMAPPER"
    targetPackage="$package" targetProject="$root">
    <property name="enableSubPackages" value="true" />
    <property name="rootInterface" value="BaseMapper" />
</javaClientGenerator>`


* 生成double 服务及接口    //忽略
* 生成double 请求与接收对象 //忽略
<p><javaBusinessModelGenerator type="" targetPackage="java.%s" targetProject="$root">
      <property name="enableSubPackages" value="true" />
      <property name="rootClass" value="IRequest" />
</javaBusinessModelGenerator><p>

<<<<<<< HEAD
##  生成jhipster jdl 配置文件
>`<uiGenerator type="JDL" targetPackage="jhipster"
        targetProject="$root" implementationPackage="test">
   </uiGenerator>`

##  配置生成的表
   将这条SQL的查询查果复制到文件尾部
`SELECT concat("<table catalog=\"\" tableName=\"",TABLE_NAME,"\" domainObjectName=\"Company\">\n<generatedKey 
			column=\"id\" sqlStatement=\"Mysql\"/>\n</table>") FROM INFORMATION_SCHEMA.TABLES 
			WHERE TABLE_SCHEMA = 'kenlen'`


## 将生成的单个jh文件合并为一个文件
>> 使用dos命令　 cd jhipster <br>
>>      &&&&&&&&&&&&    type *.jh  ../allEnt.jh
## 生成jh基础类
>> jhipsert import-jdl allEnt.jh

=======
* 生成jhipster jdl 配置文件
> <uiGenerator type="JDL" targetPackage="jhipster"
			targetProject="$root" implementationPackage="test">
		</uiGenerator>
>>>>>>> 2391cd7cfd3e443d68b166ba1e015e8b171a9000



# 关于我
欢迎交流问题，可加2205380769，一起探讨交流问题
我的博客地址
个人域名
2018/04/08更新
<<<<<<< HEAD
=======

>>>>>>> 2391cd7cfd3e443d68b166ba1e015e8b171a9000
