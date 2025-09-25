package hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Starting operations...");
        
        java.lang.Math.addExact(1, 2);
        java.lang.Math.addExact(10, 35);
        java.lang.Math.addExact(-5, 3);
        java.lang.Math.addExact(1_000_000_000, 1);           
        java.lang.Math.addExact(1_000_000_000L, 2_000_000_000L); 
        java.lang.Integer.sum(7, 8);
        java.lang.Long.sum(100L, 200L);
        java.util.stream.IntStream.of(1, 2, 3, 4).sum();
        java.util.stream.LongStream.of(5L, 6L, 7L).sum();

        System.out.println("Operations finished.");
    }
}
