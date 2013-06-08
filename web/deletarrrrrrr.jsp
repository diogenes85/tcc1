<%-- 
    Document   : deletarrrrrrr
    Created on : 08/06/2013, 05:29:51
    Author     : Kevim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>    </body>
    
    
    <%--
Document : formulario
Created on : 18/02/2012, 11:46:41
Author : Vaguetti
--%>
<%@page contentType="text/html" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<HTML>
<BODY BGCOLOR="#FFFFFF">
<CENTER>
<html:form action="cadastraproduto.do">
<label>Categoria:<html:select property="categoria">

<html:option value="Rolamento">Rolamento</html:option>
<html:option value="Rententor">Retentor</html:option>
</html:select>
<center>
<center><label>Descricao:<input type ="text" name="descricao"></center>
<center><label>Veiculo:<input type ="text" name="veiculo"></center>
<center><label>Utilizacao:<input type ="text" name="utilizacao"></center>
<center><label>Marca:<input type ="text" name="marca"></center>
<center><label>Altura:<input type ="text" name="altura"></center>
<center><label>DiametroInterno:<input type ="text" name="diametroInterno"></center>
<center><label>DiametroExterno:<input type ="text" name="diametroExterno"> </center>
<center><label>Substituto:<input type ="text" name="substituto"> </center>
<label>Observacao:<input type ="text" name="observacao"></input></center>

<center><html:submit value="Cadastrar"/></center>
</center>
</html:form>
</BODY>
</HTML>
    
    
    
    
    
</html>
