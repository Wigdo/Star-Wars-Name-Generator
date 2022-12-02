

import java.util.Scanner;

public class Input
{

    private Scanner sc;

    public Input ()
    {
        sc = new Scanner(System.in);
    }

    public double acceptDoubleInput ()
    {
        double d = sc.nextDouble();
        return d;
    }

    public int acceptIntegerInput()
    {
        int i = sc.nextInt();
        return i;
    }

    public String acceptStringInput()
    {
        String x = sc.nextLine();
        return x;
    }
}
