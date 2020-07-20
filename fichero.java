/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CristianIvan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Crist
 */
class fichero {
    ArrayList<Empleado> list = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        File fichero = new File("C:\\TareaColaborativa\\empleado.txt");
        fichero fi = new fichero();
        Scanner scan = new Scanner(System.in);
        
 
            while(true){
                System.out.println("Guardar [1] ");
                System.out.println("Listar [2] ");
                System.out.println("Buscar [3] ");
                System.out.println("Borrar [4] ");
                System.out.println("Introduzca opción:  ");
                int n = scan.nextInt();
                
                switch(n){
                    case 1:
                        System.out.print("ID Empleado: ");
                        int idEmpleado = scan.nextInt();
                        System.out.print("Nombre: ");
                        String nombre = scan.next();
                        System.out.print("Apellidos: ");
                        String apellidos = scan.next();
                        System.out.print("trabajo: ");
                        String trabajo = scan.next();
                        System.out.print("Salario: ");
                        int salario = scan.nextInt();
                        System.out.print("Nombre Departamento: ");
                        String nombreDepartamento = scan.next();
                       fi.guardar(new Empleado(idEmpleado, nombre, apellidos, trabajo, salario, nombreDepartamento));
                       
                        
                        break;

                
                    case 2:
                        fi.listar();
                        break;
                   
                    case 3:
                        System.out.print("Empleado para buscar: ");
                       
                        Empleado e = fi.buscar(scan.next());
                        if(e !=null)
                            System.out.println(e);
                        else
                            System.out.println("No se ha encontrado");
                        break;

                        
                       
                
                    case 4:
                        System.out.print("ID empleado para borrar: ");
                        Empleado b = fi.buscar(scan.next());
                        
                        if(b !=null){
                            fi.borrar(b);
                        }else{
                            System.out.println("No se ha encontrado");
                        }
                        
                        
                        break;



                    case 0:
                        System.exit(0);
                }
            }
    }
        public void guardar(Empleado e) throws FileNotFoundException, IOException{
    list.add(e); 
    
}
    
public void listar() throws FileNotFoundException, IOException{
    System.out.println("Lista");
    list.forEach((e) -> { 
        System.out.println(e);
        });
}  
public Empleado buscar(String nombre){
    for(Empleado e : list){
     if(e.getNombre().equals(nombre))
      return e;
}
return null;
}
public void borrar(Empleado b){
    if(list.contains(b)){
     list.remove(b);
    }
}
}




