import java.util.Scanner;
public class Loops{
    public static void main(String args[]){
        int input;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        input=sc.nextInt();
        if(input > 18)
            System.out.println("You are eligible to vote");
        else if(input > 20)
            System.out.println("You are major and eligible to vote");
        else
            System.out.println("You are NOT a major and Not eligible to vote");
        int choice;
        System.out.println("Pick one:\n1. Hi\n2. Hey\n3. Hello\n");
        choice = sc.nextInt();
        switch(choice){
            case 1 : System.out.println("You said Hi");
                     break;
            case 2 : System.out.println("You said Hey");
                     break;
            case 3 : System.out.println("You said Hello");
                     break;
            default : System.out.println("Invalid choice");
    }
}
}