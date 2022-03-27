package taller3.televisores;

public class TV {
	private static int numTV;
	private int canal = 1;
	private int precio = 500;
	private int volumen = 1;
	private Marca marca;
	private Control control;
	private boolean estado;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV ++;
	}
	
	public void setCanal(int canal) {
		if(this.estado && (canal >= 1 && canal <= 120)) {
			this.canal = canal;
		}
	}
	
	public void setVolumen(int volumen) {
		if(this.estado && (volumen >=0 && volumen <= 1)) {
			this.volumen = volumen;
		}
		
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public int getPrecio() {
		return this.precio;
		
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public static void setNumTV(TV numTV_) {
		numTV = numTV;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
		
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp(int canal) {
		if(this.estado && this.canal < 120) {
			this.canal ++;
		}
	}
	
	public void canalDown(int canal) {
		if(this.estado && this.canal > 1) {
			this.canal --;
		}
	}
	
	public void volumenUp(int volumen) {
		if(this.estado && this.volumen < 7) {
			this.volumen ++;
		}
	}
	
	public void volumenDown(int volumen) {
		if(this.estado && this.volumen > 0) {
			this.volumen --;
		}
	}
	
	public static void contadorTVs(){
        numTV++;

}