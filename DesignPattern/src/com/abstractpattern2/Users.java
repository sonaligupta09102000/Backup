package com.abstractpattern2;

import com.abstractfactory.AbFactory;

public class Users {
	
	private Button button;
	private CheckBox checkbox;
	
	public Users(AbFactory factory)
	{
		button=factory.clickButton();
		checkbox=factory.clickCheckBox();
	}
	
	public void click()
	{
		button.click();
		checkbox.click();
	}

}
