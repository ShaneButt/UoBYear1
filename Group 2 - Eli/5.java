/**
 * Eli Murray - ejdm11
 */

public class Main {
	public static void main(String[] args) {
		System.out.println("Amount Coins");
		while (true) {
			int change = BIO.getInt();
			if (change == 0) {						//Check for terminator in input
				System.exit(1);
			}
			if(change < 0 || change > 500) {
				System.out.println("Invalid amount " + change + "p");
			} else {
				getCoins(change);
			}
		}
	}

	private static void getCoins(int change) {
		int[] c = new int[8];
		int changeHolder = change;
		
		c[0] = changeHolder / 200;				//Count £2
		changeHolder = changeHolder % 200;		//Set changeHolder to remaining value
		
		c[1] = changeHolder / 100;				//Count £1
		changeHolder = changeHolder % 100;
		
		c[2] = changeHolder / 50;				//Count 50p
		changeHolder = changeHolder % 50;
		
		c[3] = changeHolder / 20;				//Count 20p
		changeHolder = changeHolder % 20;
		
		c[4] = changeHolder / 10;				//Count 10p
		changeHolder = changeHolder % 10;
		
		c[5] = changeHolder / 5;				//Count 5p
		changeHolder = changeHolder % 5;
		
		c[6] = changeHolder / 2;				//Count 2p
		changeHolder = changeHolder % 2;
		
		c[7] = changeHolder;					//Count 1p
		
		int count = c[0] + c[1] + c[2] + c[3] + c[4] + c[5] + c[6] + c[7];
		
		System.out.printf("%3dp%5d ", change, count);
		if (count == 1) {
			System.out.print("coin ");
		} else {
			System.out.print("coins");
		}
		
		if (c[0] == 1) { System.out.print(" 200p"); } 	else if (c[0] != 0) { System.out.print(" "+c[0]+"*200p");}
		if (c[1] == 1) { System.out.print(" 100p"); } 	else if (c[1] != 0) { System.out.print(" "+c[1]+"*100p");}
		if (c[2] == 1) { System.out.print(" 50p"); }  	else if (c[2] != 0) { System.out.print(" "+c[2]+"*50p");}
		if (c[3] == 1) { System.out.print(" 20p"); } 	else if (c[3] != 0) { System.out.print(" "+c[3]+"*20p");}
		if (c[4] == 1) { System.out.print(" 10p"); } 	else if (c[4] != 0) { System.out.print(" "+c[4]+"*10p");}
		if (c[5] == 1) { System.out.print(" 5p"); } 	else if (c[5] != 0) { System.out.print(" "+c[5]+"*5p");}
		if (c[6] == 1) { System.out.print(" 2p"); } 	else if (c[6] != 0) { System.out.print(" "+c[6]+"*2p");}
		if (c[7] == 1) { System.out.print(" 1p"); } 	else if (c[7] != 0) { System.out.print(" "+c[7]+"*1p");}
		
	}
	
}
