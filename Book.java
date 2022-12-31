import java.util.ArrayList;

public class Book extends Asset {

    Consumer writer;
    int numOfPages;

    public Book(int id, String name, ArrayList<Integer> scores, int release_year, int price, Category category, String type, Consumer writer, int numOfPages){
        super(id, name, scores, release_year, price, category, type);
        this.writer=writer;
        this.numOfPages=numOfPages;
    }
    
    public void setWriter(Consumer writer){
        this.writer=writer;
    }

    public void addScore(int score){
        super.scores.add(score);
    }

    public double getAvarageScore(){
        int counter = 0;
        double avarage =0;

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

}
