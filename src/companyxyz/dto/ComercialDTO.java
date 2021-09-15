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
public class ComercialDTO extends EmpleadoDTO{
    
    public double comision;

    
    public ComercialDTO (String nombre, int edad, double salario, double comision, double bonificacion, String cadena){
        this.nombre = nombre;
        this.edad = edad;
        this.salario=salario;
        this.comision=comision;
        this.bonificacion=bonificacion;
        this.cadena= cadena;
    }
    
            
}
