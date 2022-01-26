import java.util.Scanner;

public class Wk1Q2 
{
    public static void main(String arg[])
    {
        System.out.println("Enter a module code:");
        Scanner input= new Scanner(System.in);
        String module=input.next();
        switch(module)
        {
            case"CSC1009":
                System.out.println("Object Orientated Programming");
                break;
            default:
            System.out.println("Unknown Module");;
        }
        input.close();
    }
}