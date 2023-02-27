package ca.uwaterloo.cs446.designpatterns.adapter;

public class CircleAdapter implements Shape {
	private Circle adaptee;
	
	public CircleAdapter(Circle circle) {
		this.adaptee = circle;
	}
	
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
        int radius = Math.abs(x2-x1);
        int x = radius + x1;
        int y = radius + y1;
		
		adaptee.draw(x, y, radius);
	}
}
