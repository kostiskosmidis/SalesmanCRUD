<%-- 
    Document   : salesmanList
    Created on : 08-Oct-2020, 12:34:34
    Author     : kostis
--%>

<%@page import="entity.Salesman"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of Salesman</title>
    </head>
    <body>
        <div align="center">
            <h2>List of Salesman</h2>
           <a href="${pageContext.request.contextPath}/CreateSalesmanServlet">Create New Salesman</a>
            <table border="1">
                <c:forEach items="${salesman}" var="s">
                    <tr>
                        <td>${s.scode}</td>
                        <td>${s.sname}</td>
                        <td>${s.scity}</td>
                        <td>
                            <a href="DeleteSalesmanServlet?id=${s.scode}" onclick="return confirm('Do you realy want to delete product:'+${s.scode}+'????')">Delete</a>
                            
                        </td>
                    </tr>
                    </tr>
                </c:forEach>
            </table>
        </div>

        
    </body>
</html>
