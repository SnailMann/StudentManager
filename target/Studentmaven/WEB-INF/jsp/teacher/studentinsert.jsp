<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>

    <title>新增学生信息</title>
    
  </head>
  
  <body>
  <table align="center"  border="0">
			<tr>
				<td>
				用户名: ${userid} 
				
				</td>				
				<td>
				
				用户类型: ${userType} 
				</td>
			
			</tr>
			</table>
 <center>
		<h1>插入学生信息</h1>
			<form action="${pageContext.request.contextPath}/StudentCustom/insertStudentCustom.action" method="post">
			
				<p>学号: <input type="text" name="id"></p>
				<p>姓名:
				<input type="text" name="name" />
				<br></p>
				<p>性别:
				<input type="text" name="sex" />
				<br></p>
                <p> 年龄:
				<input type="text" name="age" />
				<br></p>
                <p>  班级:
				<input type="text" name="grade" />
				<br></p>
                <p>  成绩:
				<input type="text" name="score" />
				<br></p>
				<input type="submit" value="提交" />
				<input type="reset" value="重置" />
			</form>
     </center>
  </body>
</html>
