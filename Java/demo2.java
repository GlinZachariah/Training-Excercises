import java.awt.*;


//Java AWT Button Demo

class demo2{
	demo2(){
		Frame f;
		Button b1,b2,b3,b4,b5;

		f = new Frame("My Frame");
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		b5 = new Button("Button 5");

		f.setSize(300,200);
		f.setVisible(true);

		//Layouts
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(3,2));
		//f.add(b1);
		//f.add(b2);
		//f.add(b3);
		//f.add(b4);
		//f.add(b5);
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);

	
	}

	public static void main(String[] args){
		demo2 d = new demo2();
	}
}