import java.awt.*;
import javax.swing.*;

/**
 * The GUI, consisting of the following areas
 *
 *   +------------------------------------------+
 *   | Output Area 1 (Single line)              |
 *   +------------------------------------------+
 *
 *   +------------------------------------------+
 *   | Output Area 2 (Scrolling multiple lines) |
 *   +------------------------------------------+
 *
 *   +---+  +---+  +---+  +---+  +---+  +---+
 *   | B |  | B |  |   |  |   |  |   |  |   |
 *   +---+  +---+  +---+  +---+  +---+  +---+
 *
 *   +---+  +---+  +---+  +---+  +---+  +---+
 *   | B |  | B |  |   |  |   |  |   |  |   |
 *   +---+  +---+  +---+  +---+  +---+  +---+
 *
 */
public class GUI
{
  private static final int W = 500;       // Width  of window pixels

  private JTextArea   theOutput1  = new JTextArea();    // Input number area
  private JTextArea   theOutput2  = new JTextArea();    // Result area
  private JScrollPane theSP       = new JScrollPane();

  private Counter counter = new Counter();
  private Logic logic     = new Logic( counter );

  /**
   * Builds visual representation of GUI and
   * associates a single action with each button.
   * Note this could be done with a visual GUI designer
   */
  public void display()
  {
    JFrame rpc           = new JFrame();            // Window
    Container cp         = rpc.getContentPane();    // Content Pane
    cp.setLayout(null);                             // No layout manager

    String openingMessage = "Counter";
    System.out.printf( openingMessage + "\n" );


    // Labels used on buttons

    String buttonNames[] = {
            "Inc",  "Dec", "",   "",   "",    "Zero",
            "",     "",    "",   "",   "+5",  "" ,
            "",     "",    "",   "",   "+10", "" };

    // Lots of constants to define positions of components

    final int BUT_R = 3;                   // Rows of button labels
    final int BUT_C = 6;                   // Cols of button labels

    final int GAP   = 10;                  // Horizontal/ vertical Gap

    final int OA1_Y = GAP;                 // Start position area 1
    final int OA1_H = 25;                  // Output area 1 Height
    final int EOA1_H= OA1_Y + OA1_H;       // End y position area 1

    final int OA2_Y = EOA1_H + GAP;        // Start position area 2
    final int OA2_H = 100;                 // Output area 2 Height
    final int EOA2_Y= OA2_Y + OA2_H;       // End y position area 2


    final int BUT_H = 45-GAP;              // Individual button height
    final int BUT_W = (W-GAP)/BUT_C;       // Individual button width
    final int OA_B_Y= EOA2_Y+GAP;          // Start position Buttons

    final int WIDTH = BUT_C*BUT_W-2*GAP;   // Width of area 1&2

    final int BUTA_H= BUT_H*(BUT_R+1)+GAP; // Height of Button area
    final int H     = EOA2_Y + BUTA_H;     // Window height

    final int LABELS = buttonNames.length; // # Button Labels

    /*
     * Physically create visual areas on the screen
     *  Output2 scrolls
     */

    rpc.setSize( W, H );                           // Size of Window

    Font font = new Font("Serif",Font.BOLD,14);    // Font is

    theOutput1.setBounds(GAP, OA1_Y, WIDTH, OA1_H);// Input Area
    theOutput1.setText( openingMessage );          // Blank
    theOutput1.setFont( font );                    //  Uses font
    cp.add( theOutput1 );                          //  Add to canvas

    font = new Font("Serif",Font.BOLD,14);         // Font is

    theSP.setBounds( GAP, OA2_Y, WIDTH, OA2_H );   // Scrolling pane
    theOutput2.setText( "" );                      //  Blank
    theOutput2.setFont( font );                    //  Uses font
    theOutput2.setEditable(false);                 //  Read only (User)
    cp.add( theSP );                               //  Add to canvas
    theSP.getViewport().add( theOutput2 );         //  In TextArea
    rpc.setVisible( true );                        // Make visible

    rpc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    /*
     * Now create buttons (using buttonNames as template)
     *   If button names length >= 1 then create button with that name
     *   Action on press is defined in method process of class Logic
     *   Method process determines action based on button name
     *
     *   If label is zero length string then do not create button
     */

    JButton buttons[] = new JButton[LABELS];

    for ( int i=0; i<LABELS; i++ )
    {
      if ( buttonNames[i].length() >= 1 )
      {
        buttons[i] = new JButton( buttonNames[i] );
        buttons[i].setBackground(Color.WHITE);
        final int col = i%BUT_C * BUT_W, row = i/BUT_C * BUT_H;
        buttons[i].setBounds( GAP+col, OA_B_Y+row, BUT_W-20, BUT_H-GAP );

        // Associate call back code with button

        buttons[i].addActionListener( e ->
          {
            String label = e.getActionCommand();

            logic.process( label );

            theOutput1.setText(
              String.format("Button \"%s\" pressed", label) );

            theOutput2.append( "" + logic.getValue() + "\n" );
            theOutput2.select(Integer.MAX_VALUE, 0);  // Scroll to end
          }
        );
        font = new Font("Serif", Font.BOLD,
                buttonNames[i].length() <= 3 ? 16 : 13 );
        buttons[i].setFont( font );

        cp.add( buttons[i] );
      }
    }
  }

}
