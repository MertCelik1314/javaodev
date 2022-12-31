import java.util.ArrayList;

abstract class Asset {

    int id;
    String name;
    int release_year;
    Category category;
    int price;
    String type;

    ArrayList<Integer> scores = new ArrayList<>();

    public Asset(int id, String name, ArrayList<Integer> scores, int release_year, int price, Category category, String type){
        this.id=id;
        this.name=name;
        this.scores=scores;
        this.release_year=release_year;
        this.price=price;
        this.type=type;
        this.category=category;
    }

    public abstract void addScore(int score);

    public abstract double getAvarageScore();

    public abstract double getMaximumScore();

    public abstract double getMinimumScore();

    public void showDetail(){
        System.out.println("--------------------");
        System.out.println(id);
        System.out.println(name);
        System.out.println(scores);
        System.out.println(release_year);
        System.out.println(price);
        System.out.println(category);
        System.out.println(type);
    }
    
}
