<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Fruit List</title>
        <style>
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
            }
        </style>
    </head>
    <body>
        <h1>Fruit List</h1>
        <table>
            <tr>
                <th>Name</th>
                <th>Price</th>
            </tr>
            <c:forEach items="${fruits}" var="fruit">
                <tr>
                    <td>${fruit.name}</td>
                    <td>${fruit.price}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
