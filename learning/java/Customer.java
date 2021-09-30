import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.next();
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter gender:");
        String gender=sc.next();
        System.out.println("Hailing from:");
        String city=sc.next();
        System.out.println("Welcome, "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("City: "+city);
    }
}
