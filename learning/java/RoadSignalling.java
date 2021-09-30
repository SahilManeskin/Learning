import java.util.Scanner;

class RoadSignalling{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the color:");
        String color=sc.next();
        switch(color){
            case "green":
                System.out.println("go");
                break;
            case "red":
                System.out.println("stop");
                break;
            case "yellow":
                System.out.println("proceed with caution");
                break;
            case "white":
                System.out.println("prepare to go");
        }
    }
}