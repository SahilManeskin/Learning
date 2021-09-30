import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String initial="RAINBOW";
        int len=initial.length();
        String[] arr=new String[len];
        System.out.println("Enter the first letter:");
        arr[0]=sc.nextLine();
        System.out.println("Enter the second letter:");
        arr[1]=sc.nextLine();
        System.out.println("Enter the third letter:");
        arr[2]=sc.nextLine();
        System.out.println("Enter the fourth letter:");
        arr[3]=sc.nextLine();
        System.out.println("Enter the fifth letter:");
        arr[4]=sc.nextLine();
        System.out.println("Enter the sixth letter:");
        arr[5]=sc.nextLine();
        System.out.println("Enter the seventh letter:");
        arr[6]=sc.nextLine();
        String userInput=String.join("",arr);
        if(initial.equals(userInput)){
            System.out.println(initial);
        }else{
            System.out.println("The spelling is wrong");
        }
        sc.close();
    }
}
