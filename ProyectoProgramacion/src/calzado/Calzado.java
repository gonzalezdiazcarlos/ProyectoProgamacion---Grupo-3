package calzado;

public class Calzado {
	
	private int Cantidad;
	private int Codigo;
	private int Precio;
	private String Color;
	private int Talla;
	private String Tipo;
	
	public void setCantidad (int Cantidad) {
		this.Cantidad = Cantidad;
	}
	public void setCodigo (int Codigo) {
		this.Codigo = Codigo;
	}
	public void setPrecio (int Precio) {
		this.Precio = Precio;
	}
	public void setColor (String Color) {
		this.Color = Color;
	}
	public void setTalla (int Talla) {
		this.Talla = Talla;
	}
	
	public void SetTipo (String Tipo) {
		this.Tipo = Tipo;
	}
	
	public int getCantidad() {return Cantidad;}
	public int getCodigo() {return Codigo;}
	public int getPrecio() {return Precio;}
	public String getColor() {return Color;}
	public int getTalla() {return Talla;}
	public String getTipo() {return Tipo;}
	
}
