package com.adaptordesignpattern;

public class LineAdapter implements Shape {

	private Line line;
	
	public LineAdapter(Line line)
	{
		this.line=line;
	}
	
	@Override
	public void draw(int i, int j, int x, int y) {
		
		line.draw(i, j, x, y);
	}
}
