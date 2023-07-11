public class SportsCar extends Car2 {
    public SportsCar(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("4륜 구동으로 동작합니다.");
    }
}
