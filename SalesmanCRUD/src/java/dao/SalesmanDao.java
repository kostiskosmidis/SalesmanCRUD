/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Salesman;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SalesmanDao extends SuperDao {
    private final String FINDALL = "SELECT * FROM salesman;";
    private final String DELETEBYID = "DELETE FROM salesman WHERE scode = ?";
    private final String CREATESALESMAN = "INSERT INTO salesman (sname, scity) VALUES (?, ?)";
    
    public List<Salesman> findAll() {
    List<Salesman> salesman = new ArrayList();
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn;
        try {
            conn = openConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(FINDALL);
            while (rs.next()) {
                int scode = rs.getInt(1);
                String sname = rs.getString(2);
                String scity = rs.getString(3);
                
                
                Salesman s = new Salesman(scode,sname,scity);
                salesman.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Salesman.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnections(stmt, rs);
        }
        return salesman;}
    
    
    public String delete(int code) {
        boolean deleted = false;
        String message = null;
        Connection con = null;
        PreparedStatement pstm = null;
        con = openConnection();    
        try {
            pstm = con.prepareStatement(DELETEBYID);
            pstm.setInt(1, code);//put variable code into question mark number 1.
            int result = pstm.executeUpdate();
            if(result > 0){
                deleted = true;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQLException:"+ex.getLocalizedMessage());
            message = ex.getLocalizedMessage();
        } finally{
            closeConnections(pstm, null);
        }
        return message;
    }
    
    public void create(Salesman salesman) {
//        boolean created = false;
//        String message = null;
        Connection con = null;
        PreparedStatement pstm = null;
        con = openConnection();    
        try {
            pstm = con.prepareStatement(CREATESALESMAN);
            pstm.setString(1, salesman.getSname());
            pstm.setString(2, salesman.getScity());
            pstm.executeUpdate();
//            if(result > 0){
//                created = true;
//            }
        } catch (SQLException ex) {
            //Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQLException:"+ex.getLocalizedMessage());
//            message = ex.getLocalizedMessage();
        } finally{
            closeConnections(pstm, null);
        }
    }
    
}
