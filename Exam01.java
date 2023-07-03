public class Exam01 {
    public static void main(String[] args) {

        // 되도록 필드는 직접적으로 접근하지 않는다. (정보은닉)

        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("--------------------------");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("--------------------------");
        Parent p2 = new Child(); // Child는 Parent의 후손이다. 혹은 자식이다.
        System.out.println(p2.i);
        p2.printI();
        p2.printII();
    }
}
