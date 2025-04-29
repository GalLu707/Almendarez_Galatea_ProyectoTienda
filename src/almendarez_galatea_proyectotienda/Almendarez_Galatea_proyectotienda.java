/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almendarez_galatea_proyectotienda;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Almendarez_Galatea_proyectotienda {
    public static void main(String[] args) {
        //variables y constantes 
        
        //print de las opciones que tiene el usuario
        System.out.println("Bienvenido a la caja registradora de tu tienda");
        System.out.println("Ingrese la opcion a la que quiere ingresar \n1.Abrir caja \n2.Ventas \n3.Compras \n4.Reportes \n5.Cierre de caja \n6.Dalir del sistema");
        //opcion que elije el usuario 
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese su opcion aqui");
        int opciones = obj.nextInt(); 
        switch (opciones){
            case 1: 
                System.out.println("when eres papu pro");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default: 
                System.out.println("Por favor ingrese una opcion valida");
                         
      
        }
        }
      
               
    }
    
