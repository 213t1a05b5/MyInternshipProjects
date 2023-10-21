import java.util.Scanner;
class tempconverter
{
    public static void main(String args[])
    {
        double f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose type of conversion\n 1.Celsius  2.Fahrenheit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter temperature in celsius: ");
            c=sc.nextDouble();
            f=((c*9)/5)+32;
            System.out.println("Fahrenheit temperature is: "+f);
            break;
            case 2:
            System.out.println("Enter temperature in fahrenheit: ");
            f=sc.nextDouble();
            c=(f-32)*5/9;
            System.out.println("Celsius temperature is: "+c);
            break;
            default:
            System.out.println("Enter valid choice!...");
        }
    }
}