package Alishev.TestLambda;


interface Executable1 {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable1 e){
        int a = e.execute(3,10);
        System.out.println(a);
    }
}

class ExecutableImplementation implements Executable1 {

    @Override
    public int execute(int x, int y) {
        System.out.println("Hello");
        return x * 5;
    }
}

public class TestLambda1 {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation());

        //int a = 1;
        runner.run(new Executable1() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Hello2");
                int a = 2;
                return x + y;
            }
        });

        runner.run((int x, int y) -> {
            System.out.println("hello3");
            System.out.println("hello4");

            return x + 5;
        });

        final int a = 1; // в лямбду можно передать константу (final)
        // супер-короткая запись, что анонимный класс возвращает такое-то значение
        runner.run((x, y) -> x + y + a); // если входной аргумент только один - можно его в круглые скобки не оформлять
        // область видимости лямбды - снаружи лямбды, поэтому нельзя внутри лямбды переопределять переменные
    }
}

//        // Анонимный метод
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//                System.out.println("Hello2");
//                System.out.println("Hello3");
//
//            }
//        });
//
//        // Лямбда-выражение, как удобная замена анонимного метода
//        Thread thread2 = new Thread(() -> {
//            System.out.println("Hello");
//            System.out.println("Hello2");
//            System.out.println("Hello3");
//
//        });

