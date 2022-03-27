package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
        numTV++;
    }

    public static void setNumTV(int _numTV){
        numTV=_numTV;
    }

    public static int getNumTV(){
        return numTV;
    }

    
    public void setMarca(Marca marca){
        this.marca=marca;
    }
    public void setControl(Control control){
        this.control=control;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setVolumen(int volumen){
        if(this.estado){
            if(this.volumen<7){
                this.volumen=volumen;
            }
        }
    }
    public void setCanal(int canal){
        if(estado){
            if(canal<=120){
                this.canal=canal;
            }
        }
    }
    
    
    public Marca getMarca(){
        return marca;
    }
    public Control getControl(){
        return control;
    }
    public int getPrecio(){
        return precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getCanal(){
        return canal;
    }
    
    public static void contadorTVs(){
        numTV++;
    }
    public void turnOn(){
        this.estado= true;
    }
    public void turnOff(){
        this.estado=false;
    }
    public boolean getEstado(){
        return estado;
    }

    
    public void canaUp(){
        if(estado){
            if(canal<120 ){
                canal++;
            }
        }
    }
    public void canalDown(){
        if(estado){
            if(canal>1 && canal<120){
                canal--;
                
            }
        }
    }
    public void volumenUp(){
        if(this.estado){
            if(this.volumen<7){
                this.volumen++;
            }
        }
    }
    public void volumenDown(){
        if(this.estado){
            if(this.volumen>1 && this.volumen<7){
                this.volumen--;
            }
        }
    }


}