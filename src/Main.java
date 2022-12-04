import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int percent = 0;
    while (number>0){
         number= number /10;
        percent++;
    }
        System.out.println("Loading...");
        TimeUnit.SECONDS.sleep(5);
        System.out.println(percent+" Орунду сан");
    }
}
