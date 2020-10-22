<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="ex02.RendimentoMes"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Resultado - Cálculo</h1>
<% 
	List<RendimentoMes> rendimentos = (List) request.getAttribute("rend_bean");
    for (RendimentoMes rendMes: rendimentos) {
    	out.println("<br> MES - " + rendMes.getMes() + 
    		" - REND = " +  rendMes.getValor() );
    }     
%>
<p> <a href="simula.jsp">Retornar</a> </p>
</body>
</html>