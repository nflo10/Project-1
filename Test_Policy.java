/*
 *  This is a test harness for the Policy class.
 * 
 *  This process will exercise all methods included in the Policy class:
 *       > null constructor
 *       > full constructor
 *         -- all set methods
 *       > toString 
 *         -- all get methods
 *         -- txtPolType method
 * 
 *  This process will use an array type to hold Policy objects and an enhanced for loop.
 * 
 * 
 * (c) 2017, Terri Davis
 */ 
public class Test_Policy
{
  /*
   *  Global scoping for varialbes/data structures is STRONGLY DISCOURAGED, but here it makes
   *   our lives (and code) simpler, so we'll allow it.
   *  COMPLETE THE FOLLOWING ARRAY DECLARATION
   */
  private static Policy[] grpPolicy = new Policy[6];
  
  /*
   *  The main method will only 'direct traffic' from this point forward. 
   *  This main calls one method to build/load the array and a second method to process it.
   */
  public static void main( String[] args )
  {
    buildArray( );
    printToStrings( );
    
  } // end main
  
  /*
   *  The buildArray method instantiates 6 Policy objects and stores them in the globally 
   *   declared array.
   *  The first object instantiated will use the null constructor; all remaining objects will
   *   call the full constructor of Policy.
   *  Thus, both constructors and all set methods will be tested.
   */
  private static void buildArray( )
  {
    
    grpPolicy[0] = new Policy( );                              // Call null constructor
    grpPolicy[1] = new Policy( "Ted Arroway",                  // Call full constructor, which will call all set
                               "Ted Arroway",                  //    methods
                               "HO658542",
                               2,
                               2563.58 );
    grpPolicy[2] = new Policy( "Eleanor Arroway",
                               "Eleanor Arroway",
                               "AU002584",
                               1,
                               1503.27 );
    grpPolicy[3] = new Policy( "Drumlin, LLC",
                               "David Drumlin",
                               "HO963214",
                               2,
                               5980.73 );
    grpPolicy[4] = new Policy( "Hadden Industries",
                               "S.R. Hadden",
                               "HO658542",
                               2,
                               9870.85 );
    grpPolicy[5] = new Policy( "Palmer Joss",
                               "Palmer Joss",
                               "AU456852",
                               1,
                               813.79 );
    
  } // end buildArray
  
  /*
   *  The printToStrings method will call the toString method of each object in the array and output 
   *   the formatted String object provided.
   *  Thus, the toString method, the txtPolType method, and all get methods will be tested.
   */
  private static void printToStrings( )
  {
    System.out.printf( "%n%nList of Policy Objects in Array grpPolicy%n%n" );
    
    // Add the control statement for the ENHANCED FOR LOOP here
    for ( Policy oneContract:grpPolicy )
    {
      System.out.printf( "%s%n",
                         oneContract.toString( ) );
    } // end for loop
    
  } // end printToStrings
  
} // end Test_Policy