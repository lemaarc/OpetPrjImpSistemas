<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!<!doctype html>
<html>'
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div>
            <h3>Pessoas</h3>
            <form action="Controller" method="POST">
                <input type="submit" name="ação" value="Listar">     
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOME</th>
                        <th>ENDEREÇO</th>
                        <th>TELEFONE</th>
                        <th>DISCIPLINA</th>
                        <th>AÇÃO</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                    <tr>
                        <td>${dato.getId()}</td>
                        <td>${dato.getNome()}</td>
                        <td>${dato.getEndereço()}</td>
                        <td>${dato.getTelefone()}</td>
                        <td>${dato.getDisciplina()}</td>
                        <td>
                            <form>
                                <input type="submit" value="Editar">
                                <input type="submit" value="Deletar">
                                
                            </form>
                        </td>
                    </tr>
                    </c:forEach >
                </tbody>
            </table>
        </div>
    </center>
    </body>
</html>
