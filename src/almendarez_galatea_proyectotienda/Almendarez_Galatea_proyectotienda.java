/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almendarez_galatea_proyectotienda;

import java.util.Scanner;

public class Almendarez_Galatea_proyectotienda {
    public static void main(String[] args) {
        
    
        Scanner obj = new Scanner(System.in);
        int opcion=0;
        double dinerocaja=0;
         double azucarcantidad=0, avenacantidad=0, trigocantidad=0,maizcantidad=0;
         //precios de lis productos 
         final int  precioUazucar=30,precioUavena=25, precioUtrigo=32, precioUmaiz=20;
         //codigos de los productos dados 
         int codigoAzucar=1, codigoAvena=2, codigoTrigo=3, codigoMaiz=4;
         double Bancopro=0;
         boolean si =true;
         boolean no=false;
        System.out.println("Bienvenido a la caja registradora de tu tienda");
                       
      while (opcion !=6){ 
          
          
      int compraazucar=0, compraavena=0, compratrigo=0, compramaiz=0;
      int comprasxdia= 0;
      int ventasxdia=0;
      int produestrella;  
          
       //interfaz que se    
    System.out.println("---Interfaz---");
    System.out.println("1.Abrir caja");
    System.out.println("2.Ventas");
    System.out.println("3.Compras");
    System.out.println("4.Reportes");
    System.out.println("5.Cierre de caja");
    System.out.println("6.Salir del sistema");
    System.out.println("7. otras opciones ");
    System.out.println("\nIngrese la opcion a la que quiere ingresar");
    if (obj.hasNextInt()){ //verifica que la opcion sea valida
        opcion = obj.nextInt();
        obj.useDelimiter("\n");
      }else{
        System.out.println("opcion no valida, saliendo del sistema \n");
        opcion = obj.nextInt();  
    }
   
        
     
         

     switch(opcion){
        case 1://abrir caja
               System.out.println("Cuanto dinero desea agregar a la caja?");
               double dineroagre= obj.nextDouble();
               dinerocaja += dineroagre;
           if (dineroagre <= 0){
               System.out.println("Tu cantidad es invalida, favor ingresar un numero valido");

           } else {
               System.out.println("su dinero actual es en caja es:." + dinerocaja+ "Lps."); 
           }
           break; 
        case 2://ventas falta que se pueda hacer una venta como tal, faltan los impuestos y el descuento
            if(dinerocaja<=0){
                System.out.println("no puede acceder a esta funcion si no abrio caja primero");
                break;
                
                
                
            }else{
                System.out.println("desea hacer una compra?(si/no)");
                String compraono = obj.next().toLowerCase();
                while (compraono=="si"){
                    
                    System.out.println("Que tipo de cliente es?(a/b/c)");
                String cliente= obj.next().toLowerCase();
                System.out.println("|codigo| Producto | precio |"
                        + "\n|  1   | Azucar   |   30   |"
                        + "\n|  2   | Avena    |   25   |"
                        + "\n|  3   | Trigo    |   32   |"
                        + "\n|  4   | Maiz     |   20   |");
                System.out.println("Introduzca el codigo del producto que desea comprar");
                int CodProd = obj.nextInt();
               System.out.println("funcion en progreso papu");
  
               }
            //definir cual fue el producto estrella
            if (compraazucar>compraavena && compraazucar> compratrigo && compraazucar>compramaiz){
                
                produestrella=compraazucar;
                System.out.println("su produccto estrella fue el azucar con "+ compraazucar + "ventas");
            }else if(compraavena>compratrigo && compraavena>compramaiz){
                
                produestrella=compraavena;
                System.out.println("su produccto estrella fue la avena con "+ compraavena + "ventas");
            }else if(compratrigo >compramaiz){
                
                produestrella=compratrigo;
                System.out.println("su produccto estrella fue el trigo con "+ compratrigo + "ventas");
            }else{
                produestrella=compramaiz;
                System.out.println("su producto estrella fue el maiz con "+ compramaiz + "ventas");
            }
   
                    
                }
                
                
            break;

        case 3://compras
            if(dinerocaja<=0){
                System.out.println("no puede acceder a esta funcion si no abrio caja primero");
                break;
            }
            
            System.out.print("              *****productos disponibles****"
                    + "\n| Proveedor Tipo:a     | Proveedor Tipo:b     | Proveedor Tipo: c   |"
                    + "\n| cod:1. Azucar__lps.25| cod:2. Avena__lps.20 | cod:2. Avena__lps.22|"
                    + "\n| cod:4. Maiz____lps.18| cod:3. Trigo__lps.30 |                     |\n");
            System.out.println("\na que tipo de proveedor le va a comprar?(a/b/c)");
            String respuesta3 = obj.next().toLowerCase();
            System.out.println("Ingrese el codigo del producto que desea comprar");
            int codigopro = obj.nextInt();
            switch(respuesta3){
                case "a": 
                    if( codigopro==codigoAvena || codigopro==codigoTrigo ){
                        System.out.println("no puedes comprar este producto");
                    }
                    break;
                case "b":
                    if(codigopro==codigoAzucar || codigopro==codigoMaiz ){
                        System.out.println("no puedes comprar este producto");
                    }
                    break;
                case "c":
                    if(codigopro==codigoAzucar || codigopro==codigoTrigo || codigopro==codigoMaiz ){
                        System.out.println("no puedes comprar este producto");
                    }
                    break;
                    
                default: 
                    System.out.println("su opcion no es valida, saliendo de compras");
                    break;
            }
            System.out.println("ingrese la cantidad del producto que va a comprar (kg.)");
            float cantidadProduc= obj.nextFloat();
            

        case 4://reportes
            System.out.println("REPORTES----");
            System.out.println("Dinero actual en la caja: " + dinerocaja);
            System.out.println("Numero de compras realizadas en el dia: " + comprasxdia);
            System.out.println("Numero de ventas realizadas en el dia. " + ventasxdia );
            
            break;
        case 5://cierre de caja
            if(dinerocaja<=0){
                System.out.println("opcion invalida, todavia no hizo nadota en caja");
                break;
                
            }
            System.out.println("desea ingresar dinero al banco?(si/no)");
            String respuestabanco = obj.next().toLowerCase(); 
            double maximoban= dinerocaja*60/100;
            
            switch(respuestabanco){
                case "si":
                     System.out.println("cuanto dinero desea ingresar al banco??");
                double ingresabanco= obj.nextDouble();
                if(ingresabanco>maximoban){
                    System.out.println("su cantidad excede el limite que puede ingresar en el banco");
                }else{
                    System.out.println("su dinero fue ingresado correctamente, su saldo actual en el banco es: "+ ingresabanco);
                    dinerocaja= dinerocaja - ingresabanco ;}
                    System.out.println("tu dinero en caja es" + dinerocaja);
                    Bancopro= ingresabanco + Bancopro;
                
                    break;
                case "no":
                    System.out.println("Si okay, entiendo :,v");
                    
                    break;
                    
                default: 
                    System.out.println("opcion invalida, saliendo de cierre de caja");
                    
                    break;
                    
            }//termina el swt
            break;
        case 6://salir del sistema
            System.out.println("chaoooo ");
            break;
        case 7:

            System.out.println("a que opcion desea entrar:");
            System.out.println("8.Stock");
            System.out.println("9.Banco");
            int opcion7=obj.nextInt();
            if(opcion7 == 8){
                System.out.println("los productos de los que dispone son: \nAzucar:"+ azucarcantidad +"\nAvena:"+ avenacantidad + "\nTrigo:"+ trigocantidad +"\nMaiz:"+ maizcantidad);
            }else if (opcion7 == 9){
                System.out.println("La cantidad que tiene actualmente en el banco es de:"+ Bancopro+" lps");
                if(Bancopro>1000000){
                    System.out.println("El banco a empezado a sospechar que tu tienda se involucra en alguna actividad ilegal ");
                }
                    break;
                    }
            break;
        }
     }
   
    }
}
  
