/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author kostis
 */
public class Salesman {
    private int scode;
    private String sname;
    private String scity;
    private double scomm;

    public Salesman() {
    }

    public Salesman(String sname, String scity) {
        this.sname = sname;
        this.scity = scity;
    }

    
    
    public Salesman(int scode, String sname, String scity) {
        this.scode = scode;
        this.sname = sname;
        this.scity = scity;
    }

    
    
    public Salesman(int scode, String sname, String scity, double scomm) {
        this.scode = scode;
        this.sname = sname;
        this.scity = scity;
        this.scomm = scomm;
    }

    public int getScode() {
        return scode;
    }

    public void setScode(int scode) {
        this.scode = scode;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    public double getScomm() {
        return scomm;
    }

    public void setScomm(double scomm) {
        this.scomm = scomm;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
