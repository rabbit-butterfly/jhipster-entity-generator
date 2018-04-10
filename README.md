# jhipster-entity-generator
jhipster项目 实体生成器. 
1. 生成jhipsert 实体
2. 生成jhipsert Service及实现类
3. 生成jhipsert page及dto
4. 生成swagger　参数注释
5. 还可以生成mybatis对象

# Quick 使用 
下载代码
`git clone  https://github.com/rabbit-butterfly/jhipster-entity-generator.git`

本工程需要依赖mybatis-generator-core.jar,lib目录已收录，
需要源码请于下地址下载　https://github.com/hackpros/mybatis-generator-core.git
# 环境配置
*** 打开`/resources/jeg-mysql.xml`这个文件
* 配置生成目录
><xml:variable name="root" select="D:/ds/islamic/doc/code" />
* 配置生成包名
><xml:variable name="package" select="com.fan" />

* 配置生成mybaits对象
>`<javaModelGenerator targetPackage="$package"   targetProject="$root">
    <!-- enableSubPackages:是否让schema作为包的后缀 -->
    <property name="enableSubPackages" value="true" />
    <!-- 从数据库返回的值被清理前后的空格 -->
    <property name="trimStrings" value="true" />
</javaModelGenerator>`

* 配置生成基础的curl操作xml 
>`<sqlMapGenerator targetPackage="$package"
    targetProject="$root">
    <property name="enableSubPackages" value="false" />
</sqlMapGenerator>`

* 配置生成手功配置的xml 1,自己写的SQL可以放到此文件中,再次生成不会影响之的sql -->
>`<sqlMapGenerator targetPackage="$package" targetBody="false"
    targetProject="$root">
    <property name="enableSubPackages" value="true" />
</sqlMapGenerator>
<javaClientGenerator type="XMLMAPPER"
    targetPackage="$package" targetProject="$root">
    <property name="enableSubPackages" value="true" />
    <property name="rootInterface" value="BaseMapper" />
</javaClientGenerator>`


* 配置生成double 服务及接口    //忽略
* 配置生成double 请求与接收对象 //忽略
>`<javaBusinessModelGenerator type="" targetPackage="java.%s" targetProject="$root">
      <property name="enableSubPackages" value="true" />
      <property name="rootClass" value="IRequest" />
</javaBusinessModelGenerator>`

##  配置生成jhipster jdl 
>`<uiGenerator type="JDL" targetPackage="jhipster"
        targetProject="$root" implementationPackage="test">
   </uiGenerator>`
   
##  配置生成的表
   将这条SQL的查询查果复制到文件尾部
>`SELECT concat("<table catalog=\"\" tableName=\"",TABLE_NAME,"\" domainObjectName=\"Company\">\n<generatedKey 
			column=\"id\" sqlStatement=\"Mysql\"/>\n</table>") FROM INFORMATION_SCHEMA.TABLES 
			WHERE TABLE_SCHEMA = 'kenlen'`
#  执行app的main方法

## 将生成的单个jh文件合并为一个文件
> 使用dos命令　 cd jhipster <br>
>             　type *.jh  ../allEnt.jh
## 生成jh命令生成基础类
> jhipsert import-jdl allEnt.jh

* 生成jhipster jdl 配置文件
> <uiGenerator type="JDL" targetPackage="jhipster"
		targetProject="$root" implementationPackage="test">
	</uiGenerator>
##　最后可以将文件拷贝到项目中

# 关于我
欢迎交流问题，可加2205380769，一起探讨交流问题<br>
我的博客地址<br>
个人域名<br>
QQ群:
# 如果本文可以带给你一点帮助，请不要吝啬一个star　:)
