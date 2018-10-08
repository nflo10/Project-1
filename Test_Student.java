/*
 * This is a simple harnest exercise to test all the methods/functions of class Student. 
 * MAKE SURE YOU TEST EVERYTHING
 */

public class Test_Student
{
  /* ARRAYS
   */
  private static Student[] studentArray = new Student[4];                                               // this array is  visible(global) for the entire duration. 
  //Global data is a BIG risk. //building array for 4 students.
  
  /* MAIN is a manager, delegates methods/functions.
   */
  public static void main(String[] args)                                    
  {
    buildArray( );
    reviewArray( );
  } // end main 
  
  // I can make it private because this program 
  //is only going to be seen within this Main.
  private static void buildArray( )
  {
    //This has tested the null constructors and the set methods 
    studentArray[0] = new Student( );
    
    studentArray[1] = new Student( "abc123",
                                  "Bull",
                                  "Jason",
                                  15,
                                  1.3 );
    studentArray[2] = new Student( "sdg525",
                                  "John",
                                  "Robets",
                                  17,
                                  2.8 );
    studentArray[3] = new Student( "bgr854",
                                  "Arroway",
                                  "Eleanor",
                                  210,
                                  4.0 );
  }   //end buildArray
  
  private static void reviewArray( )
  {
    System.out.printf( "%n\t\t Student Objects from Array%n%n" );
    
    //will write enhanced for loops on exams.
    for ( Student joe: studentArray )                                                                                              // joe is just a local name //what its doing is creating the
      // loop control variable, increments. 
    {
      System.out.printf(  "%s", 
                        joe.toString( ) );                                                                                              //calls get methods , and other methods provide and toString
    }   //end for loop
  }   //end reviewArray
  
} // end class Test_Student