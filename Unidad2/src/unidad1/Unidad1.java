/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

/**
 *
 * @author ctanner
 */
import java.util.Scanner;

public class Unidad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 //nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza, 
 //luego deberá mostrarse por consola los datos ingresados.
Scanner lector= new Scanner(System.in);
System.out.println("Ingresar el nombre del alumno");
String nombres=lector.next();   // le asigno lo que cargo el usuario por pantalla
System.out.println("Ingresar el apellido del alumno");
String apellido=lector.next();   // le asigno lo que cargo el usuario por pantalla
System.out.println("Ingresar la edad del alumno");

//Uso  el objeto Integer para parsear string y obtener un entero
int edad=Integer.parseInt(lector.next());
System.out.println("Ingresar el hobbie del alumno ");
String hobbie=lector.next();   // le asigno lo que cargo el usuario por pantalla
System.out.println("Ingresar el editor de códigos preferido");
String editor=lector.next();   // le asigno lo que cargo el usuario por pantalla
System.out.println("Ingresar el S.O. que utiliza");
String so=lector.next();   // le asigno lo que cargo el usuario por pantalla


//Imprimo valores ingresados

System.out.println("Alumno Nombres: " + nombres);
System.out.println("       Apellido: " + apellido);
//Uso  el objeto Integer para parsear el entero y pasar a string
System.out.println("       Edad: " + Integer.toString(edad));
System.out.println("       hobbie: " + hobbie);
System.out.println("       editor: " + editor);
System.out.println("       S.O. utilizado: " + so);

    }
    
}
