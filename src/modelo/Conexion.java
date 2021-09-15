/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import companyxyz.dto.ComercialDTO;
import companyxyz.dto.EmpleadoDTO;
import companyxyz.dto.RepartidorDTO;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.io.Writer;
import java.util.ArrayList;
/**
 *
 * @author nate
 */
public class Conexion {

    RepartidorDTO repDTO;
    ComercialDTO comDTO;
    CsvWriter salidaCSV;
    String salidaArchivo;
    
    public Conexion() {
        this.createFile();
        
    }
    
    public void createFile(){
       salidaArchivo = "Empleado.csv";
       
        try {
            //Creo el archivo de forma global
         salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
         salidaCSV.endRecord();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void fillFileRepartidor(List<RepartidorDTO> repListDTO){
        
        try {
            for (RepartidorDTO repartidorDTO : repListDTO) {
                salidaCSV.write(repartidorDTO.getNombre());
                salidaCSV.write(Integer.toString(repartidorDTO.getEdad()));
                salidaCSV.write(String.valueOf(repartidorDTO.getSalario()));
                salidaCSV.write(String.valueOf(repartidorDTO.bonificacion));
                salidaCSV.write(Integer.toString(repartidorDTO.zona));
                salidaCSV.write(repartidorDTO.getCadena());
                
                salidaCSV.endRecord();
            }
            salidaCSV.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    } 
    
    public void fillFileComercial(List<ComercialDTO> comListDTO){
        
        try {
            for (ComercialDTO comercialDTO : comListDTO) {
                salidaCSV.write(comercialDTO.getNombre());
                salidaCSV.write(Integer.toString(comercialDTO.getEdad()));
                salidaCSV.write(String.valueOf(comercialDTO.getSalario()));
                salidaCSV.write(String.valueOf(comercialDTO.bonificacion));
                salidaCSV.write(String.valueOf(comercialDTO.comision));
                salidaCSV.write(comercialDTO.getCadena());
                
                salidaCSV.endRecord();
            }
            salidaCSV.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    public List showInformation(){
        List<EmpleadoDTO> datosEmpleados =new ArrayList<>();
                
        CsvReader leerEmpleados;
        
        try {
            leerEmpleados = new CsvReader(salidaArchivo);
            while (leerEmpleados.readRecord()) {    
                String nombre= leerEmpleados.get(0);
                int edad= Integer.parseInt(leerEmpleados.get(1));
                double salario= Double.parseDouble(leerEmpleados.get(2));
                double bonificacion= Double.parseDouble(leerEmpleados.get(3));
                String cadena = leerEmpleados.get(5);
                                
                datosEmpleados.add(new EmpleadoDTO(nombre, edad, salario, bonificacion,cadena));
            }
            
            leerEmpleados.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return datosEmpleados;
    }
}
