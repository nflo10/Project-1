/*
 * The source code describes a student object
 * representing a student at UTSA
 */

public class Student
{
  /*
   * INSTANCE VARIABLES
   */
  private String netId;            //UserID; unique value
  private String lastNm;           //Legal last name or surname
  private String firstNm;          //Legal first name or given
  private int creditHrs;           // earned credit hours to date
  private double gpa;              // current grade point average
  
  /*
   * CONSTRUCTORS
   */
  public Student()
  {
    //This is intended to be empty
  } //end null constructor
  public Student(String id, 
                 String last,
                 String first,
                 int hours,
                 double ptAvg )
  {
    //netID = id;  YOU WILL NEVER DO THIS IN FULL CONSTRUCTOR
    setNetId( id );
    setLastNm( last );
    setFirstNm( first );
    setCreditHrs( hours );
    setGpa( ptAvg ); 
  } //end full constructor                               //these are the doors in the wall of the sandbox
  
  /*
   * SET METHODS
   */
  public final void setNetId( String id)    //final doesn't allow new rules or ways in door
  {
    netId = id;                                                        //only place I can do it in set methods
  } // end setNetId 
  
  public final void setLastNm( String last) 
  {
    lastNm = last;
  }//end setLastNm
  
  public final void setFirstNm( String first)
  {
    firstNm = first;
  }//end setFirstNm
  
  public final void setCreditHrs( int hours)
  {
    creditHrs = hours;
  }//end setCreditHrs
  
  public final void setGpa( double ptAvg)
  {
    gpa = ptAvg;
  }//end setGpa
  /*
   * GET METHODS // inverse operations of set methods // only way to acess data direclty (set and get methods).
   */
  public final String getNetId( )
  {
    return netId;
  } // end getNetId
  
  public final String getLastNm( )
  {
    return lastNm;
  } // end getLastNm
  
  public final String getFirstNm( )
  {
    return firstNm;
  } // end getFirstNm
  
  public final int getCreditHrs( )
  {
    return creditHrs;
  } // end getCreditHrs
  
  public final double getGpa( )
  {
    return gpa;
  } // end getGpa
  /*
   * OTHER METHODS AS NEEDED //we do not access the data direclty, we call the get methods
   */
  public String provideFullName( )
  {
    return String.format( "%s %s",
                         getFirstNm( ),
                         getLastNm( ) );
  } // end provideFull
  
  public String toString( )
  {
    // Return a verbose description of the Student Object. 
    return String.format( "%s, user ID %s. has a Gpa of %.2f over %d  credit hours.%n",
                         provideFullName( ),
                         getNetId( ),
                         getGpa( ),
                         getCreditHrs( ) );
  } // end toString
  
}// end class Student




