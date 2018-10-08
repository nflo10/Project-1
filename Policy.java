/* PA1 
 * @ Author Nicholas Flores
 * @ IS 2043 003
 * 
 * This is a program that produces output of a policy owner's full name, who is insured, what type of policy
 * they have, and the amount of the premium of the policy. 
 */


public class Policy
{
  /*
   * INSTANCE VARIABLES
   */
  private String owner;                 // policy owners full, legal name
  private String insured;               // full, legal name of names insured on policy 
  private String polNbr;                // unique identifier for specific policy 
  private int polType;                    // interger code indicated type of policy: 1: Auto 2: Homeowners
  private double polPrem;           // annual premium amount for policy 
  
  /*
   * CONSTRUCTORS
   */
  public Policy( String own,
                String insd, 
                String nbr, 
                int type,
                double prem)
  { 
    setOwner( own );
    setInsured( insd );
    setPolNbr( nbr );
    setPolType( type );
    setPrem( prem );
  } //end full constructor 
  
  public Policy( )
  {
    // This is intended to be empty 
  } //end null constuctor
  
  /*
   * SET METHODS
   */ 
  public final void setOwner( String own )
  {
    owner = own;
  } // end setOwner
  
  public final void setInsured( String insd )
  {
    insured = insd; 
  } //end setInsured
  
  public final void setPolNbr( String nbr )
  {
    polNbr = nbr;
  } // end setPolNbr
  
  public final void setPolType( int type )
  {
    polType = type;
  } // end setPolType
  
  public final void setPrem( double prem )
  {
    polPrem = prem;
  }// end setPolPrem
  
  /*
   * GET METHODS
   */
  public final String getOwner( )
  {
    return owner;
  } // end getOwner
  
  public final String getInsured( )
  {
    return insured;
  } // end getInsured
  
  public final String getPolNbr( )
  {
    return polNbr;
  } //end getPolNbr
  
  public final int getPolType( )
  {
    return polType;
  } // end getPolType
  
  public final double getPrem( )
  {
    return polPrem;
  } // end getPrem
  
  /*
   * OTHER METHODS AS NEEDED
   */
  
  public String txtPolType( )
  {
    String type = " ";
    
    if ( polType == 1 )
    {
      type = "AUTO";
    }
    if ( polType != 1 )
    {   
      type = "HOMEOWNERS";
    }
    return type;
  } //end txtPolType
  
  public String toString() 
  {
    // Return a verbose description of the Policy Object. 
    return String.format( "%s owns Policy %s, a(n) %s policy, insuring %s, with a premium of $%,.2f.",
                         getOwner( ),
                         getPolNbr( ),
                         txtPolType( ),
                         getInsured( ),
                         getPrem( ) );
  } //end toString
  
} //end class Policy