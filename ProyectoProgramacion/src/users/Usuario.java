package users;
import Utilidades.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import Utilidades.UtilFiles;
 
public class Usuario {

  private String name;
  private String password;
  private String puesto;
  private int tlfn; 
  private int codigousuario;
      public String getName() {return name;}
	  public void setName(String name) {this.name = name;}
	  public String getpuesto() {return puesto;}
	  public void setPuesto(String puesto) {this.puesto=puesto;}
	  public String getPassword() {return password;}
	  public void setPassword(String password) {this.password = password;}
	  public int getTlfn() {return tlfn;}
	  public void setTlfn(int tlfn) {this.tlfn = tlfn;} 
	  public int getCodigousuario() {return codigousuario;}
	  public void setcodigousuario(int codigousuario) {this.codigousuario = codigousuario;}
	  


class adminUser extends Usuario{
	private String idComprador;

	public String getIdComprador() {return idComprador;}
	public void setIdComprador(String idComprador) {this.idComprador = idComprador;}
}



class regularUser extends Usuario{
	private int nivelPuesto;//1, 2 , 3

	public int getNivelPuesto() {return nivelPuesto;}
	public void setNivelPuesto(int nivelPuesto) {this.nivelPuesto = nivelPuesto;}	
}




public void newUser(boolean admin) {
	if (admin==true) {
		adminUser newUser= new adminUser();
	}else {
		regularUser newUsuario = new regularUser();	
	}	
}

public void editUser(String newEdit,String toEdit,String user, String pass) {
	//buscar user y pass
}

public void popUser(String name, String password) throws IOException {
	boolean exists=false;
	String ficha=UtilA.getStringInput("¿Que fichero desea?");
    File file =	UtilFiles.getFile(ficha);//read lines
    ArrayList<ArrayList<String[]>> users = UtilFiles.getUsers(file);
    for(int a =0; users.size() > a  ;a++) {
    	if(users.get(a).get(2).equals("normal")) {//solo los users normales se pueden eliminar
    	System.out.println(users.get(a).get(0));}}//solo publico el nombre
   String data = UtilA.getStringInput("¿Que usuario desea eliminar?");
   regularUser toBeDeleted=new regularUser ();// for user...pop...actualizar ficha ¿o metodo base de datos?
   
}
}