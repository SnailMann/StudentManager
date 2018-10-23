<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>修改学生信息</title>
	</head>

	<body>
		<center>
			<h1>
				修改学生信息
			</h1>
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
			
			<form  action="${pageContext.request.contextPath}/Student/editStudentSubmit.action" method="post" >
				
				<p>
					学号:
					<input type="text" name="id" value="${Student.id}" readonly style="background-color:gray"/>
					<br>
				</p>
				<p>
					姓名:
					<input type="text" name="name" value="${Student.name}" />
					<br>
				</p>
				<p>
					性别:
					<input type="text" name="sex" value="${Student.sex}" />
					<br>
				</p>
				<p>
					年龄:
					<input type="text" name="age" value="${Student.age}" />
					<br>
				</p>
				<p>
					班级:
					<input type="text" name="grade" value="${Student.grade}" readonly style="background-color:gray"/>
					<br>
				</p>
				<p>
					成绩:
					<input type="text" name="score" value="${Student.score}" readonly style="background-color:gray"/>
					<br>
				</p>
				<input type="submit" value="修改" />
				<input type="reset" value="重置" />
			</form>

		</center>
	</body>
</html>
