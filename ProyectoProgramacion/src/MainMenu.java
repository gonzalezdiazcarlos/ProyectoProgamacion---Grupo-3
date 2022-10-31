import java.util.StringTokenizer;

import javax.swing.SwingUtilities;

import Utilidades.*;

import calzado.*;



public class MainMenu {                           //Menu principal
	public static void main(String[] args) {
		
		
            String eleccion=null;
		do{                                       //Uso del do-while, do smthng while...
	
		       eleccion =   UtilA.displayMenu();
		      
              switch (eleccion){
		
		        case "A": //Login or Logout+ admin --> calculo beneficios + mod user/ normal--> suscribirse a newsletter
			         break;
			         
		        case "B"://cesta de la compra + sugerir
		        	 break;
		        	 
		        case "C"://filtrado producto
		        	break;
		        	
		        case "D"://comprar+ descuentos, ticket,datos pago, calculo compra
		        	break;
		        	
		        case "E"://ver stock + opcion producto
		        	break;
		        	
		        case "F":
		        	System.out.println("Un placer, vuelva cuando quiera");
		        	break;
		        
		        default: System.out.println("Error al seleccionar opción. Por favor, vuelva a intentarlo.");
		                 break;
		                 
		                 
     }  }while(eleccion!="F");     }   }
