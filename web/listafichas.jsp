<%-- 
    Document   : newjsplistafichas
    Created on : 05/06/2013, 15:50:23
    Author     : Tipografia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fichas</title>
    </head>
    <body>
        <c:forEach var="ficha" items="${fichas}">    
           Ficha nº ${ficha.idFicha} <br>
           Exercicio: ${ficha.tipo} <br>
           Repetições: ${ficha.repeticao} <br>
           Aparelho: ${ficha.aparelho} 
              <html:form action="buscaficha.do">
                  <html:hidden property="idFicha" value="${ficha.idFicha}"/>
                  <html:submit value="Alterar"/>
              </html:form>
              <html:form action="excluirficha.do">
                  <html:hidden property="idFicha" value="${ficha.idFicha}"/>
                  <html:submit value="Excluir"/>
              </html:form>  <br><br>
        </c:forEach><br>         

    </body>
</html>
