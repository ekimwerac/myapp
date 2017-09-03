package com.carewassoc;

public class MembershipFactory {

  public static Membership getMembership(String criteria)
  {
    if ( criteria.equals("Standard") )
      return StandardMembership.getInstance();
    else if ( criteria.equals("Student") )
      return StudentMembership.getInstance();
    else if ( criteria.equals("OAP") )
      return OAPMembership.getInstance();
    
    return null;
  }
}