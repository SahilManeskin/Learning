import java.util.Scanner;

public class IncrementCalculator{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        double rating = sc.nextDouble();
        if(salary>0 && rating>=1 && rating<=5){
            if(rating>=1 && rating<=3){
                System.out.println((int)(salary + (salary*0.10)));
            }else if(rating>=3.1 && rating<=4){
                System.out.println((int)(salary + (salary*0.25)));
            }else if(rating>=4.1 && rating<=5){
                System.out.println((int)(salary + (salary*0.30)));
            }
        }else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}