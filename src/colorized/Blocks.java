package colorized;
import javax.swing.*;
public class Blocks extends JLabel{
    
    int co;
    
    Blocks(int size){
        setcolor(1+(int)(Math.random()*6));
        setSize(size,size);
    }
    
    Blocks(int color,int size){
       setcolor(color);
       setSize(size,size);
   } 
   
    public void setcolor(int co){
        this.co=co;
        try{
        setIcon(new ImageIcon(getClass().getResource("/colorized/"+co+".png")));
        }catch(Exception e){e.printStackTrace();}
        
        
        setVisible(true);
    }
    
    public int getcolor(){
    return co;
    }
}
