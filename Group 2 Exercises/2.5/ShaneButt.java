/**
 * Construct a program that reads in a number of coins (changes with iteration)
 * and calculates the least amount of coins that can be used to achieve
 * this number, the coins used are: 200p 100p 50p 20p 10p 5p 2p 1p
 *
 * the method used here is quite verbose and complicated.
 *
 * *commenting needed*
 *
 * @author Shane Butt - Student sb1451;
 * original upload date: 17/10/2017;
 * @finalVersion 12/11/2017;
 */

class Main
{
    /*
        here we set up our variables for the entire class
        'private' means they can only be used by the parent class
        we create these here so that they are shared and so we do not have to recreate or
            parse them through methods unless necessary,
            this is because they are accessible and are changed when needed
    */
    private static int NumCoins; // the number of coins used
    private static int amount; // the amount inputted
    private static int psuedoAmount; // the amount we do maths on
    private static String[] strings = new String[8]; // an empty string array of length 8 (0-7)
    private static int[] coins = {200, 100, 50, 20, 10, 5, 2, 1}; // an integer array containing the coins we will use

    public static int numCoins(int coin, int dummyAmount)
    {
        return (int) Math.ceil(dummyAmount/coin);
    } // this returns the number of coins in a given amount of change by taking the amount, 'dummyAmount' and dividing by the coin


    public static String buildString(String[] array) // note the return type 'String' rather than void.
    {
        String built = ""; // create an empty string to work with, 'built'
        for (int i = 0; i < array.length; i++) // run through the array from the first to last index
        {
	    if (array[i] != "") // if the element in the i'th index of the array is not empty
	        {
	            built = built + array[i] + " "; // we then add (concatenate) whatever 'built' contains
                // with whatever the array contains at the i'th index and then add a space at the end
	        }
        }
	    built = String.format("%-1s", built); // we then format our string
        return built; // return the string
    }
    
    public static void doMaths(String str, int amount, int coinValue, int index) // note the 'void' return type (meaning it doesnt return a value)
    {
        int pVar; // intialise an integer variable to work with
        String sVar; // intialise an empty string variable to work with
        pVar = numCoins(coinValue, amount); // change pVar to represent the number of coins
        psuedoAmount = amount - (pVar * coinValue); // take the amount and subtract how much of each coin we just used
        /* Example
        * Str = "100p";
        * Amount = 232;
        * CoinValue = 100;
        * pseudoAmount  = 132 - (2 * 100);
        *               = 32;
        * this value is then changed *globally* as it is shared through every method contained within the parent class
        */
        if (pVar>1) { sVar = String.format("%d*%s",pVar, str); } else if (pVar==1) { sVar = str; } else { sVar = ""; }
        strings[index] = sVar; // insert the string we just formatted
        // sVar would be along the lines of (following our previous example:
        // "2*100p";
        // this is because it is formatted as %d * %s (where %d is an integer format, 2, and %s is a string format, 100p
        NumCoins= NumCoins + pVar; // we then add the number of coins used to the global number of coins.
    }

    public static void main(String args[])
    {
        amount = BIO.getInt(); // set the global 'amount' a value
        psuedoAmount = amount; // set our mathematical amount to the amount
	    System.out.printf("%s %-2s\n", "Amount", "Coins"); // first print required
        while (amount!=0) // terminator is when the amount is 0
        {
            if (amount < 1 || amount > 500) // these are the set rules for the program
            {
                System.out.println("Invalid amount " + amount + "p"); // output its invalid
				amount = BIO.getInt(); // reset amount
				psuedoAmount = amount; // reset psuedo
				NumCoins = 0; // reset NumCoins;
            }
            else
            {
                for (int i = 0; i < coins.length; i++) // iterate through our coins array
                {
                    doMaths(Integer.toString(coins[i])+"p", psuedoAmount, coins[i], i); // follow doMaths method
                }
            
            	String s = buildString(strings); // build our string to output
            	System.out.printf("%3dp", amount); // first part of our line is the amount of change
	    	    if (NumCoins>0 && NumCoins < 2) { System.out.printf("%d coin  ", NumCoins); } else { System.out.printf("%4d coins  ", NumCoins); }
            	System.out.printf("%s", s);
            	amount = BIO.getInt();
	    	    psuedoAmount = amount;
	    	    NumCoins = 0;
	    }
        }
    }
}