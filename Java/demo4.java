import java.awt.*;
import java.awt.event.*;

//Java AWT Button Demo Mouse Listener

class demo4{
	demo4(){
		Frame f;
		Button b1,b2,b3,b4,b5;

		f = new Frame("My Frame");
		b1 = new Button("Button 1");


		f.setSize(300,200);
		f.setVisible(true);


		f.setLayout(new FlowLayout());

		f.add(b1);
		b1.addMouseListener(new handler());
	
	}

	public static void main(String[] args){
		demo4 d = new demo4();
	}

	
}

class handler implements MouseListener{
	public void mousePressed(MouseEvent me){
		System.out.println("You have pressed");
	}
	public void mouseClicked(MouseEvent me){
		System.out.println("You have clicked");
	}
	public void mouseReleased(MouseEvent me){
		System.out.println("You have released");
	}
	public void mouseEntered(MouseEvent me){
		System.out.println("You have entered");
	}
	public void mouseExited(MouseEvent me){
		System.out.println("You have exited");
	}
}