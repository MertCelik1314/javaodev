
import java.util.ArrayList;

public class Movie extends Asset {

    Consumer director;
    ArrayList<Consumer> actors = new ArrayList<>();

    public Movie(int id, String name, ArrayList<Integer> scores, int release_year, int price, Category category, String type, ArrayList<Consumer> actors, Consumer director){
        super(id, name, scores, release_year, price, category, type);
        this.actors=actors;
        this.director=director;
    }

    public void addActor(Consumer actor){
        this.actors.add(actor);
    }
    
    @Override
    public void showDetail(){
        System.out.println("--------------------");
        System.out.println(id);
        System.out.println(name);
        System.out.println(scores);
        System.out.println(release_year);
        System.out.println(price);
        System.out.println(super.category);
        System.out.println(type);
        System.out.println(this.director);
    }

    public void addScore(int score){
        this.scores.add(score);
    }

    public double getAvarageScore(){
        int counter=0;
        double avarage=0;

        for(double number:scores){
            avarage += number;
            counter++;
        }
        return avarage/counter;
    }

    public double getMaximumScore(){
        double max=0;

        for(double number:scores){
            if(number > max){
                max=number;
            }
        }

        return max;
    }

    public double getMinimumScore(){
        double min= scores.get(0);

        for(double number:scores){
            if(min > number){
                min = number;
            }
        }

        return min;
    }

    public boolean deleteActor(int consumerId){

        int counter=0;
        for(Consumer temp : actors){
            if(consumerId == temp.id){
            actors.remove(counter);

            return true;
            }
            counter++;
        }

        return false;
    }

}
