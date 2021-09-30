import java.util.Scanner;

public class CinemaTicket{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of ticket:");
        int n = sc.nextInt();
        if(n>=5 && n<= 40){
            System.out.print("Do you want refreshment:");
            String r = sc.next();
            System.out.print("Do you have coupon code:");
            String c = sc.next();
            System.out.print("Enter the circle:");
            String circle = sc.next();
            double total = 0, dis = 0;
            switch(circle)
            {
                case "k": 
                    total = n*75;
                    if(n>20) 
                        total -= (total*0.10);
                    if(c.equalsIgnoreCase("y"))
                        total -= (total*0.02);
                    if(r.equalsIgnoreCase("y"))
                        total += (n*50);
                    System.out.println("Ticket cost:"+String.format("%.2f",total));
                    break;
                case "q":
                    total = n*150;
                    if(n>20) 
                        total -= (total*0.10);
                    if(c.equalsIgnoreCase("y"))
                        total -= (total*0.02);
                    if(r.equalsIgnoreCase("y"))
                        total += (n*50);
                    System.out.println("Ticket cost:"+String.format("%.2f",total));
                    break;
                default: 
                    System.out.println("Invalid Input");
            }
        }
        else{
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
    }
}