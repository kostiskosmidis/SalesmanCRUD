<%-- 
    Document   : SalesmanCreateForm
    Created on : 08-Oct-2020, 16:18:16
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
             <div align="center">
            <h2>Create New Salesman</h2>
            <form action="${pageContext.request.contextPath}/CreateSalesmanServlet" method="POST" style="margin-top: 5em">
                Name : <input type="text" name="name"/> <br/>
                City : <input type="text" name="city" /><br/>
                <input type="submit" value="Submit"/><br/>
            </form>
        </div>
    </body>
</html>
