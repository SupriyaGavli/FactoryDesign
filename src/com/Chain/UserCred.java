package com.Chain;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UserCred extends Authentication{
	private Server server;
	
	public UserCred(Server server)
	{
		this.server=server;
	}
	
	public boolean check(String email,String password)
	{
		if(!server.hasEmail(email)) {
			System.out.println("this email is not registered");
			return false;
		}
		if(!server.isValidPassword(email,password))
		{
			System.out.println("Wrong PAssword");
			return false;
		}
		return checkNext(email,password);
	}

}
