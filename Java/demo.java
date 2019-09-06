import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class demo {
	
	demo(){
		Frame f;
		MenuBar mb;
		Menu m1,m2;
		
		MenuItem mi1,mi2,mi3,mi4;
		
		
		f = new Frame("My Frame");
		mb= new MenuBar();
		f.setSize(300, 500);
		f.setVisible(true);
		f.setMenuBar(mb);
		
		m1 = new Menu("File");
		m2 = new Menu("Edit");
		mb.add(m1);
		mb.add(m2);
		mi1= new MenuItem("Open");
		mi2= new MenuItem("New");
		mi3= new MenuItem("Save");
		mi4= new MenuItem("Save As");
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.addSeparator();
		m1.add(mi4);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d= new demo();
	}

}
