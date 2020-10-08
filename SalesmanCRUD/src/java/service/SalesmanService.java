/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.SalesmanDao;
import entity.Salesman;
import java.util.List;

/**
 *
 * @author kostis
 */
public class SalesmanService {
    
    SalesmanDao sdao = new SalesmanDao();
    
       public List<Salesman> getProducts(){
        return sdao.findAll();
    }
       
       
    public String deleteSalesman(String scode) {
        int code = Integer.parseInt(scode);
        String message = sdao.delete(code);
        return message;
    }
    
    public void createSalesman(String name, String city) {
        
        Salesman salesman = new Salesman(name, city);
        sdao.create(salesman);
    }
    
}
