<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.javaex.vo.PersonVo" %>    
<%@ page import="com.javaex.dao.PhoneDao" %>
<%	
	
	int personId = Integer.parseInt(request.getParameter("personid"));
	String name = request.getParameter("name");
	String hp = request.getParameter("hp");
	String company = request.getParameter("company");
	
	PersonVo personVo = new PersonVo(personId,name,hp,company);
	PhoneDao phoneDao = new PhoneDao();
	phoneDao.personUpdate(personVo);
	response.sendRedirect("/pb2/pbc?action=list");
	%>    
	//vo 만들기
	PerspenVo personVob = new PersonVo()
    