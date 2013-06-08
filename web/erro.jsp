<%-- 
    Document   : index
    Created on : 30/05/2013
    Author     : Kevim
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <body bgcolor="#ccffff">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>B-Health</title>
        <script>
            var redirecturl = "index.jsp"
            var pausefor = 2
            function postaction() {
                if (window.timer) {
                    clearInterval(timer)
                    clearInterval(timer_2)
                }
                window.location = redirecturl
            }
            setTimeout("postaction()", pausefor * 1000)

        </script>
    <p><img src="topo.png" width="980" height="150" align="center"></p>
    <h3>
    </head>
    <body>
        <h4>Erro!<br>
            Sua operação, não pode ser concluída.<br>
            Você será redirecionado em alguns segundos.<br><br>
            <%--      <a href="listafuncionario.do">lista Funcionario </a><br>  --%>
        </h4>
    </body>
</html>