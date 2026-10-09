<%-- 
    Document   : cadastrarVacina
    Created on : 25/09/2026, 09:06:00
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
        
    <form action="CadastrarVacina" method="post">
        <label> ID: </label>
        <input type="text" id="idVacina" name="idVacina"
               readonly=""
               value="${vacina.idVacina== 0 ? "":
                        vacina.idVacina}" />
        
        <label> Nome Vacina: </label>
        <input type="text" id="nomeVacina" name="nomeVacina"
               value="${vacina.nomeVacina}"/>
        
        <label> Dose Recomendada: </label>
        <input type="text" id="doseRecomendada" name="doseRecomendada"
               value="${vacina.doseRecomendada}"/>
                       
        <h3 style="color: red"> ${mensagem} </h3>
        
        <button type="submit">Salvar</button>
    </form>
    </body>
</html>
