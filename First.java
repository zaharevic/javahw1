package lesson1.hw;
import java.util.Scanner;
public class First {
    static int NumbersSum(int n){
        int sum = 0;
        for(int i = 0; i < n+1; i++){
            sum += i;
        }
        return sum;
    }
    
    static int Facktorial(int n){
        int temp = 1;
        for(int i = 1; i < n+1; i++){
            temp = temp * i;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter nuber: ");
        if(scan.hasNextInt()){
            int i = scan.nextInt();
            int sum = NumbersSum(i);
            System.out.printf("Triangular number: %d \n", sum);
            int facktor = Facktorial(i);
            System.out.printf("Facktorial number: %d \n", facktor);
        }
        else{
            System.out.println("Error!");
        }
        scan.close();
    }
}
