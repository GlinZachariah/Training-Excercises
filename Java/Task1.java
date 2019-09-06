import java.awt.*;
import java.awt.event.*;

class Task1{

	Task1(){
		Frame f;
		MenuBar mb;
		Menu m1,m2,m3,m4;
		Button b1,b2,b3,b4,b5;
		MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17,mi18,mi19,mi20;

		f = new Frame("Task 1");
		f.setSize(500,700);
		f.setVisible(true);
		mb = new MenuBar();

		m1= new Menu("Java");
		m2= new Menu("Dotnet");
		m3= new Menu("Android");
		m4= new Menu("Ios");

		mi1= new MenuItem("New");
		mi2= new MenuItem("Open");
		mi3= new MenuItem("Close");
		mi4= new MenuItem("Save");
		mi5= new MenuItem("Exit");


		mi6= new MenuItem("New");
		mi7= new MenuItem("Open");
		mi8= new MenuItem("Close");
		mi9= new MenuItem("Save");
		mi10= new MenuItem("Exit");


		mi11= new MenuItem("New");
		mi12= new MenuItem("Open");
		mi13= new MenuItem("Close");
		mi14= new MenuItem("Save");
		mi15= new MenuItem("Exit");


		mi16= new MenuItem("New");
		mi17= new MenuItem("Open");
		mi18= new MenuItem("Close");
		mi19= new MenuItem("Save");
		mi20= new MenuItem("Exit");

		b1= new Button("Button 1");
		b2= new Button("Button 2");
		b3= new Button("Button 3");
		b4= new Button("Button 4");
		b5= new Button("Button 5");


		f.setMenuBar(mb);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);

		m1.add(mi1);
		m1.add(mi2);
		m1.addSeparator();
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);


		m2.add(mi6);
		m2.add(mi7);
		m2.addSeparator();
		m2.add(mi8);
		m2.add(mi9);
		m2.add(mi10);

		m3.add(mi11);
		m3.add(mi12);
		m3.addSeparator();
		m3.add(mi13);
		m3.add(mi14);
		m3.add(mi15);

		m4.add(mi16);
		m4.add(mi17);
		m4.addSeparator();
		m4.add(mi18);
		m4.add(mi19);
		m4.add(mi20);

		f.add(b1, BorderLayout.CENTER);
		b1.addMouseMotionListener(new MouseMotionHandler());
		f.add(b2, BorderLayout.EAST);
		b2.addMouseMotionListener(new MouseMotionHandler());
		f.add(b3, BorderLayout.NORTH);
		b3.addMouseListener(new MouseHandler());
		f.add(b4, BorderLayout.WEST);
		b4.addActionListener(new ActionHandler());
		f.add(b5, BorderLayout.SOUTH);
		b5.addMouseListener(new MouseHandler());	
	}

	public static void main(String[] args){
		Task1 t = new Task1();

	}
}

class ActionHandler implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		System.out.println("Action Event Performed");
	}
}

class MouseHandler implements MouseListener{
	public void mousePressed(MouseEvent me){
		System.out.println("Mouse Press Performed");
	}
	public void mouseClicked(MouseEvent me){
		System.out.println("Mouse Click Performed");
	}
	public void mouseEntered(MouseEvent me){
		System.out.println("Mouse Enter Performed");
	}
	public void mouseExited(MouseEvent me){
		System.out.println("Mouse Exit Performed");
	}
	public void mouseReleased(MouseEvent me){
		System.out.println("Mouse Release Performed");
	}
}


class MouseMotionHandler implements MouseMotionListener{
	public void mouseMoved(MouseEvent me){
		System.out.println("Mouse Motion Move Performed");
	}
	public void mouseDragged(MouseEvent me){
		System.out.println("Mouse Motion Dragged Performed");
	}
}
