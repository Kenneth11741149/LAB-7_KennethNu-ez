package lab.pkg7_kennethnuñez;

import java.io.EOFException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class adminEnsamblaje extends Thread{
    private boolean avanzar;
    private boolean vive;
    private TablaEnsamble x = new TablaEnsamble();
    adminEnsamblaje(){
        vive = true;
        avanzar = true;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                x.setVisible(true);
                DefaultTableModel seta = (DefaultTableModel)x.t1.getModel();
                try{
                    Thread.sleep(10);
                }catch(InterruptedException ex){
                    
                }
            }
        }
    }
    
    
    
}
