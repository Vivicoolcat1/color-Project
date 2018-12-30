package colors;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;



public class ObjectManager {
	ArrayList<Obsticle> obs = new ArrayList<Obsticle>();
	Obsticle ob;
public ObjectManager(Ball b) {
	
}
public void draw (Graphics g, camera cam){

for (Obsticle obsticle : obs) {
	obsticle.draw(g,cam);
}
}
	//public void purgeObjects() {
		//for (int i = 0; i < obs.size(); i++) {
		//	if (obs.get(i).isAlive == false) {
		//		obs.remove(i);

//}
		//}
//}
}