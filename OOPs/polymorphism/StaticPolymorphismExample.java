package codes.OOPs.polymorphism;
class MathUtils {
    public static int add(int x, int y) {
        return x + y;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }
}

public class StaticPolymorphismExample {
    public static void main(String[] args) {
        int sum1 = MathUtils.add(1, 2);
        double sum2 = MathUtils.add(2.5, 3.7);
        int sum3 = MathUtils.add(1, 2, 3);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
