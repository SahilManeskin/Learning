import java.util.Scanner;

class ElectricityBillCalc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units consumed");
        int units=sc.nextInt();
        if(units<=20){
            System.out.println("No charge, if usage is less than or equal to 20 units.");
        }else if(units>20 && units<100){
            System.out.println("Rs.3.50 per unit, if usage is greater than 20 units and less than 100 units.");
        }else{
            System.out.println("Rs.5.00 per unit, if usage is greater than or equal to 100 units.");
        }
        sc.close();
    }
}