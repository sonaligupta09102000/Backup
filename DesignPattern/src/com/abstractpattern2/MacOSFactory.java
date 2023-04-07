package com.abstractpattern2;

import com.abstractfactory.AbFactory;

public class MacOSFactory implements AbFactory{

	@Override
	public Button clickButton() {
		
		return new MacOSButton();
	}

	@Override
	public CheckBox clickCheckBox() {
		
		return new MacOSCheckBox();
	}

}
