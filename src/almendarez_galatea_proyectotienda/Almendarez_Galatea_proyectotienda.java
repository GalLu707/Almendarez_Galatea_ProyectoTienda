/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almendarez_galatea_proyectotienda;

import java.util.Scanner;

public class Almendarez_Galatea_proyectotienda {
    public static void main(String[] args) {
        
    //variables que tienen que ser "constantes"  
        Scanner obj = new Scanner(System.in);
        int opcion=0;
        double dinerocaja=0;
         double azucarcantidad=100, avenacantidad=0, trigocantidad=0,maizcantidad=0;//se necesitan estas
         double stock= azucarcantidad+avenacantidad+trigocantidad+maizcantidad;
         //precios de lis productos 
         final int  precioUazucar=30,precioUavena=25, precioUtrigo=32, precioUmaiz=20;
         //codigos de los productos dados 
         int codigoAzucar=1, codigoAvena=2, codigoTrigo=3, codigoMaiz=4;//estas tmb ocupo
         double Bancopro=0;
        System.out.println("Bienvenido a la caja registradora de tu tienda");
                       
      while (opcion !=6){ 
          
          //Variableeees que cambian con el while
      int compraazucar=0, compraavena=0, compratrigo=0, compramaiz=0; //junto con estas 
      int comprasxdia= 0;
      int ventasxdia=0;
      int produestrella;  
      double gastoenventas= 0;
      double ganancia=0;
      double cantidadventas=0, cantidadcompras=0;
      double pafactura=0;
      
       //interfaz que se repite1
    System.out.println("\n          ---Interfaz---");
    System.out.println("---1.Abrir caja");
    System.out.println("---2.Ventas");
    System.out.println("---3.Compras");
    System.out.println("---4.Reportes");
    System.out.println("---5.Cierre de caja");
    System.out.println("---6.Salir del sistema");
    System.out.println("---7. otras opciones \n");
    System.out.println("Ingrese la opcion a la que quiere ingresar");
    if (obj.hasNextInt()){ //verifica que la opcion sea valida
        opcion = obj.nextInt();
        obj.useDelimiter("\n");
      }else{
        System.out.println("opcion no valida, saliendo del sistema \n");
        opcion = obj.nextInt();  
    }
   

     switch(opcion){
        case 1://abrir caja--------------------------------------------------------------------------------
            System.out.println("---CAJA---");
               System.out.println("Cuanto dinero desea agregar a la caja?");
               double dineroagre= obj.nextDouble();
               dinerocaja += dineroagre;
           if (dineroagre <= 0){
               System.out.println("Tu cantidad es invalida, favor ingresar un numero valido");

           } else {
               System.out.println("su dinero actual es en caja es:." + dinerocaja+ "Lps."); 
           }
           break; 
           
           
           
        case 2://impuesto y descuento ya funcionan
            //---------------------------------------------------------------------------------------------
            //condicional por la cual pasa antes de pedir al usuario que ingrese lo demas 
            System.out.println("---VENTAS---");
            if(dinerocaja<=0 ){
                System.out.println("no puede acceder a esta funcion si no abrio caja primero");
                break;
            }else if(stock==0){
                    System.out.println("no dispone de productos, no se puede acceder a esta funcion\n");
                }
            //las variables que van a cambiar dentro de ventas
            
            double subtotal=0;
            
            
            //aqui ya pregunta el tipo de cliente para las demas condicionales 
            System.out.println("Que tipo de cliente es?(a/b/c)");
                String cliente= obj.next().toLowerCase();
                if (cliente.equals("a")||cliente.equals("b")||cliente.equals("c")){
                    System.out.println("lets gooo");//quitar antes del proyecto, soloes para que valide
            }else {
                    System.out.println("tipo de cliente invalido :p");
                    break;
                }
                
                String repe="si";
                //el whileeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee------------------------
                
                while(repe.equals("si")){
                    
                //hace el print de los objetos que se tienen
            System.out.println("|codigo| Producto | precio |"
                        + "\n|  1   | Azucar   |   30   |"
                        + "\n|  2   | Avena    |   25   |"
                        + "\n|  3   | Trigo    |   32   |"
                        + "\n|  4   | Maiz     |   20   |\n ");
                
            System.out.println("Introduzca el codigo del producto que desea comprar");
            int CodProd = obj.nextInt();    
            if (cliente.equals("c") && CodProd != 4 ){
                   System.out.println("no puede adquirir este producto :p"); 
                   break;
                }else if(cliente.equals("b") && CodProd >= 4 || CodProd <1){
                    System.out.println("codigo no valido");
                    break;
                }else if(cliente.equals("a") && CodProd >4 || CodProd<1){
                System.out.println("producto no valido");
                break;
        } 
            System.out.println("ingrese los kg que va a comprar del producto");
            double kgprod = obj.nextDouble();
            if(kgprod<=0){
                System.out.println("ingrese una cantidad valida de producto");
                break;
            }
            switch(CodProd){
                case 1: 
                  if(CodProd==codigoAzucar){//azucaaaaaaaaaar
                      
                      pafactura=precioUazucar*kgprod;
                      
                      if(kgprod>azucarcantidad){
                          System.out.println("los kg exceden la cantidad disponible de producto :(");
                          System.out.println(" producto disponible: "+ azucarcantidad);
                          break;
                      }
                      azucarcantidad= azucarcantidad -kgprod;
                      subtotal=subtotal + pafactura;
                      System.out.println("llevas"+ subtotal);
                     // System.out.println("subtotal actual"+ subtotal);
                      System.out.println("dondeeeeee"+ subtotal);
                      
                      System.out.println("cantidad de azucar"+ azucarcantidad);
                  }else if (CodProd==codigoAvena){ //avenaaaaaaaaaaaaa
                      
                      pafactura=precioUavena*kgprod;
                      
                      if(kgprod>avenacantidad){
                          System.out.println("los kg exceden la cantidad disponible de producto :(");
                          System.out.println(" producto disponible: "+ avenacantidad);
                          compraavena+= kgprod;
                          System.out.println("azucar comprada"+ compraazucar);
                          
                          break;
                      }
                      avenacantidad= avenacantidad -kgprod;
                      subtotal=subtotal + pafactura;
                      System.out.println("llevas"+ subtotal);
                     // System.out.println("subtotal actual"+ subtotal);
                      System.out.println("dondeeeeee"+ subtotal);
                      
                      System.out.println("cantidad de azucar"+ azucarcantidad);
                  } //----------------------
                case 2:
                    
                case 3:
                case 4:
                default: 
                    System.out.println("ingrese un codigo valido");
            }
            System.out.println("desea comprar mas productos?(si/no)");
            repe = obj.next().toLowerCase();
            if (repe.equals("no")){
            break;
            }
   
        }//falta añadir que quite eso a las cantidades, que se añada a caja y que diga si se puede realizar la compra y que retorne al while
            
           if(subtotal <= 0){
                break;
           }
           
            //Descuentos--------------------------------------------------------------------------------------
            //condicion ya para el subtotal y total, los if que se nececitan para aplicar esto
            double descuento=0;
            if (subtotal>5000){
                
                System.out.println("Su compra excede los 5000 lps, se agrega un despuesnto de 10%");
                double calcudes = subtotal* 0.10;
                descuento = subtotal-calcudes;
                System.out.println("descuento: " + calcudes);
                System.out.println("su nuevo subtotal es"+ descuento);
                
                
                break;
            }else if (subtotal>=1000){
                System.out.println("Su compra es de mas de 1000 lps, se le agrega un descuento del 5%\n");
                double calcudes = subtotal* 0.05;
                descuento = subtotal-calcudes;
                System.out.println("descuento: "+ calcudes);
                System.out.println("su nuevo subtotal es: "+ descuento);
                
               
                
            }else{
                System.out.println("su compra no excede los 999 lps, no aplica descuento");
                double calcudes = subtotal* 0.00;
                descuento = subtotal-calcudes;
                System.out.println("descuento: "+ calcudes );
        }
                 double impuesto= descuento *0.07;
                 //double impuesto = descuento + calcuim;//este creo que me esta tronando

                    
                    System.out.println("asegurar impuesto"+ impuesto );//quitarlo luegp
                    double total= descuento + impuesto;
                    dinerocaja= dinerocaja+total;
                    System.out.println("su total fue de: "+ total);
                    System.out.println("dinero en caja actual. "+ dinerocaja);
               
                    
            cantidadventas= cantidadventas+ total;
            ventasxdia++; 
            dinerocaja=+total;
            System.out.println("sus ventas esta ves fueron: "+ ventasxdia);
            break;

        case 3://compras-----------------------------------------------------------------------------------------------
            System.out.println("---Compras---");
            if(dinerocaja<=0){
                System.out.println("no puede acceder a esta funcion si no abrio caja primero");
                break;
            }
            
            
            //--------------------
            System.out.print("              *****productos disponibles****"
                    + "\n| Proveedor Tipo:a     | Proveedor Tipo:b     | Proveedor Tipo: c   |"
                    + "\n| cod:1. Azucar__lps.25| cod:2. Avena__lps.20 | cod:2. Avena__lps.22|"
                    + "\n| cod:4. Maiz____lps.18| cod:3. Trigo__lps.30 |                     |\n");
            System.out.println("\na que tipo de proveedor le va a comprar?(a/b/c)");
            String respuesta3 = obj.next().toLowerCase();
            if (respuesta3.equals("a")||respuesta3.equals("b")||respuesta3.equals("c")){
                
            }else 
                System.out.println("respuesta ");
            //---------------------
           System.out.println("Ingrese el codigo del producto que desea comprar");
            int codigopro = obj.nextInt();
           
            
            switch(respuesta3){
                case "a":
                case "b":
                case "c":
                   if(respuesta3.equals("a") && (codigopro==2 || codigopro== 3)){
                System.out.println("no puede comprar este producto"); 
            }else if(respuesta3.equals("b") && (codigopro==1 || codigopro==4)){
                System.out.println("no puede comprar este producto");
            }else if(respuesta3.equals("c") && (codigopro==1 || codigopro== 3 || codigopro==4)){
                System.out.println("no puede comprar este producto");
            }else{
                       System.out.println("Su producto fue ingresado con exito");
            }
                   
                default:
                    System.out.println("elija una opcion valida...");
                    
                  break;         
            }
               /*if(){
                   System.out.println("ingrese la cantidad del producto que va a comprar (kg.)");
            float cantidadProduc= obj.nextFloat();

               }*/
               comprasxdia++;
            break;

        case 4://reportes-----------------------------------------------------------------------------------------------
            if(ventasxdia==0 || comprasxdia==0){
                System.out.println("necesita al menos una compra o venta para crear un reporte :( ");
                break;
            }
            System.out.println("REPORTES-------------------------");
            System.out.println("Dinero actual en la caja: " + dinerocaja);
            System.out.println("---------------------------------");
            System.out.println("Numero de compras realizadas en el dia: " + comprasxdia);
            System.out.println("Numero de ventas realizadas en el dia: " + ventasxdia );
            System.out.println("---------------------------------");
            while(ventasxdia<0){
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
                   System.out.println("su producto estrella fue"+ produestrella +"con "+ compramaiz + " ventas");  
                
            }
            }
           
            
            break;
        case 5://cierre de caja-----------------------------------------------------------------------------------------
            System.out.println("---CIERRE DE CAJA---\n");
            if(dinerocaja<=0){
                System.out.println("opcion invalida, todavia no hizo nadota en caja");
                break;
                
            }
            System.out.println("desea ingresar dinero al banco?(si/no)");
            String respuestabanco = obj.next().toLowerCase(); 
            //el orden de los factores no altera el fucking producto
            double maximoban= dinerocaja*60/100;
             //se explica por si mismo es el limite de dinero que se puede ingresar en el banco 
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
                    
            }//termina el swt-
            break;
        case 6://salir del sistema-----------------------------------------------------------------------------------
            System.out.println("chaoooo ");
            break;
            
        case 7://opciones que yo a preferencia puse porque si y para mayor comdidad 
            //------------------------------------------------------------------------------------------------

            System.out.println("a que opcion desea entrar??");
            System.out.println("8.Stock");//productos que se disponen
            System.out.println("9.$$Banco$$");
            int opcion7=obj.nextInt();
            if(opcion7 == 8){
                
                System.out.println("----------------\n los productos de los que dispone son:\n---------------- \nAzucar:"+ azucarcantidad +"\nAvena:"+ avenacantidad + "\nTrigo:"+ trigocantidad +"\nMaiz:"+ maizcantidad+ "\n----------------");
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
  
