public class Main {
	public static void main(String[] args) {
		int sqr = BIO.getInt();

		if (sqr < 5 || sqr > 41) {
			System.out.println("Side of diamond ("+sqr+") must be between 5 & 41");
			System.exit(1);
		} else if (sqr % 2 == 0) {
			System.out.println("Side of diamond ("+sqr+") must be odd");
			System.exit(1);
		}

		int half = sqr/2;
	    for (int row=0; row<sqr; row++)
	    {
	        for (int column=0; column<sqr; column++)
	        {
	            if ((column == Math.abs(row - half)) || (column == (row + half)) || (column == (sqr - row + half - 1)))
	            {
	                System.out.print("*");
	            }
	            else System.out.print(".");
	        }
	        System.out.println();
	    }
	}
}