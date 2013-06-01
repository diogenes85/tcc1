<%-- 
    Document   : cadastrapessoa
    Created on : 30/05/2013, 00:09:02
    Author     : Kevim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html>


<html><body>
    <head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><title>PÁGINA DE CADASTRO</title></head>
    <body>

        <H1>Cadastro</H1>
            <html:form action="cadastrapessoa.do">
                Nome: <html:text property="nome"/><BR>
                Email: <html:text property="email"/><BR>
                Data Nasc.: <html:text property="dataNasc"/><BR>
            Senha: <html:password property="senha"/><BR>
            Conf.: <html:password property="confsenha"/><BR><BR>
            <html:submit value="Cadastrar"/>

        </html:form>
    </body>
</html>