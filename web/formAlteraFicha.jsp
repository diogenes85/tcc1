<%-- 
    Document   : formAlteraFicha
    Created on : 08/06/2013, 06:03:26
    Author     : Kevim
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>


<html><body>
    <head> <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><title>PÁGINA DE UPDATE</title></meta></head>
    <body>
        <H1>Alterar  Ficha</H1>
            <html:form action="alteraficha.do">
            Exercicio: <html:select property="tipo">
                <c:forEach var="tipo" items="${tipos}">
                    <html:option value="${tipo}"/>
                </c:forEach>
                       </html:select>
            Repetição: <html:text property="repeticao" value="${funcion.repeticao}"/><BR>
            Aparelho: <html:text property="aparelho" value="${funcion.aparelho}"/><BR>
            <html:hidden property="id" value="${funcion.idFicha}"/>                   
            <html:submit value="Alterar"/>
        </html:form>


    </body>
</html>

