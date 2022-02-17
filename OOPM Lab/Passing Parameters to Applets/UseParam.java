    import java.applet.Applet;  
    import java.awt.Graphics;  
      
    public class UseParam extends Applet{  
      
    public void paint(Graphics g){  
    String str=getParameter("msg1");  
    g.drawString(str,450, 350);  
    }  
      
    }  
