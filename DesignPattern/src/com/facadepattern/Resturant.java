package com.facadepattern;

public class Resturant {
	
  private Hotel vegmenu;
  private Hotel nonvegmenu;
  private Hotel vegnonvegbothmenu;
  
  public Resturant()
  {
	  vegmenu=new VegMenu();
	  nonvegmenu=new NonVegMenu();
	  vegnonvegbothmenu=new VegNonVegBoth();
	  
  }
  
  public void getMenusVegMenu()
  {
	  vegmenu.getMenus();
  }
  
  public void getMenusNoVegMenu()
  {
	  nonvegmenu.getMenus();
  }
  
  public void getMenusVegNonVegBothMenu()
  {
	  vegnonvegbothmenu.getMenus();
  }

}
