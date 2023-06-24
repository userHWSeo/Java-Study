public class Hello2 {
    static int i;
    static {
        i = 500;
        System.out.println("static block"); // 원래는 static field를 초기화한다.
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
// 스태틱 블록이 main보다 먼저 실행 !
// javac Hello2.java
// java Hello2