class Main
{
    public static void main(String args[])
    {
        String name = BIO.getString();
        while ( !name.equals("END") )
        {
            int Cw = BIO.getInt();
            int Ex = BIO.getInt();
            double Mark = (double) (Cw + Ex)/2;
            
            if (Mark < 40.0)
            {
                System.out.println(name + "["+Cw+","+Ex+"] " + Mark + " Fail");
            }
            else if (Mark >= 40.0 && !(Cw<30||Ex<30))
            {
                System.out.println(name + "["+Cw+","+Ex+"] " + Mark + " Pass");
            }
            else
            {
                System.out.println(name + "["+Cw+","+Ex+"] " + Mark + " Fail [Threshold]");
            }
	    name = BIO.getString();
        }
    }
}