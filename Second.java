package lesson1.hw;

import java.math.BigInteger;

public class Second {
    public static void main(String[] args) {
        int number = 1000;
        for(int i = 2; i < number; i++){
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            if(probablePrime){
                System.out.println(i);
            }
        }
    }
}
