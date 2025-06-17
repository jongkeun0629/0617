import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        // 람다
        Arrays.stream(names).forEach(name -> System.out.println(name));

        System.out.println();

        // 메소드 참조
        Arrays.stream(names).forEach(System.out::println);
    }
}