public class Car2Exam02 {
    public static void main(String[] args) {
//        Car2 c = new Car2("test");

//        Bus2 b = new Bus2();
//        SportsCar s = new SportsCar("sportsCar!");
//        b.run();
//        s.run();
//

        Car2[] array = new Car2[2];
        array[0] = new Bus2();
        array[1] = new SportsCar("sportsCar !");
        for(Car2 c2 : array){
            c2.run();
        }
    }
}
