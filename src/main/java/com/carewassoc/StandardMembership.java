package com.carewassoc;

public class StandardMembership extends Membership {
	
	//private static StudentMembership instance = new StudentMembership();

	private StandardMembership() {
		super();
		}
		
	public static StandardMembership getInstance(){
        if(instance == null){
            instance = new StandardMembership();
        }
        return (StandardMembership) instance;
    }

	@Override
	public Membership getinstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	
}