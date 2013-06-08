<%-- 
    Document   : cadastraficha
    Created on : 02/06/2013, 14:58:39
    Author     : Kevim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><title>Cadastrar Nova Ficha</title></head>
    <body>
        <html:form action="cadastraficha.do">
            Aparelho: <html:text property="aparelho"/><br>
            Repetições: <html:text property="repeticao"/><br>
            <html:select property="tipo">
                <c:forEach var="tipo" items="${tipos}">
                    <html:option value="${tipo}" />
                </c:forEach>
            </html:select>
            <html:submit value="Cadastrar"/>
        </html:form>

    </body>
</html>
