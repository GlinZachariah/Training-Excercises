import java.awt.*;
import java.awt.event.*;

//Java AWT Button Demo Click Listerner

class demo3{
	demo3(){
		Frame f;
		Button b1,b2,b3,b4,b5;

		f = new Frame("My Frame");
		b1 = new Button("Button 1");


		f.setSize(300,200);
		f.setVisible(true);


		f.setLayout(new FlowLayout());

		f.add(b1);
		b1.addActionListener(new handler());
	
	}

	public static void main(String[] args){
		demo3 d = new demo3();
	}

	
}

class handler implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		System.out.println("You have entered");
	}
}