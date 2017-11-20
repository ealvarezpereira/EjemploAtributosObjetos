/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploatributosobjetos;

/**
 *
 * @author quique
 */
public class Cuenta {
    
    private Personas titular;
    private double saldo;
    
    public Cuenta(){   
            titular = new Personas();
    }
    
    public Cuenta(String nom, String DNI, double saldo){   
        titular = new Personas();
        titular.setNombre(nom);
        titular.setDNI(DNI);
        this.saldo = saldo;    
    }
    
    public void setTitular (Personas titular){    
        this.titular= titular;    
    }
    
    public Personas getTitular(){    
        return titular;        
    }
    
    public void setSaldo(double saldo){    
        this.saldo = saldo;    
    }
    
    public double getSaldo(){    
        return saldo;    
    }
    
    
    @Override
    public String toString(){
    
        return "Titular= "+titular.getNombre()+ "  Saldo= " +saldo+"  Titular= "+titular.getDNI();
    
    }
    
}