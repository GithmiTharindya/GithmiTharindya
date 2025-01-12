// Abstract class to represent a user
public abstract class User {
    private static String name;
    private String password;

    public User(String name,String password) {
        this.name = name;
        this.password=password;
    }

    public static String getName() {
        return name;
    }

    public boolean verifyPassword(String password){
        return this.password.equals(password);
    }
}
