package com.carewassoc;

public class StudentMembership extends Membership {
	private StudentMembership instance;
	//private static StudentMembership instance = new StudentMembership();

	private StudentMembership() {};
	
	public static Membership getInstance(){
        if(instance == null){
            instance = new StudentMembership();
        }
        return (StudentMembership) instance;
    }

	@Override
	public Membership getinstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	
}
