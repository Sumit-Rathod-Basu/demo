import java.awt.*;
class BorderLayoutDemo extends Frame
{
   BorderLayoutDemo ()
   {
	BorderLayout f1=new BorderLayout(10,10);
	setLayout(f1);
        Font f2=new Font("bold",50,50);
	setFont(f2);
	Button c1=new Button("OK");
	 c1.setBackground(Color.red);
	 c1.setForeground(Color.pink);
          add(c1,BorderLayout.CENTER);
	  
	 add(new Button(" ESTE"),BorderLayout.EAST);
	 add(new Button(" WEST"),BorderLayout.WEST);
	 add(new Button(" SOUTH"),BorderLayout.SOUTH);
	 add(new Button(" NORTH"),BorderLayout.NORTH);
 	 //add(f1);
   }
   public static void main(String args[])
    {
       BorderLayoutDemo d1=new BorderLayoutDemo ();
	d1.setVisible(true);
	d1.setTitle("GridLayoutDemo");
	d1.setSize(600,600);
    }
}