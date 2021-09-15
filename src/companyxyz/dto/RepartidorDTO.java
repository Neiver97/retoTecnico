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
public class RepartidorDTO extends EmpleadoDTO{
    
    public int zona;
    
    public RepartidorDTO (String nombre, int edad, double salario, int zona,double bonificacion, String cadena){
        this.nombre = nombre;
        this.edad = edad;
        this.salario=salario;
        this.zona=zona;
        this.bonificacion=bonificacion;
        this.cadena=cadena;
    }
    

}
