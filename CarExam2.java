public class CarExam2 {

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1);
        c1.printName();

        Car c2 = new Car("Ray");
        c2.printName();

    }
}
