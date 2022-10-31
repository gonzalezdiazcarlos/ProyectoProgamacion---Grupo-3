	package Utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UtilFiles {

	
	
	
	public static File getFile(String output) throws FileNotFoundException {//gets file 
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(output);
			String path = sc.nextLine(); 
			File file = new File(path);
			if (!file.isFile()) {
				throw new FileNotFoundException("La ruta indicada no se corresponde con ningún fichero."); 
		   }if (!file.exists()) {
				throw new FileNotFoundException("El fichero indicado no existe.");
		}return file;  }   }
	
	
	
	public void writeFile(String smthng){
		
	}
	
	 
     
	
	
	
	public static ArrayList<ArrayList<String[]>> getUsers(File file) throws IOException {
		ArrayList<ArrayList<String[]>> usersArray = new ArrayList<ArrayList<String[]>>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				ArrayList<String[]> namePass = new ArrayList<String[]>(2);//name-password-adminType
				namePass.add(line.split("-"));
				
				usersArray.add(namePass);	
				
	  } }return usersArray;}
	
	
	public static void deleteUserFromFile(File file, String name, String pass) {
		
		
	}
}
