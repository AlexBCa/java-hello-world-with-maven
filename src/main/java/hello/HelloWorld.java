package hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Current time:");
        System.out.println(java.time.LocalTime.now());

        System.out.println("Greeting:");
        System.out.println(new Greeter().sayHello());

        System.out.println("Args count:");
        System.out.println(args == null ? 0 : args.length);

        System.out.println("Java version:");
        System.out.println(System.getProperty("java.version"));

        System.out.println("Thread name:");
        System.out.println(Thread.currentThread().getName());
    }
}
