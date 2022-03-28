package taller3.televisores;
public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	public Control control;
	private static int numTV=0;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		canal=1;
		volumen=1;
		precio=500;
		TV.numTV=TV.numTV+1;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;}
	public Marca getMarca() {
		return marca;}
	
	public void setControl(Control control) {
		this.control=control;}
	public Control getControl() {
		return control;}	
	
	public void setPrecio(int precio) {
		this.precio=precio;}
	public int getPrecio() {
		return precio;}
	
	public void setVolumen(int volumen) {
		if(volumen>=1 && volumen<=7){
			this.volumen=volumen;}
		return;
		}
	public int getVolumen() {
		return volumen;}
	
	public void setCanal(int canal) {
		if (estado==true) {
			if (canal>=1 && canal<=120) {
				this.canal=canal;}
			return;}
		return;}
	public int getCanal() {
		return canal;}
	
	public  static int getNumTV() {
		return TV.numTV;}
	
	public void turnOn() {
		estado=true;}
	public void turnOff() {
		estado=false;}
	
	public boolean getEstado() {
		return estado;}
	public static void setNumTV(int numero) {
		TV.numTV=numero;
	}
	public void canalUp() {
		if (estado==true) {
			if (canal<120) {
				canal++;}
			return;}
		return;}
	
	public void canalDown() {
		if (estado==true) {
			if (canal>1) {
				canal--;}
			return;}
		return;}
	
	public void volumenUp() {
		if (estado==true) {
			if (volumen<7) {
				volumen++;}
			return;}
		return;}
	
	public void volumenDown() {
		if (estado==true){
			if (volumen>0) {
				volumen--;}
			return;}
		return;}
	

}