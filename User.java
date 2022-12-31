public class User extends Consumer{

    String userName;                    //Consumer class'ından türettiğimiz bu class ile oluşturacağımız objeleri kullanıcı hesapları gibi kullanabiliriz.
    String password;                    //Bu bizim kuracağımız sistemde ekleme,düzenleme,silme gibi işlemleri yetkisi olan kullanıcıların kullanabilmesine olanak sağlar.
    boolean loginStatus = false;

    public User(int id, String lastName, String firstName, String userName, String password){
        super(id, id, id, firstName, lastName);
        this.userName=userName;
        this.password=password;
    }
    
}
