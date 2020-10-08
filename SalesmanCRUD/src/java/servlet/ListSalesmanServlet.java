/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.Salesman;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ListSalesmanServlet", urlPatterns = {"/ListSalesmanServlet"})
public class ListSalesmanServlet extends HttpServlet {
    
    private SalesmanService service = new SalesmanService();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        List<Salesman> listOfSalesman = service.getProducts();
        
         req.setAttribute("salesman", listOfSalesman);
        
         RequestDispatcher dispatcher = req.getRequestDispatcher("/salesman/salesmanList.jsp");
         dispatcher.forward(req, resp);
        
    }

   
    

}
