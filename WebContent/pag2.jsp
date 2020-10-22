<%@page import="ex01.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
    <h1>Página 2</h1>
    <p> Você está na PAG-2, <strong>
     <%  Usuario user = (Usuario) session.getAttribute("USUARIO");
         out.print(user.getNome());
     %> 
     </strong>  </p>
    
    <p>Você deseja ir para onde?</p>
    <a href="homepage.jsp">Voltar para Home</a> | 
    <a href="pag1.jsp">Página 1</a>
</body>
</html>