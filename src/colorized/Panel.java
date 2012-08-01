package colorized;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    
    //longCuadros<=22
    Blocks[][] mat = null;
    int longCuadros,filas,columnas,maxMov;
    
    

    public void start() {
        removeAll();
        mat = new Blocks[filas][columnas];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = new Blocks(longCuadros);//se crea nuevo cuadro con color al azar y tamaño definido
                    mat[i][j].setBounds(new Rectangle((i * longCuadros), (j * longCuadros), longCuadros, longCuadros));
                    mat[i][j].setToolTipText("posX: "+i+"   posY: "+j);
                    add(mat[i][j], null);
            }
        }
    }
    
        
    public void setDificulty(int dificultad){
    switch(dificultad){
            case 1: longCuadros=22;filas=columnas=12;
                    setPreferredSize(new Dimension(264, 264));
                    maxMov=21;
                    break;
                
            case 2: longCuadros=14;filas=columnas=19;
                    maxMov=34;
                    setPreferredSize(new Dimension(266, 266));
                    break;
                
            case 3: longCuadros=11;filas=columnas=24; 
                    maxMov=56;
                    setPreferredSize(new Dimension(264, 264));
                    break;
            
        }
    start();
    }

    public Panel() {
        initComponents();
        setFocusable(false);
        setLayout(null);
        setBackground(Color.black);
        setDificulty(1);
        
        //JOptionPane.showMessageDialog(null,this);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
