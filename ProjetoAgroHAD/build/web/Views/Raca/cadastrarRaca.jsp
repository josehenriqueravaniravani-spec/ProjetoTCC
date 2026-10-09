<%-- 
    Document   : cadastrarRaca
    Created on : 25/09/2026, 09:05:37
    Author     : JoseHenriqueRavani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <form action="CadastrarRaca" method="post">
        <label> ID: </label>
        <input type="text" id="idRaca" name="idRaca"
               readonly=""
               value="${raca.idRaca== 0 ? "":
                        raca.idRaca}" />
        
        <label> Nome Vacina: </label>
        <input type="text" id="nomeRaca" name="nomeRaca"
               value="${raca.nomeRaca}"/>
        
        <h3 style="color: red"> ${mensagem} </h3>                       
        
        <button type="submit">Salvar</button>
        
    </form>
    </body>
</html>
