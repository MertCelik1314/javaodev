import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class DisneyPlus {                   //Önceden oluşturduğumuz tüm özellikleri kendi altından birleştirip kullanan class.
    
    ArrayList<Asset> assets = new ArrayList<>();
    User credential=null;
    boolean isLogin= false;

    public DisneyPlus(ArrayList<Asset> assets){
        this.assets=assets;
    }

    public void login(User user){                    //Giriş yapmaya çalışan kullanıcı deneme yaptığı hesabın bilgilerini girer. Eğer bilgiler doğru ise sisteme girişi sağlanır
        String userName = user.userName, uNameIn;   //Ve sistem üzerinde işlem yapmasına izin verilir.
        String password = user.password, passwdIn;

        Scanner sc = new Scanner(System.in);

        int a=5;

        while( a!= 5){

            System.out.println("Username :");
            uNameIn = sc.next();

            System.out.println("Password :");
            passwdIn = sc.next();

            if( Objects.equals(passwdIn, password) && Objects.equals(userName, uNameIn)){

                isLogin=true;
                break;
            }else{
                System.out.println("Inputs are not correct!!!!");
                a--;
            }
        }
        sc.close();
    }

    public void addMovie(Movie mov1){       //Kullanıcı girişi başarılı olduğu sürece sisteme film türünde objeler ekler.
        if(!isLogin)
        return;

        assets.add(mov1);
    }

    public void addBook(Book book1){        //Kullanıcı girişi başarılı olduğu sürece sisteme kitap türünde objeler ekler.
        if(!isLogin)
        return;

        assets.add(book1);
    }

    public void addAsset(Asset asset1){     //Kullanıcı girişi başarılı olduğu sürece sisteme türü fark etmeksizin bir obje ekler.
        if(!isLogin)
        return;

        assets.add(asset1);
    }

    boolean removeMovie(int movieId){       //Silinmek istenen film objesi sistemde varsa siler ve 'true' döndürür. Sistemde aranan obje yoksa 'false' döndürür.
        int counter=0;
        for( Asset a:assets){

            if(a.type == "Movie" && a.id==movieId){
                assets.remove(counter);
                return true;
            }
            counter++;
        }
        return false;
    }

    boolean removeBook(int bookId){        //Silinmek istenen kitap objesi sistemde varsa siler ve 'true' döndürür. Sistemde aranan obje yoksa 'false' döndürür.
        int counter = 0;
        for(Asset a: assets){

            if(a.type == "Book" && a.id== bookId){
                assets.remove(counter);
                return true;
            }
            counter++;
        }
        return false;
    }

    public void oldestActor(Movie m1){          //Parametre olarak verilen film objesinin tüm oyuncularını kontrol eder ve yaşı en büyük olan oyunucunun bilgilerini ekrana basar.
        Consumer oldest = m1.actors.get(0);

        for(Consumer a: m1.actors){
            if( a.birth_year < oldest.birth_year ){
                oldest = a;
            }
        }

        System.out.println("------------------");
        System.out.println("Oldest actor is :" + oldest.firstName + " " + oldest.lastName);
        System.out.println("Birth year is :" + oldest.birth_year);
    }

    public void lowestAvgScoreMovie(ArrayList<Asset> assets){       //Sistemin içindeki tüm film objelerini gezer ve içlerinde ortalama puanı en düşük olanı ekrana basar.
        double lowest=100;
        int counter=0;
        int lowestcnt=0;

        for( Asset a: assets){

            if(a.type == "Movie" && a.getAvarageScore() < lowest){
                lowest = a.getAvarageScore();
                lowestcnt = counter;
            }
            counter++;
        }
        assets.get(lowestcnt).showDetail();
    }

    public void highestActorSalary(int movie_id){

        for( Asset a : assets){

            if(a.type == "Movie" && movie_id == a.id){

            }
        }



    }


}
