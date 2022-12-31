public class User extends Consumer{

    String userName;
    String password;
    boolean loginStatus = false;

    public User(int id, String lastName, String firstName, String userName, String password){
        super(id, id, id, firstName, lastName);
        this.userName=userName;
        this.password=password;
    }
    
}
