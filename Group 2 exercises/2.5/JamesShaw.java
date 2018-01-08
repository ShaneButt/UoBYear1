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
        int coins = 0;
        int money = BIO.getInt();
        String result = "";
        int amount = 0;
       
        System.out.println("Amount Coins");
        while (money != 0)
        {
            if (money > 500 || money < 1)
            {
                System.out.printf("%-15s %4s", "Invalid amount", money+"p");
				money = BIO.getInt();
            }
            else
            {
                int math = money / 200;
                int left = money % 200;
                if (math == 1)
                {
                    coins = coins + math;
                    result = result + "200p ";
                }
                else if (math >= 2)
                {
                    coins = coins + math;
                    result = result + math + "*200p ";
                }
                
                math = left / 100;
                left = left % 100;
                if (math == 1)
                {
                    coins = coins + math;
                    result = result + "100p ";
                }
                else if (math >= 2)
                {
                    coins = coins + math;
                    result = result + math + "*100P ";
                }
                
                math = left / 50;
                left = left % 50;
                if (math == 1)
                {
                    coins = coins + math;
                    result = result + "50p ";
                }
                else if (math >= 2)
                {
                    coins = coins + math;
                    result = result + math + "*50P ";
                }
                
                math = left / 20;
                left = left % 20;
                if (math == 1)
                {
                    coins = coins + math;
                    result = result + "20p ";
                }
                else if (math >= 2)
                {
                    coins = coins + math;
                    result = result + math + "*20p ";
                }
                
                math = left / 10;
                left = left % 10;
                if (math == 1)
                {
                    coins = coins + math;
                    result = result + "10p ";
                }
                else if (math >= 2)
                {
                    coins = coins + math;
                    result = result + math + "*10P ";
                }
                
                math = left / 5;
                left = left % 5;
                if (math == 1)
                {
                    coins = coins + math;
                    result = result + "5p ";
                }
                else if (math >= 2)
                {
                    coins = coins + math;
                    result = result + math + "*5p ";
                }
                
                math = left / 2;
                left = left % 2;
                if (math == 1)
                {
                    coins = coins + math;
                    result = result + "2p ";
                }
                else if (math >= 2)
                {
                    coins = coins + math;
                    result = result + math + "*2p ";
                }
                
                math = left;
                if (math == 1)
                {
                    coins = coins + math;
                    result = result + "1p ";
                }
                else if (math >= 2)
                {
                    coins = coins + math;
                    result = result + math + "*1P ";
                }
                
                if (coins == 1)
                {
                    System.out.printf("%4s %1s %-20s", money+"p","", coins+" coin "+ result);
                }
                else
                {
                    System.out.printf("%4s %1s %-20s", money+"p","", coins+" coins "+ result);
                }
                coins = 0;
                result = "";
                money = BIO.getInt();
            }
        }
    }
}