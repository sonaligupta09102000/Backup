package com.adaptordesignpattern;

public class AdapterMain {
	
	public static void main(String[] args) {
		
		Shape[] shape= {new RectangleAdapter(new Retangle()),new LineAdapter(new Line())};
		
		int i=10, j=30;
		int x=40, y=20;
		
		for(Shape shape1:shape)
		{
			shape1.draw(i, j, x, y);
		}
		
	}

}
