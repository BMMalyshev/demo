package Cycles07;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        var to = 5;
        var cols = 5;

        for (int r = 2; r < to; r += cols) {
            for (int i = 2; i <= to; i++) {
                for (int j = r; j < r + cols && j <= to; j++) {
                    var res = i * j;
                    System.out.print(i + " * " + j + " = " + res + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
