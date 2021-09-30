import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the month:");
        int number=sc.nextInt();
        if(number==12 && number == 1 && number==2){
            System.out.println("Season:Winter");
        }else if(number>=3 && number<=5 ){
            System.out.println("Season:Spring");
        }else if(number>=6 && number<=8){
            System.out.println("Season:Summer");
        }else if(number>=9 && number<=11){
            System.out.println("Season:Autumn");
        }else{
            System.out.println("Invalid Month");
        }
        sc.close();
    }
}
