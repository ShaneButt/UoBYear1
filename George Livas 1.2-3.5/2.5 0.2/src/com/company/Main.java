package com.company;

public class Main {
    static int twoPounds = 200;
    static int onePound = 100;
    static int fiftyP = 50;
    static int twentyP = 20;
    static int tenP = 10;
    static int fiveP = 5;
    static int twoP = 2;
    static int oneP = 1;

    static int twoPoundCoins = 0;
    static int onePoundCoins = 0;
    static int fiftyPCoins = 0;
    static int twentyPCoins = 0;
    static int tenPCoins = 0;
    static int fivePCoins = 0;
    static int twoPCoins = 0;
    static int onePCoins = 0;

    public static String print() {
        String output = "";

        if (twoPoundCoins > 1) {
            output += "2*200p ";
        } else if (twoPoundCoins == 1) {
            output += "200p ";
        }
        if (onePoundCoins > 1) {
            output += "2*100p ";
        } else if (onePoundCoins == 1) {
            output += "100p ";
        }
        if (fiftyPCoins > 1) {
            output += "2*50p ";
        } else if (fiftyPCoins == 1)  {
            output += "50p ";
        }
        if (twentyPCoins > 1) {
            output += "2*20p ";
        } else if (twentyPCoins == 1)  {
            output += "20p ";
        }
        if (tenPCoins > 1) {
            output += "2*10p ";
        } else if (tenPCoins == 1)  {
            output += "10p ";
        }
        if (fivePCoins > 1) {
            output += "2*5p ";
        } else if (fivePCoins == 1)  {
            output += "5p ";
        }
        if (twoPCoins > 1) {
            output += "2*2p ";
        } else if (twoPCoins == 1)  {
            output += "2p ";
        }
        if (onePCoins > 1) {
            output += "2*1p ";
        } else if (onePCoins == 1)  {
            output += "1p ";
        }
        return output;
    }

    public static void findCoins(int amount) {
        int initialAmount = amount;
        int amountOfCoins = 0;
        while (amount > 0) {

            if (amount >= twoPounds) {
                amount -= twoPounds;
                twoPoundCoins++;
                amountOfCoins++;
            } else if (amount < twoPounds && amount >= onePound) {
                amount -= onePound;
                onePoundCoins++;
                amountOfCoins++;
            } else if (amount < onePound && amount >= fiftyP) {
                amount -= fiftyP;
                fiftyPCoins++;
                amountOfCoins++;
            } else if (amount < fiftyP && amount >= twentyP) {
                amount -= twentyP;
                twentyPCoins++;
                amountOfCoins++;
            } else if (amount < twentyP && amount >= tenP) {
                amount -= tenP;
                tenPCoins++;
                amountOfCoins++;
            } else if (amount < tenP && amount >= fiveP) {
                amount -= fiveP;
                fivePCoins++;
                amountOfCoins++;
            } else if (amount < fiveP && amount >= twoP) {
                amount -= twoP;
                twoPCoins++;
                amountOfCoins++;
            } else if (amount < twoP && amount >= oneP) {
                amount -= oneP;
                onePCoins++;
                amountOfCoins++;
            }
        }
        String output ;
        if (amountOfCoins == 1){
            output = (initialAmount +
                    "p\t  " +
                    amountOfCoins +
                    " coin " +
                    print()
            );
        } else {
            output = (initialAmount +
                    "p  " +
                    amountOfCoins +
                    " coins " +
                    print()
            );
        }
        System.out.println(output);
    }


    public static void isAccepted(int amount) {
        if(amount < 1 || amount > 500) {
            System.out.println("Invalid amount " + amount + "p");
        } else {
            findCoins(amount);
        }
    }


    public static void main(String[] args) {
        int amount = 1;
        System.out.println("Amount  Coins");
        while (amount != 0) {
            twoPoundCoins = 0;
            onePoundCoins = 0;
            fiftyPCoins = 0;
            twentyPCoins = 0;
            tenPCoins = 0;
            fivePCoins = 0;
            twoPCoins = 0;
            onePCoins = 0;

            System.out.println("#Enter a number");
            amount = BIO.getInt();
            if (amount == 0) {
                break;
            }
            isAccepted(amount);
        }
    }
}

//         twoPoundCoins = amount % twoPounds;
//         amount /= twoPounds;
//         onePoundCoins = amount % onePound;
//         amount /= onePound;
//         fiftyPCoins = amount % fiftyP;
//         amount /= fiftyP;
//         amount /= twentyP;
//         amount /= tenP;
//         amount /= fiveP;
//         amount /= twoP;
//         amount /= oneP;