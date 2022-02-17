<%@ page import="com.example.santander.model.ClienteModel" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: cinth
  Date: 16/02/2022
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <%
            List<ClienteModel> clientes = (List)request.getAttribute("clientes");
            for(ClienteModel clienteModel: clientes){
        %>
                <li><%= clienteModel.getNome()%></li>

      <%
          }
      %>
    </ul>
</body>
</html>
