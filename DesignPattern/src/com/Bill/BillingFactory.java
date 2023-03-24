package com.Bill;

public class BillingFactory {
	
	public BillingState getAllBill(String str)
	
	{
		if(str.equals("Commerical"))
			return new CommericalBill();
		
		else if(str.equals("Domenstic"))
			return new DomensticBilling();
		
		else if(str.equals("Institutional"))
			return new InstitutionalBilling();
	
		
		return null;
	}

}
