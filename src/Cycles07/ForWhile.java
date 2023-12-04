package Cycles07;

public class ForWhile {
    public static void main(String[] args) {

        int i = 0;
        while(i < 100) {
            System.out.print(i++ + "\t");
            if (i % 10 == 0 ){
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
}
