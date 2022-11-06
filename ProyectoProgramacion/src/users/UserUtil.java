package users;

public class UserUtil {
	
	public static HashMap <String, Usuario> leerUsuarios() {
		HashMap<String, Usuario> map = new HashMap<String,Usuario>();
		File aFile = new File ("baseproyecto.db");
		FileReader fr;
		try {
			fr = new FileReader (aFile);
			BufferedReader br = new BufferedReader (fr);
			String linea = br.readLine();
			while (linea != null) {
				
				String[] lineaSeparada = linea.split(",");
				
				map.put(lineaSeparada[0], lineaSeparada[1], lineaSeparada[2], lineaSeparada[3], lineaSeparada[4])));
				
				linea = br.readLine();
				
			}
			br.close;
			fr.close;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

	public static boolean escribirNuevoUsuario(HashMap<String, Usuario> map) {
		boolean usuarioCreado = false;
		File aFile = new File("baseproyecto.db");
		FileWriter fw = null;

		try {

			fw = new FileWriter(aFile);
			BufferedWriter bw = new BufferedWriter(fw);

			java.util.Iterator<String> it = map.keySet().iterator();
			while (it.hasNext()) {
				String user = it.next();
				Usuario u = map.get(user);
				String escribir = u.getCodigo() + "," + u.getNombre() + "," + u.getContraseña() + u.getPuesto() + ","
						+ u.getTelefono() + "\n";
				bw.write(escribir);

			}
			bw.flush();
			bw.close();

			usuarioCreado = true;

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return usuarioCreado;


}
