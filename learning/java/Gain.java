import java.util.Scanner;

public class Gain{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of old scooter:");
        int old_price = sc.nextInt();
        System.out.println("The amount spent for repair:");
        int repair = sc.nextInt();
        System.out.println("Sold Price:");
        int new_price = sc.nextInt();
        double gain = 0;
        if(old_price<=0 || new_price<=0 || repair<0){
            System.out.println("Incorrect Inputs");
        }else{
            if(new_price > (old_price+repair)){
                gain = (double) (( (double) (new_price-(old_price+repair))*100)/(old_price+repair));
                System.out.println("Gain percentage is "+String.format("%.2f",gain));
            }else{
                System.out.println("Unable to calculate Gain Percentage");
            }
        }
    }
}