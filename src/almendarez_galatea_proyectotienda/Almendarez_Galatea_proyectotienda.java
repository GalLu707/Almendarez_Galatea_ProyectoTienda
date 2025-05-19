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
        
        //determinar cual fue mayor sin que tenga mas cosos de por medio o sea procesos
        double azucarcompraa=0, avenacompraa=0, trigocomprao=0, maizcomprao=0;
        double gastoazucar=0, gastoavena=0, gastotrigo=0, gastomaiz=0;
        
         double azucarcantidad=0, avenacantidad=0, trigocantidad=0,maizcantidad=0;//estas variables 
         
         //precios de los productos 
         final int  precioUazucar=30,precioUavena=25, precioUtrigo=32, precioUmaiz=20;
         //codigos de los productos dados 
         int codigoAzucar=1, codigoAvena=2, codigoTrigo=3, codigoMaiz=4;
         double Bancopro=0;
         //abir y cerrar caja
         boolean cajaabi = true;
        System.out.println("Bienvenido a la caja registradora de tu tienda");
        double comprasxdia = 0;//compras realizadas al dia 
        double ventasxdia = 0;//ventas realizadas    
        double gastoencompras = 0;
        double cantidadventas = 0;
        double ganancia = 0;
        int cajaabierta=0;
        
      while (opcion !=6){ 
          
          //Variableeees que cambian con el while
      double stock= azucarcantidad+avenacantidad+trigocantidad+maizcantidad;    
      double compraazucar=0, compraavena=0, compratrigo=0, compramaiz=0; 
      double produestrella;  
      
      
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
    System.out.println("Ingrese la opcion a la que desea entrar");
   
    if (obj.hasNextInt()){ //verifica que la opcion sea valida
        opcion = obj.nextInt();
        obj.useDelimiter("\n"); //?? no recuerdo para que lo puse 
      }else{
        System.out.println("opcion no valida, saliendo del sistema \n");
        opcion = obj.nextInt();  
    }
   

     switch(opcion){
        case 1://abrir caja--------------------------------------------------------------------------------
            if(opcion == 1){
                cajaabi=true;
               
            }
            System.out.println("---CAJA---");
            if(cajaabierta<=0){
               System.out.println("Cuanto dinero desea agregar a la caja?");
               double dineroagre= obj.nextDouble();
               dinerocaja += dineroagre; 
             if (dineroagre <= 0){
               System.out.println("Tu cantidad es invalida, favor ingresar un numero valido");

           }   
               
               
            }
               
           else {
               System.out.println("su dinero actual es en caja es:." + dinerocaja+ "Lps."); 
           }
            if (cajaabierta >= 1) {
                System.out.println("desea agregar dinero a caja (si/no)");
                String añadirplata = obj.next();
                if (añadirplata.equals("si")) {
                    System.out.println("ingrese la cantidad de dinero que quiere agregar");
                    double masplata = obj.nextDouble();
                    if (masplata <= 0) {
                        System.out.println("ingrese una cantidad valida");
                    } else {
                        System.out.println("el dinero se ingreso correctamente");
                        dinerocaja += masplata;
                        break;
                    }

                }
            }

                
           cajaabierta++;
           break; 
           
           
           
        case 2://impuesto y descuento ya funcionan creo
            
            ///VENTAAAAAAAAS
            //---------------------------------------------------------------------------------------------
            //condicional por la cual pasa antes de pedir al usuario que ingrese lo demas 
            System.out.println("---VENTAS---");
            if(!cajaabi){
                System.out.println("abra caja primero... ");
                break;
            }
            if(dinerocaja<=0 ){
                System.out.println("no puede acceder a esta funcion si no abrio caja primero");
                break;
            }else if(stock<=0){
                    System.out.println("no dispone de productos, no se puede acceder a esta funcion\n");
                            break;
                }
            //las variables que van a cambiar dentro de ventas
            
            double subtotal=0;
            
            
            //aqui ya pregunta el tipo de cliente para las demas condicionales 
            System.out.println("----Que tipo de cliente es?(a/b/c)---");
                String cliente= obj.next().toLowerCase();
                if (cliente.equals("a")||cliente.equals("b")||cliente.equals("c")){
                    System.out.println("lets gooo");//quitar antes del proyecto, soloes para que valide
            }else {
                    System.out.println("tipo de cliente invalido :p, volviendo a interfaz");
                    break;
                }
                
                String repe="si";
                //el whileeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee------------------------
                
                while(repe.equals("si")){
                    
                //hace el print de los objetos que se tienen
            System.out.println("|codigo| Producto | precio |cliente|"
                        + "\n|  1   | Azucar   |   30   |  a/b  |"
                        + "\n|  2   | Avena    |   25   |  a/b  |"
                        + "\n|  3   | Trigo    |   32   |  a/b  |"
                        + "\n|  4   | Maiz     |   20   |  a/c  |\n ");
            //Validacion de productos que puede comprar el usuario
            System.out.println("----Introduzca el codigo(numero) del producto que desea comprar----");
            int CodProd = obj.nextInt();    
            if (cliente.equals("c") && CodProd != 4 ){
                   System.out.println("no puede adquirir este producto :p, volviendo a interfaz"); 
                   break;
                }else if(cliente.equals("b") && CodProd >= 4 || CodProd <1){
                    System.out.println("no puede adquirir este producto, volviendo a interfaz");
                    break;
                }else if(cliente.equals("a") && CodProd >4 || CodProd<1){
                System.out.println("producto no valido, volviendo a interfaz...");
                break;
        }
                    System.out.println("");
            System.out.println("----ingrese los kg que va a comprar del producto----");
                    System.out.println("(si introduce un decimal en vez de punto(.) use coma(,))");
                    System.out.println("(si ingresa un dato invalido se factura automaticamente)");
            float kgprod = obj.nextFloat();
            //valida que no vaya a ser menor de cero
            if(kgprod<=0){
                System.out.println("ingrese una cantidad valida de producto");
                break;
            } 
            //switch para el proceso de cada cosa
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
                      //System.out.println("llevas"+ subtotal);
                      
                      System.out.println("cantidad de azucar "+ azucarcantidad);
                      compraazucar= compraazucar + kgprod;
                      azucarcompraa= kgprod + azucarcompraa;
                      
                  }
                  
                case 2:
                    if (CodProd==codigoAvena){ //avenaaaaaaaaaaaaa
                      
                      pafactura=precioUavena*kgprod;//
                      
                      if(kgprod>avenacantidad){
                          System.out.println("los kg exceden la cantidad disponible de producto :(");
                          System.out.println(" producto disponible: "+ avenacantidad);
                          compraavena+= kgprod;
                          System.out.println("avena comprada"+ compraavena);
                          avenacompraa= avenacompraa+subtotal;
                          break;
                      }                      

                      avenacantidad= avenacantidad -kgprod;
                      subtotal=subtotal + pafactura;
                      //System.out.println("llevas"+ subtotal);
                      
                      System.out.println("cantidad de avena"+ avenacantidad);
                      compraavena=compraavena + kgprod;
                      avenacompraa= avenacompraa+subtotal;
                  }
                    
                case 3:
                    if (CodProd==codigoTrigo){ //trigoooooooooooooo
                      
                      pafactura=precioUtrigo*kgprod;//cambiar
                      
                      if(kgprod>trigocantidad){
                          System.out.println("los kg exceden la cantidad disponible de producto :(");
                          System.out.println(" producto disponible: "+ trigocantidad);
                          compratrigo+= kgprod;
                        
                  
                          
                          break;
                      }
                      trigocantidad= trigocantidad -kgprod;
                      subtotal=subtotal + pafactura;
                      //System.out.println("llevas"+ subtotal);
                      
                      System.out.println("cantidad de trigo"+ trigocantidad);
                      compratrigo= compratrigo+ kgprod;
                      trigocomprao= trigocomprao+subtotal;
                  }
                    
                case 4:
                    if (CodProd==codigoMaiz){ //finally maiz
                      
                      pafactura=precioUmaiz*kgprod;
                      
                      if(kgprod>maizcantidad){
                          System.out.println("los kg exceden la cantidad disponible de producto :(");
                          System.out.println(" producto disponible: "+ maizcantidad);
                          compramaiz+= kgprod;
                          System.out.println("maiz comprado"+ compramaiz);
                          
                          break;
                      }
                      maizcantidad=  maizcantidad -kgprod;
                      subtotal=subtotal + pafactura;
                      //System.out.println("llevas"+ subtotal);
                      compramaiz=compramaiz+kgprod;
                      maizcomprao=maizcomprao+subtotal;
                  }
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
            //
            //    facturacion
            //
                 System.out.println("-------FACTURA------ ");
                    if(compraazucar>0){
                        System.out.println("azucar: "+ compraazucar + "kg");
                        System.out.println("precio de la azucar: "+ precioUazucar+ ".Lps");
                    } 
                      
                    if(compraavena>0){
                        System.out.println("avena: "+ compraavena+ "kg");
                        System.out.println("precio de la avena: "+ precioUavena+ ".Lps");
                    }
                        
                    if(compratrigo>0){
                        System.out.println("trigo: "+ compratrigo+ "kg");
                        System.out.println("precio del trigo: "+ precioUtrigo + ".Lps");
                    }
                        
                    if(compramaiz>0){
                        System.out.println("maiz: "+ compramaiz+"kg");
                System.out.println("precio del maiz: " + precioUmaiz + ".Lps");
            }
            double desc = subtotal - descuento;
            
            System.out.println("subtotal: " + subtotal);

            System.out.println("su descuento es de:" + desc + "lps.");
            double impuesto = descuento * 0.07;
            //double impuesto = descuento + calcuim;//este creo que me esta tronando

            System.out.println("\n\nimpuesto del 7%");
            System.out.println("total del impuesto:%.2f%n" + impuesto + " .LPS");//quitarlo luegp
            
            double total = descuento + impuesto;

            System.out.println("\nsu total fue de: " + total + ".Lps");


            ganancia=ganancia+total;     
            cantidadventas= cantidadventas + total;
            ventasxdia++; 
            dinerocaja=dinerocaja+total;
           
            break;

        case 3://compras-----------------------------------------------------------------------------------------------
            if(opcion==3 && !cajaabi)
            {
                
                System.out.println("abra caja primero");
                break;
            }
            System.out.println("---Compras---");
            if(dinerocaja<=0){
                System.out.println("no puede acceder a esta funcion si no abrio caja primero");
                break;
            }
            
            
            //--------------------
            System.out.print("              *****productos disponibles****"
                    + "\n| Proveedor Tipo:a     | Proveedor Tipo:b     | Proveedor Tipo: c   |"
                    + "\n|----------------------|----------------------|---------------------|"
                    + "\n|codigo |    producto  |codigo |    producto  |codigo |  producto   |"
                    + "\n|----------------------|----------------------|---------------------|"
                    + "\n|   1   |Azucar__lps.25|   2   | Avena__lps.20| cod:2.|Avena__lps.22|"
                    + "\n|   4   |Maiz____lps.18|   3   |Trigo__lps.30 |       |              |\n");
            
            System.out.println("\na que tipo de proveedor le va a comprar?(a/b/c)");
            String respuesta3="lol";
            while(respuesta3 != "a" ||respuesta3 != "b" ||"c" != respuesta3){  
               respuesta3= obj.next().toLowerCase();
                if (respuesta3.equals("a")||respuesta3.equals("b")||respuesta3.equals("c")){
                break;
            }else{
                    System.out.println("proveedor no valido");
                    System.out.println("vuelva a ingresar el tipo de proveedor");
            }
            }
            //---------------------compra del producto
           System.out.println("Ingrese el codigo del producto que desea comprar");
            int codigopro = obj.nextInt();
          
            
           //valida si el proveedor tiene el producto
                   if(respuesta3.equals("a") && (codigopro != 1 && codigopro!= 4)){
                System.out.println("no puede comprar este producto, el proveedor no tiene tal producto"); 
                System.out.println("saliendo de compras...");
                break;
            }else if(respuesta3.equals("b") && (codigopro!=2 && codigopro!=3)){
                
                System.out.println("no puede comprar este producto, el proveedor no tiene tal producto");
                System.out.println("saliendo de compras...");
                break;
            }else if(respuesta3.equals("c") && (codigopro!=2)){
                
                System.out.println("no puede comprar este producto, el proveedor no tiene tal producto");
                       System.out.println("saliendo de compras...");
                 break; 
            } 
                   
                   System.out.println("cuantos kg desea comprar?"); //pide cantidad 
                   double kgcompras=obj.nextDouble();
                   if(kgcompras<=0){
                System.out.println("ingrese una cantidad valida de producto... saliendo de compras");
                break;
            } 
                   
                   switch(codigopro){
                       case 1: //compra de azucar
                           double precio= kgcompras*25;
                           if(dinerocaja<precio){
                               System.out.println("su compra no se puede realizar");
                               System.out.println("volviendo a caja");
                               break;
                               
                           }else{
                            azucarcantidad= azucarcantidad+kgcompras;
                           
                           gastoencompras = + precio;
                           
                           comprasxdia++;
                           gastoazucar=gastoazucar+ precio;
                           dinerocaja=dinerocaja-precio;   
                           }
                           
                           
                           break;
                           
                           
                       case 2://compra de avena
                           
                           if(respuesta3.equals("b")){
                           //si el proveedor es el a tiene que tener uno diferente al c
                           precio= kgcompras*20;
                           
                           if(dinerocaja<precio){
                               System.out.println("su compra no se puede realizar");
                               System.out.println("volviendo a caja");
                               break;
                           }else{
                           avenacantidad= avenacantidad+kgcompras;
                           gastoavena=gastoavena+precio;
                           gastoencompras= gastoencompras + precio;
                           comprasxdia++;
                           dinerocaja=dinerocaja-precio;
                           break;  
                           }
                         
                           //proceso por el que pasa si el proveedor no es b
                       }else if(respuesta3.equals("c")){
                           
                           precio= kgcompras*22;
                           
                           if(dinerocaja<precio){
                               System.out.println("su compra no se puede realizar");
                               System.out.println("volviendo a caja");
                               break;
                           }else{
                            avenacantidad= avenacantidad+kgcompras;
                           gastoencompras= gastoencompras + precio;
                           comprasxdia++;
                           gastoavena=gastoavena+precio;
                           dinerocaja=dinerocaja-precio;
                           break;   
                           }
                           
                           
                       }
                          
                           
                       case 3://compra de trigo
                           precio= kgcompras*30;
                           if(dinerocaja<precio){
                               System.out.println("su compra no se puede realizar");
                               System.out.println("volviendo a caja");
                               break;
                           }else{
                           trigocantidad= trigocantidad+kgcompras;
                           dinerocaja=dinerocaja-precio;
                           gastoencompras= gastoencompras + precio;
                           comprasxdia++;
                           gastotrigo=gastotrigo+precio;
                              
                           break;
                           }
                           
                       case 4://compra de maiz
                           precio= kgcompras*18;
                           if(dinerocaja<precio){
                               System.out.println("su compra no se puede realizar");
                               System.out.println("volviendo a caja");
                               break;
                               
                           }else{
                             maizcantidad= maizcantidad+kgcompras;
                           dinerocaja=dinerocaja-precio;
                           gastoencompras= gastoencompras + precio;
                          comprasxdia++;
                          gastomaiz=gastomaiz+precio;
                           }
                           
                            
                           break;
                           
                           
                       
                   }
                   
            break;

        case 4://reportes-----------------------------------------------------------------------------------------------
            //
            //  REPORTES
            //
            if(!cajaabi){
                System.out.println("no puede acceder a esta opcion si no abrio caja primero");
                break;
            }
            if(ventasxdia<=0 || comprasxdia<=0){
                System.out.println("necesita al menos una compra o venta para crear un reporte :( ");
                break;
            }
            System.out.println("REPORTES-------------------------");
            System.out.println("Dinero actual en la caja: " + dinerocaja);
            System.out.println("---------------------------------");
            System.out.println("Numero de compras realizadas en el dia: " + comprasxdia);
            System.out.println("Numero de ventas realizadas en el dia: " + ventasxdia );
            System.out.println("---------------------------------");
            double gananciatotal= ganancia -gastoencompras;
            if(gananciatotal<=0){
                System.out.println("usted no posee ganancias");
            }else{
              System.out.println("Ganancias: "+ gananciatotal + "lps.");  
            }       
            System.out.println("---------------------------------");
            System.out.println("volumen total de ventas: "+ ganancia+ "lps.");
            System.out.println("volumen total de compras: " + gastoencompras +" lps.");
            double vmcom= gastoencompras /comprasxdia;
            double vmven= ganancia / ventasxdia;
            System.out.println("---------------------------------");
            System.out.println("valor medio de ventas: "+ vmven);
            System.out.println("valor medio de compras: "+ vmcom);
            System.out.println("---------------------------------");
            //determinar la venta con mayor ganancia
            if(azucarcompraa>avenacompraa && azucarcompraa> trigocomprao && azucarcompraa>maizcomprao){ 
                System.out.println("la venta con mayor ganancia fue la azucar con: "+ azucarcompraa + " lps");
                
                
            }else if(avenacompraa>trigocomprao && avenacompraa>maizcomprao){
                System.out.println("la venta con mayor ganancia fue la avena con: "+ avenacompraa +" lps.");
                
                
            }else if(trigocomprao >maizcomprao){  
                System.out.println("la venta con mayor ganancia fue el trigo con: "+ trigocomprao+" lps.");
                
                
            }else{
                   System.out.println("la venta con mayor ganancia fue el maiz con:"+ maizcomprao+ "lps.");  
                
            }
            //compra con mayor gasto wiwiwiwi ayudaporfavorestonoesunmeme
            if(gastoazucar>gastoavena && gastoazucar> gastotrigo && gastoazucar>gastomaiz){ 
                System.out.println("la compra con mas gastos fue la azucar con "+ gastoazucar+ "lps.");
                
                
            }else if(gastoavena>gastotrigo && gastoavena>gastomaiz){
                System.out.println("la compra con mas gastos fue la avena con " + gastoavena + "lps.");
                
                
            }else if(gastotrigo >gastomaiz){  
                System.out.println("la compra con mas gastos fue el trigo con: "+ gastotrigo + "lps.");
                
                
            }else{
                   System.out.println("la compra con mas gastos fue el maiz con: "+ gastomaiz + "lps.");  
                
            }
            
            System.out.println("---------------------------------");
            
            if(ventasxdia>=0){
                 //definir cual fue el producto estrella
            if(azucarcompraa>avenacompraa && azucarcompraa> compratrigo && azucarcompraa>compramaiz){
                
                produestrella=azucarcompraa;
                System.out.println("su produccto estrella fue el azucar con "+ azucarcompraa + "ventas");
            }else if(avenacompraa>trigocomprao && avenacompraa>compramaiz){
                
                produestrella=avenacompraa;
                System.out.println("su produccto estrella fue la avena con "+ avenacompraa + "ventas");
            }else if(trigocomprao >maizcomprao){
                
                produestrella=trigocomprao;
                System.out.println("su produccto estrella fue el trigo con "+ trigocomprao + "ventas");
            }else if (maizcomprao>0){
               produestrella=maizcomprao;
                   System.out.println("su producto estrella fue el maiz "+ maizcomprao + " ventas");  
                
            }else{
                System.out.println("no hay producto entrella");
            }
            }
           
            
            break;
        case 5://cierre de caja-----------------------------------------------------------------------------------------
            System.out.println("---CIERRE DE CAJA---\n");
            if(opcion==5 ){
                cajaabi=false;
            }
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
                     System.out.println("(solo puede ingresar un maximo del 60%)");
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
  