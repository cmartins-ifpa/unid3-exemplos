<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  uri="http://displaytag.sf.net"  prefix="display"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css" media="all">
      @import url("css/maven-base.css"); 
      @import url("css/maven-theme.css"); 
      @import url("css/site.css"); 
      @import url("css/screen.css");
    </style>
    <link rel="stylesheet" href="./css/print.css" type="text/css" media="print" />
</head>
<body>
   <display:table name="rend_bean"
     pagesize="10" requestURI="Simulador" export="true" sort="list">
     <display:column title="MÊS" property="mes" sortable="true" /> 
     <display:column title="VALOR" property="valor" sortable="true" />
   </display:table>
   <p> <a href="simula.jsp">Retornar</a> </p>
</body>
</html>