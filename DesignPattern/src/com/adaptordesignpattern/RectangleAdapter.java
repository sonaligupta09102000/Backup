package com.adaptordesignpattern;

public class RectangleAdapter implements Shape {
	
	private Retangle retangle;

	public RectangleAdapter(Retangle retangle)
	{
	    this.retangle=retangle;	
	}

	@Override
	public void draw(int i, int j, int x, int y) {
		int x1=Math.min(i,x);
		int y1=Math.min(j, y);
	    int width=Math.abs(x-i);
	    int height=Math.abs(y-j);
		
		retangle.draw(x1, y1, width , height);
	}
	
	
}
