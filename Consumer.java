public class Consumer{

    int id;                       //Oyuncu, yazar, kullanıcı benzeri tüm karakterler bu class üzerinden türetilir.
    int birth_year;
    int salary;
    String firstName;
    String lastName;

    public Consumer(int id, int birth_year, int salary, String firstName, String lastName){
        this.id=id;
        this.birth_year=birth_year;
        this.salary=salary;
        this.firstName=firstName;
        this.lastName=lastName;
    }

}