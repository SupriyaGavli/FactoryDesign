package com.phone;

public class OsFactory {
	
public os getInstance(int a)
{
	if(a==1)
		return new Android();
	else if(a==2)
		return new IOS();
	else
		return new windows();

}
}
