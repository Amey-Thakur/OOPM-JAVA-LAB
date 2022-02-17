import java.applet.*;
import java.awt.*;

/*<Applet code="fillcolor.class" width=300 height=400></Applet>*/
public class fillcolor extends Applet {
//override
   public void paint(Graphics g)
 {
      g.drawRect(300,150,200,100);
      g.setColor(Color.yellow);   
      g.fillRect( 300,150, 200, 100 );
      g.setColor(Color.magenta);
      g.drawString("Rectangle",500,150);
   }
}

