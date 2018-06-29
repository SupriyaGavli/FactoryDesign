package com.phone;
//FACADE design pattern
public class shop {
	private os Android;
	private os IOS;
	private os windows;
	
	public shop()
	{
		Android=new Android();
		IOS=new IOS();
		windows=new windows();
	}
	
	public void AndroidSale()
	{
		
		Android.model_no();
		Android.mobPrice();
	}
	public void IOSSale()
	{
		
		IOS.model_no();
		IOS.mobPrice();
	}
	public void windowssSale()
	{
		
		windows.model_no();
		windows.mobPrice();
	}

}
