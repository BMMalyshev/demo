package Cycles07;

public class WhileProg {
    public static void main(String[] args) {
        {
            int i = 0;
            while (i < 5) {
                System.out.println(i++ + " ");
            }
            System.out.println();
        }
        {
            int i = 0;
            for ( ;i < 5; i++) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
}
