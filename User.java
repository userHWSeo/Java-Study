public class User {
    private String email;
    private String password;
    private String name;

    // 생성자를 하나라도 만들게 된다면 기본 생성자는 자동으로 안만들어짐.
    public User(String email, String name) {
        this(name, email, null);
    }

    // 생성자 오버로드
    public User(String email, String name, String password) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
