# student-manager

## Guide

1. 找到[students.sql](/document/sql/students.sql)文件，创建students数据库，导入students.sql
2. Idea/Eclipse添加Tomcat(我这里是`Tomcat 8.0.47`),准备好环境
3. 启动项目，账号`1001`,密码`123456`

## 注意

1. 如果出现了`The absolute uri: http://java.sun.com/jsp/jstl/core cannot be resolved`异常。应该是Tomcat，Servlet与Jsp兼容性问题，毕竟JSP技术已经比较老了
;可以下载 `jstl-1.2jar` Jar包，放到Tomcat的lib目录内，清空项目生成的target,classs等临时文件，重启服务即可