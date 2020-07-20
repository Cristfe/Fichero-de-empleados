/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CristianIvan;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Crist
 */
public class Empleado {



  


     private int idEmpleado;
    private String nombre;
    private String Apellidos;
    private String trabajo;
    private int salario;
    private String nombreDepartamento;
   

    public Empleado (int idEmpleado, String nombre, String Apellidos, String trabajo, int Salario, String nombreDepartmento) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.trabajo = trabajo;
        this.salario = Salario;
        this.nombreDepartamento = nombreDepartamento;
    }

    public Empleado () {
    }

    Empleado(int idEmpleado, String nombre, String apellidos, String trabajo, int salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public int getidEmpleado(){
            return idEmpleado;
        }
        public void setidEmpleado(int idEmpleado){
            this.idEmpleado = idEmpleado;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return Apellidos;
        }

        public void setApellidos(String Apellidos) {
            this.Apellidos = Apellidos;
        }

        public String gettrabajo() {
            return trabajo;
        }

        public void settrabajo(String trabajo) {
            this.trabajo = trabajo
                    ;
        }

        public int getSalario() {
            return salario;
        }
        public void setSalario(int Salario) {
            this.salario = Salario;
        }
        
        public String getnombreDepartamento(){
            return nombreDepartamento;
        }

        public void setnombreDepartamento(String nombreDepartamento) {
            this.nombreDepartamento = nombreDepartamento;
        }

    @Override
        public String toString(){
            return "ID Empleado: "+idEmpleado+"Nombre: "+nombre+"Apellidos: "+Apellidos+"Trabajo: "+trabajo+"Salario: "+salario+"Nombre Departamento: "+nombreDepartamento;
        }

} 

   