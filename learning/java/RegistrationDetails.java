import java.util.Scanner;

class RegistrationDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.next();
        sc.nextLine();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your phoneno:");
        String phoneno=sc.nextLine();
        System.out.print("Enter your qualification:");
        String qualification=sc.nextLine();
        System.out.print("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        String email=sc.nextLine();
        System.out.print("Enter your noofexperience[if any]");
        double noofexperience=sc.nextDouble();
        sc.nextLine();
        System.out.println("Dear "+name+ " , Thanks for registering in our portal, registration id will be mailed to "+email+" within 2 working days");
        sc.close();
    }
}