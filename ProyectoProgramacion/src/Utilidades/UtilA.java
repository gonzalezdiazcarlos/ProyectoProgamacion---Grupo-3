package Utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UtilA {  // Metodos normales a usar en el proyecto

	
	public static String displayMenu() {
		System.out.println("Menu:");
		String choice= getStringInput("¿Que desea hacer?");
		return choice;}
	
	

	public static int getIntegerInput(String output) {//gives int input
		    System.out.println(output);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			Integer entero = null;
			boolean error = true;
			do{
				try{
					String cadena = br.readLine();
					entero = new Integer(cadena);
					error = false;
				}catch(NumberFormatException nfe)
	      {System.out.println("No teclee un numero entero-Repetir");
	      }catch (Exception e)
				{System.out.println("Error de entrada-Repetir ");
				}
			}while(error);
			return entero.intValue(); }

	
	
	
	public static String getStringInput(String output) {//gives String input
		    System.out.println(output);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String cadena = null;
			boolean error = true;
			do{
				try{
					cadena = br.readLine();
					error = false;
				}catch (Exception e)
				{System.out.println("Error de entrada-Repetir ");
				}
			}while(error);
			return cadena;  }
	
	
	
	
	public boolean logUserIn(String name, String password) throws IOException {// returns true= admin,  false=regular user
		boolean admin = false;
		String ficha=getStringInput("¿Que fichero desea?");
        File file =	UtilFiles.getFile(ficha);//read lines
        ArrayList<ArrayList<String[]>> users = UtilFiles.getUsers(file);//[[name1,password1,adminType1],[name2,password2,adminType2]...]
        //if password and name in same line-->
        for(int a =0; users.size() > a  ;a++) {
		   if(users.get(a).get(0).equals(name)  && users.get(a).get(1).equals(password)){
			   System.out.println("User: "+name+ " is a user");
			   if(users.get(a).get(2).equals("admin")) {
			   admin=true;}
		   }
		}
		return admin;
	}


public void popUser(String name, String password) throws IOException {
	boolean exists=false;
	String ficha=getStringInput("¿Que fichero desea?");
    File file =	UtilFiles.getFile(ficha);//read lines
    ArrayList<ArrayList<String[]>> users = UtilFiles.getUsers(file);
    for(int a =0; users.size() > a  ;a++) {
    	if(users.get(a).get(2).equals("normal")) {//solo los users normales se pueden eliminar
    	System.out.println(users.get(a));}}
    System.out.println("¿Que usuario desea eliminar?");
    
}

	
	
	
	
	
}
