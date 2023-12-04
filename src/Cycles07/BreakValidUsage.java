package Cycles07;

import java.util.Random;
import java.util.Scanner;

public class BreakValidUsage {
    public static void main(String[] args) {
        // infinite loop
        //
        System.out.println("Guess number 0..100");
        var number = new Random().nextInt(10);
        var guessed = false;
        for (int i = 0; i < 10; i++) {
            var guess = new Scanner(System.in).nextInt();
            if(guess < number){
                System.out.println("Загаданное число больше " + guess);
            } else if (guess > number) {
                System.out.println("Загаданное число меньше " + guess);
            } else {
                guessed = true;
                System.out.println("Загаданное число действительно " + number);
                break;
            }
        }
        if(!guessed){
            System.out.println("Лошара");
        }
    }
}
