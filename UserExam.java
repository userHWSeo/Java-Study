public class UserExam {
    public static void main(String[] args) {
        User user = new User("test@gmail.com", "테스트 !");

//        System.out.println(user.getEmail());
//        System.out.println(user.getName());

        System.out.println(user);

        User user2 = new User("test@gmail.com", "홍길동", "1234" );

//        System.out.println(user.getEmail());
//        System.out.println(user.getName());
//        System.out.println(user.getPassword());

        System.out.println(user2);
    }
}
