import java.awt.*;
import java.awt.event.*;

//Java AWT Button Demo Motion Listener

class demo5{
	demo5(){
		Frame f;
		Button b1,b2,b3,b4,b5;

		f = new Frame("My Frame");
		b1 = new Button("Button 1");


		f.setSize(300,200);
		f.setVisible(true);


		f.setLayout(new FlowLayout());

		f.add(b1);
		b1.addMouseMotionListener(new handler());
	
	}

	public static void main(String[] args){
		demo5 d = new demo5();
	}

	
}

class handler implements MouseMotionListener{
	public void mouseMoved(MouseEvent me){
		System.out.println("You have moved");
	}
	public void mouseDragged(MouseEvent me){
		System.out.println("You have dragged");
	}
}