// 람다식은 하나의 추상 메소드가 있는 인터페이스만
@FunctionalInterface
interface MathOperation{
    int oprate(int a, int b);

    // 에러. 하나의 추상 메소드만
//    int extraMethod();
}

public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation mul = (a, b) -> a * b;

        System.out.println(add.oprate(3,4) + ", " + mul.oprate(4,6));
    }
}