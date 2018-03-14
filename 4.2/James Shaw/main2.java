public class main2
{
    private void main(String args[])
    {
        double result = 0;
        int num1 = 5;
        int num2 = 4;
        char symbol = '+';
        
        result = math(num1, num2, symbol);
        System.out.print(result);
    }
    public double math(int num1, int num2, char symbol)
    {
        switch(symbol)
        {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }
}
