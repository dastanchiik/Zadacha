import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);//todo sdfghjkdfghkjgfh
    Random scanner1 = new Random();
    int number = scanner1.nextInt(1000000);
    int number2 = number;
    int percent = 0;
    while (number>0){
         number= number /10;
        percent++;
    }
        System.out.println("Loading...");
        TimeUnit.SECONDS.sleep(5);
        System.out.println(number2);
        System.out.println(percent+" Орунду сан");
    }
}

