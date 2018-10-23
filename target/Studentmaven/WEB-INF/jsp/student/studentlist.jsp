<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>学生信息列表</title>

	</head>
	<body>
	<center>
			<table align="center" width="360" border="0">
			<tr>
				<td align="center">
					<h1>个人信息</h1>
				</td>
				<td align="center">
					<a href="${pageContext.request.contextPath}/logout.action">退出</a>  
				</td>
			</tr>
			<tr>
				<td>
				用户名: ${userid} 
				</td>				
				<td>
				用户类型: ${userType} 
				</td>
			
			</tr>
		</table>
		<table align="center"  width="660" border="1" cellspacing="0" cellpadding="5" bordercolor="#000">
			<tr>
				<th width="50px">   学号</th>
				<th width="100px">	姓名 </th>
				<th width="50px">	年龄	</th>
				<th width="50px">	性别	</th>
				<th width="150px">	班级	</th>
				<th width="50px">	成绩	</th>
				<th width="50px">	修改	</th>
				
			</tr>
			<tr>

			</tr>
			<c:forEach var="studentitem" items="${studentList}">
				<tr>
					<td >
						
						${studentitem.id}
					</td>
					<td >
						${studentitem.name}
					</td>
					<td >
						${studentitem.age}
					</td>
					<td >
						${studentitem.sex}
					</td>
					<td >
						${studentitem.grade}
					</td>
					<td >
						${studentitem.score}
					</td>
					<td >
					<!--/WEB-INF/jsp/studentupdate.jsp  -->
						<a href="${pageContext.request.contextPath}/Student/editStudent.action?id=${studentitem.id}" >修改</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</center>
	</body>
</html>

