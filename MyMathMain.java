public class MyMathMain {
    public static void main(String[] args) {
        int value = MyMath.abs(-5);
        System.out.println(value);

        // Private으로 인한 Error
        // MyMath m = new MyMath();
    }
}
