<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.javaex.dao.PhoneDao" %>
<%@ page import="com.javaex.vo.PersonVo" %>    
    
<%
	int personId = Integer.parseInt(request.getParameter("personid"));

	PhoneDao phoneDao = new PhoneDao();
	phoneDao.personDelete(personId);

	response.sendRedirect("/WEB-INF/list.jsp");
%>    