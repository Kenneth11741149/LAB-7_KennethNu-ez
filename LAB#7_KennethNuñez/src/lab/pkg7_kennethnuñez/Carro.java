package lab.pkg7_kennethnuñez;

import java.util.ArrayList;


public class Carro {
    private String nombre;
    private ArrayList<Piezas> pieces = new ArrayList();

    public Carro(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Piezas> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piezas> pieces) {
        this.pieces = pieces;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
