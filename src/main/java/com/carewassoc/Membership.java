package com.carewassoc;

public abstract class Membership {
	private static Membership m=null;
	protected Membership() {
	}

	public static Membership getMembership() {
		return m;
	}

}