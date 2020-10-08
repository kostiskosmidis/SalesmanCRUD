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
@WebServlet(name = "CreateSalesmanServlet", urlPatterns = {"/CreateSalesmanServlet"})
public class CreateSalesmanServlet extends HttpServlet {
    
    SalesmanService service = new SalesmanService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/salesman/SalesmanCreateForm.jsp");
        dispatcher.forward(req, resp);
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String city = req.getParameter("city");
        service.createSalesman(name, city);//Store Product in DB
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath+"/ListSalesmanServlet");
    }

   
   
  

}
