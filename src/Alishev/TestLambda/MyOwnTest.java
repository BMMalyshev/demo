package Alishev.TestLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.currentTimeMillis;

public class MyOwnTest {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        long a = currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arr.add(100 - i);
        }

        long b = currentTimeMillis();
        System.out.println(b - a);
    }
}
