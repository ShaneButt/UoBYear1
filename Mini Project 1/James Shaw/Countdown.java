import java.lang.Thread;//Use External class
class Countdown
{
    public static void main( String args[] )//Main entry point
    {
         int countdown=10;//Start from 10
         while ( countdown > 0 )//While greater than 0
         {
             System.out.println(countdown);// Write contents of countdown
             if ( countdown == 3 )// If equal to 3
             {
                 System.out.println("Ignition"); // Write Ignition
             }
             
             countdown--;// Decrement countdown by 1
             
             try {
                 Thread.sleep( 100 );// 1000 milliseconds delay
             }
             catch( InterruptedException e ) {}
         }
         System.out.println( "//Blast Off" );//Write Blast off
         //writing comments because reasons
     }
}