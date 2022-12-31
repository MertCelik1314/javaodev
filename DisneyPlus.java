import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class DisneyPlus {
    
    ArrayList<Asset> assets = new ArrayList<>();
    User credential=null;
    boolean isLogin= false;

    public DisneyPlus(ArrayList<Asset> assets){
        this.assets=assets;
    }

    public void login(User user){
        String userName = user.userName, uNameIn;
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

    public void addMovie(Movie mov1){
        if(!isLogin)
        return;

        assets.add(mov1);
    }

    public void addBook(Book book1){
        if(!isLogin)
        return;

        assets.add(book1);
    }

    public void addAsset(Asset asset1){
        if(!isLogin)
        return;

        assets.add(asset1);
    }

    boolean removeMovie(int movieId){
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

    boolean removeBook(int bookId){
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

    public void oldestActor(Movie m1){
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

    public void lowestAvgScoreMovie(ArrayList<Asset> assets){
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
