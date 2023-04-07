package com.abstractpattern2;

import com.abstractfactory.AbFactory;

public class WindowFactory implements AbFactory {

	@Override
	public Button clickButton() {
	
		return new WindowButton();
	}

	@Override
	public CheckBox clickCheckBox() {
		
		return new WindowCheckBox();
	}

}
