<%-- 
    Document   : errorPage
    Created on : 08-Oct-2020, 14:40:24
    Author     : kostis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4>Product could not be deleted!!!!</h4>
        <p>
            <b>${minima}</b>
        </p>
        <!--expression Language-->
        <a href="${pageContext.request.contextPath}/ListSalesmanServlet">Go to Salesman list</a>
    </body>
</html>
