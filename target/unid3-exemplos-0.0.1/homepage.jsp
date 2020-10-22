<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
    <h1>Homepage</h1>
    <h3> Bem-vindo ${USUARIO.nome} </h3>
    <p> Você entrou às ${USUARIO.dataHoraLogin} </p>
    <p>Escolha sua opção</p>
    <a href="pag1.jsp">Página 1</a> | 
    <a href="pag2.jsp">Página 2</a>
</body>
</html>