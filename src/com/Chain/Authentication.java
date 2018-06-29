package com.Chain;

public abstract class Authentication {
private Authentication next;

public Authentication linkwith(Authentication next)
{
	this.next=next;

return next;
}
public abstract boolean check(String email,String password);

protected boolean checkNext(String email,String password)
{
	if(next==null) {
		return true;
}
return next.check(email,password);
}
}
