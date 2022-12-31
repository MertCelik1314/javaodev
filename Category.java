public class Category {
    
    int id;                         //Sisteme ekleyeceğimiz objeleri daha rahat sınıflandırmak ve işlem yapmayı kolaylaştırmak için kullanılan class.
    String categoryCode;
    String categoryName;

    public Category(int id, String code, String name){
        this.id=id;
        this.categoryCode=code;
        this.categoryName=name;
    }
}
