package Alishev.TestLambda;

import java.util.*;
import java.util.stream.Collectors;

public class TestLambda2 {
    public static void main(String[] args) {
        int[] arr10 = {Integer.parseInt(null)};
        int[] arr11 = {};


        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

//        for (int i = 0; i < 10; i++) {
//            arr[i] = arr[i] * 2;
//            list.set(i, list.get(i) * 2);
//        }

        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());

        arr1 = Arrays.stream(arr1).map(a -> 3).toArray();
        arr1 = Arrays.stream(arr1).map(a -> a + 1).toArray();

        // filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();

        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));

        //forEach среда разработки упростила (а -> sout(a)) до System.out::println
        Arrays.stream(arr2).forEach(System.out::println);
        list2.stream().forEach(System.out::println);

        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        // reduce - сжимает набор данных до 1го элемента
        // [1,2,3] - acc = 1, на второй итерации acc = 1 + 2 = 3, на третьей acc = 3 + 3 = 6
        int sum = Arrays.stream(arr3).reduce(0, (acc, b) -> acc + b); // т.к. назначили начальное значение аккумулятора, от не надо приводить к int
        //int sum = Arrays.stream(arr3).reduce(0, Integer::sum); // можно привести к такому виду

        int sum_ = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt(); // не указали начальное значение аккумулятора, надо приводить к int
        //int sum_ = Arrays.stream(arr3).reduce(Integer::sum).getAsInt(); // не указали начальное значение аккумулятора, надо приводить к int
        int sum2 = list3.stream().reduce((acc, b) -> acc + b).get();

        System.out.println(sum);
        System.out.println(sum2);

        int[] arr4 = new int[10];
        fillArr(arr4);

        int[] newArr = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(newArr));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}

