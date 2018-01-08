/**
 * work out the minimum number of coins to be delivered in change for an amount of money between 1p and 500p
 *
 * @author James Shaw - Student jps60
 * @version 07/10/2017
 */
 
class Main
{
    public static void main(String args[])
    {
	int money = BIO.getInt();								//get money as input
        int coins = 0;
        String result = "";
        int amount = 0;										//create other variables
       
        System.out.println("Amount Coins");							//print "Amount Coins"
        while (money != 0)									//while money does not equal 0
        {
            if (money > 500 || money < 1)							//if money is greater than 500 OR less than 1
            {
                System.out.printf("%-15s %4s", "Invalid amount", money+"p");			/*print out a warning
		    										 *I'm using printf to format this. 
												 *%-15s is used to format the string "Invalid amount" and says this must be 15 characters long and left aligned
												 *%4s is used to format the money+"p" part and says this must be 4 characters long and right aligned
		    										 *if the string isnt as long as the formatting says it should be, the extra space is filled with whitespace
												 */
		money = BIO.getInt();								//get a new value for money
            }
            else										//if money is between 500 and 1
            {
                int math = money / 200;								//calculate how many £2 coins go into money
                int left = money % 200;								//calculate whats left
                if (math == 1)									//if only 1 £2 coin goes into money
                {
                    coins = coins + math;							//add the number of £2 coins to the total
                    result = result + "200p ";							//add "200p " to the end of the result string
                }
                else if (math >= 2)								//if 2 or more £2 coins go into money
                {
                    coins = coins + math;							//add the number of £2 coins to the total
                    result = result + math + "*200p ";						//add the number of £2 coins plus "*200p " to the end of the result string
                }
                
                math = left / 100;								//calculate how many £1 coins go into money
                left = left % 100;								//calculate whats left
                if (math == 1)									//if only 1 £1 coin goes into money
                {
                    coins = coins + math;							//add the number of £1 coins to the total
                    result = result + "100p ";							//add "100p " to the end of the result string
                }
                else if (math >= 2)								//if 2 or more £1 coins go into money
                {
                    coins = coins + math;							//add the number of £1 coins to the total
                    result = result + math + "*100P ";							//add the number of £1 coins plus "*100p " to the end of the result string
                }
                
                math = left / 50;								//
                left = left % 50;								//
                if (math == 1)									//
                {										//
                    coins = coins + math;							//
                    result = result + "50p ";							//Do the same for 50p
                }										//
                else if (math >= 2)								//
                {										//
                    coins = coins + math;							//
                    result = result + math + "*50P ";						//
                }										//
                
                math = left / 20;								//
                left = left % 20;								//
                if (math == 1)									//
                {										//
                    coins = coins + math;							//
                    result = result + "20p ";							//Do the same for 20p
                }										//
                else if (math >= 2)								//
                {										//
                    coins = coins + math;							//
                    result = result + math + "*20p ";						//
                }										//
                
                math = left / 10;								//
                left = left % 10;								//
                if (math == 1)									//
                {										//
                    coins = coins + math;							//
                    result = result + "10p ";							//Do the same for 10p
                }										//
                else if (math >= 2)								//
                {										//
                    coins = coins + math;							//
                    result = result + math + "*10P ";						//
                }										//
                
                math = left / 5;								//
                left = left % 5;								//
                if (math == 1)									//
                {										//
                    coins = coins + math;							//
                    result = result + "5p ";							//Do the same for 5p
                }										//
                else if (math >= 2)								//
                {										//
                    coins = coins + math;							//
                    result = result + math + "*5p ";						//
                }										//
                
                math = left / 2;								//
                left = left % 2;								//
                if (math == 1)									//
                {										//
                    coins = coins + math;							//
                    result = result + "2p ";							//Do the same for 2p
                }										//
                else if (math >= 2)								//
                {										//
                    coins = coins + math;							//
                    result = result + math + "*2p ";						//
                }										//
                
                math = left;									//Dont need to divide by anything as dividing by 1 gives you what you started with    
                if (math == 1)									//Also dont need to calculate whats leftover because there wont be anything left
                {										//
                    coins = coins + math;							//
                    result = result + "1p ";							//
                }										//Do the same for 1p
                else if (math >= 2)								//
                {										//
                    coins = coins + math;							//
                    result = result + math + "*1P ";						//
                }										//
                
                if (coins == 1)									//if coins equals 1
                {
                    System.out.printf("%4s %1s %-20s", money+"p","", coins+" coin "+ result);	//Returns the result
		}
                else										//if coins is 2 or more
                {
                    System.out.printf("%4s %1s %-20s", money+"p","", coins+" coins "+ result);	//return the result
                }
                coins = 0;
                result = "";									//reset coins and result
                money = BIO.getInt();								//get next value for money as input
            }
        }
    }
}
