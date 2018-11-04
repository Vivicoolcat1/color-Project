package colors;

import java.util.ArrayList;



public class ObjectManager {
	ArrayList<Ball> b = new ArrayList<Ball>();
	Ball ball;
public ObjectManager(Ball b) {
	 b = ball;
}
	public void purgeObjects() {
		for (int i = 0; i < b.size(); i++) {
			if (b.get(i).isAlive == false) {
				b.remove(i);

}
		}}}