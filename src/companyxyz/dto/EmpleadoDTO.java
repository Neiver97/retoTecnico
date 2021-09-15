/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyxyz.dto;

/**
 *
 * @author nate
 */
public class EmpleadoDTO {
    
    public String nombre;
    public int edad;
    public double salario;
    public double bonificacion;
    public String cadena;
    
    public EmpleadoDTO() {
    }

    public EmpleadoDTO(String nombre, int edad, double salario, double bonificacion, String cadena) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.bonificacion=bonificacion;
        this.cadena=cadena;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
    
}
