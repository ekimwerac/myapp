package com.carewassoc;

public class OAPMembership extends Membership {
	
	//private static StudentMembership instance = new StudentMembership();

	private OAPMembership() {
		super();
		}
	
	
	public static OAPMembership getInstance(){
        if(instance == null){
            instance = new OAPMembership();
        }
        return (OAPMembership) instance;
    }

	@Override
	public Membership getinstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	
}