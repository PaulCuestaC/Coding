/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica1.pkg2_quizhpiguerreromario;

/**
 *
 * @author USUARIO
 */
public class Empresa {
    int ruc;
    String razonSocial;
    Empleado e1;

    public Empresa() {
    }
    
    

    public Empresa(int ruc, String razonSocial, Empleado e1) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.e1 = e1;
    }
    
    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Empresa{" + "ruc=" + ruc + ", razonSocial=" + razonSocial + '}';
    }
    
    
    
    
    
}
