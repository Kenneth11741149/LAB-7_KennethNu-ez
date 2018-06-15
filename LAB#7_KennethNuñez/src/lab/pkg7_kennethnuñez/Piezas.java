
package lab.pkg7_kennethnuñez;

import java.util.ArrayList;


public class Piezas{ 
    private String nombre;
    private String material;
    private int elaboracion;
    private Object Padre;
    private ArrayList<Piezas> pieces = new ArrayList();

    public Piezas(String nombre, String material, int elaboracion) {
        this.nombre = nombre;
        this.material = material;
        this.elaboracion = elaboracion;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Piezas> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piezas> pieces) {
        this.pieces = pieces;
    }
    

    public Object getPadre() {
        return Padre;
    }

    public void setPadre(Object Padre) {
        this.Padre = Padre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
