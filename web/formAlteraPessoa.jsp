<%-- 
    Document   : formAlteraPessoa
    Created on : 30/05/2013, 00:23:48
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
           <H1>Alterar  Pessoa</H1>
           <html:form action="alterapessoa.do">
               Nome: <html:text property="nome" value="${funcion.nome}"/> <BR>
               Email: <html:text property="email" value="${funcion.email}"/><BR>
               Data Nascimento: <html:text property="dataNasc" value="${funcion.dataNasc}"/><BR>
               <html:hidden property="id" value="${funcion.idPessoa}"/>                   
               <html:submit value="Alterar"/>
             
               </html:form>
               
                       
          </body>
</html>
