<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전화번호 리스트</h1>
	
	<p>입력한 정보 내역입니다.</p>
	
		<c:forEach items="${pList }" var = "vo">
		<table border = "1">
			<colgroup>
					<col style = "width: 120">
					<col style = "width: 170">
			</colgroup>
			<tbody>		
				<tr>
					<td>이름(name)</td> 
					<td>${vo.name } </td>
				</tr>
				<tr>
					<td>핸드폰(hp)</td>
					<td>${vo.hp }</td>
				</tr>
				<tr>
					<td>회사(company)</td> 
					<td>${vo.company }</td>
				</tr>
				<tr>
					<td><a href = "/phonebook3/phone/updateForm">수정</a></td> 
					<td><a href = "#">삭제</a></td> 
				</tr>

			</tbody>
		</table>
		<br>
		</c:forEach>
		
	<br>
	
	<p>
		<a href = "/phonebook3/phone/writeForm" >추가번호 등록</a>
	</p>
</body>
</html>