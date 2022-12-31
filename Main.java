import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Consumer c1 = new Consumer(0, 1995, 60000, "John", "Wick");
        Consumer c2 = new Consumer(1, 1970, 100000, "Luke", "Skywalker");
        Consumer c3 = new Consumer(2, 2005, 150000, "Anakin", "Skywalker");
        Consumer c4 = new Consumer(3, 1980, 250000, "Tarantino", "T");

        Category category1 = new Category(0, "hrr", "horror");
        Category category2 = new Category(1, "adv", "Adventure");

        ArrayList<Integer> scr1 = new ArrayList<>();
        int[] list = {50,60,70,80,80,75,90,45,65};

        for(int i:list){
            scr1.add(i);
        }

        ArrayList<Integer> scr2 = new ArrayList<>();
        int[] list2 = {50,60,70,80,75,90,45,65,100,90,90,10,20};

        for(int i:list2){
            scr2.add(i);
        }

        ArrayList<Consumer> actorlist = new ArrayList<>();

        actorlist.add(c1);
        actorlist.add(c2);
        actorlist.add(c3);

        Movie mov1 = new Movie(0, "Star Wars", scr1, 1999, 20, category1, "Movie", actorlist, c4);
        Movie mov2 = new Movie(1, "Fight Club", scr2, 2005, 15, category2, "Movie", actorlist, c1);

        System.out.println(mov1.getMaximumScore());
        System.out.println(mov1.getMinimumScore());
        System.out.println(mov1.getAvarageScore());

        System.out.println(mov2.getMaximumScore());
        System.out.println(mov2.getMinimumScore());
        System.out.println(mov2.getAvarageScore());

        Book b1 = new Book(0, "Time MAchine", scr1, 1985, 50, category2, "Book", c2, 260);

        b1.getAvarageScore();

        User user = new User(0, "Celik", "Mert", "MC", "12345");

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(b1);
        assets.add(mov1);
        assets.add(mov2);

        DisneyPlus disneyPlus = new DisneyPlus(assets);

        disneyPlus.login(user);

        disneyPlus.addBook(b1);
        disneyPlus.addMovie(mov1);

        disneyPlus.oldestActor(mov1);
        disneyPlus.lowestAvgScoreMovie(assets);

           
    }
}
