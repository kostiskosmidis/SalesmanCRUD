/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.SalesmanService;

/**
 *
 * @author kostis
 */
@WebServlet(name = "DeleteSalesmanServlet", urlPatterns = {"/DeleteSalesmanServlet"})
public class DeleteSalesmanServlet extends HttpServlet {
    SalesmanService service = new SalesmanService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String scode = req.getParameter("id");
        String message = service.deleteSalesman(scode);
        String contextPath = req.getContextPath();
        if(message == null){
            //redirect to the List of Products page
            resp.sendRedirect(contextPath+"/ListSalesmanServlet");
        }else{
            //Forward the request to the jsp page
            req.setAttribute("minima", message);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/errorPage.jsp");
            dispatcher.forward(req, resp);
            //resp.getWriter().print(message);
        }
    }

   
    
}
