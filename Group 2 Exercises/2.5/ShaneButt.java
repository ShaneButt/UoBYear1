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
    private static int NumCoins;
    private static int amount;
    private static int psuedoAmount;
    private static String[] strings = new String[8];
    private static int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};

    public static int numCoins(int coin, int dummyAmount)
    {
        return (int) Math.ceil(dummyAmount/coin);
    }

    public static String buildString(String[] array)
    {
        String built = "";
        for (int i = 0; i < array.length; i++)
        {
	    if (array[i] != "")
	    {
             	built = built + array[i] + " ";
	    }
        }
	built = String.format("%-1s", built);
        return built;
    }
    
    public static void doMaths(String str, int amount, int coinValue, int index)
    {
        int pVar;
        String sVar;
        pVar = numCoins(coinValue, amount);
        psuedoAmount = amount - (pVar * coinValue);
        if (pVar>1) { sVar = String.format("%d*%s",pVar, str); } else if (pVar==1) { sVar = str; } else { sVar = ""; }
        strings[index] = sVar;
        NumCoins= NumCoins + pVar;
    }

    public static void main(String args[])
    {
        amount = BIO.getInt();
        psuedoAmount = amount;
	    System.out.printf("%s %-2s\n", "Amount", "Coins");
        while (amount!=0)
        {
            if (amount < 1 || amount > 500)
            {
                System.out.println("Invalid amount " + amount + "p");
				amount = BIO.getInt();
				psuedoAmount = amount;
				NumCoins = 0;
            }
            else
            {
                int p200, p100, p50, p20, p10, p5, p2, p1;
                String s200, s100, s50, s20, s10, s5, s2, s1;
                
                for (int i = 0; i < coins.length; i++)
                {
                    doMaths(Integer.toString(coins[i])+"p", psuedoAmount, coins[i], i);
                }
            
            	String s = buildString(strings);
            	System.out.printf("%3dp", amount);
	    	if (NumCoins>0 && NumCoins < 2) { System.out.printf("%d coin  ", NumCoins); } else { System.out.printf("%4d coins  ", NumCoins); }
            	System.out.printf("%s", s);
            	amount = BIO.getInt();
	    	psuedoAmount = amount;
	    	NumCoins = 0;
	    }
        }
    }
}