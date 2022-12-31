
import java.util.ArrayList;

public class Movie extends Asset {        //'Asset' class'ından türetilmiş ancak kendi kullanım amaçlarına yönelik olarak geliştirilmiştir.

    Consumer director;
    ArrayList<Consumer> actors = new ArrayList<>();

    public Movie(int id, String name, ArrayList<Integer> scores, int release_year, int price, Category category, String type, ArrayList<Consumer> actors, Consumer director){
        super(id, name, scores, release_year, price, category, type);
        this.actors=actors;
        this.director=director;
    }

    public void addActor(Consumer actor){               //Film objesinin oyuncular dizisine yeni bir oyuncu ekler.
        this.actors.add(actor);
    }
    
    @Override
    public void showDetail(){                           //Film objesinin sahip olduğu özellikleri ekrana basar.
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

    public void addScore(int score){                    //Class'tan oluşturulan film objesine puan vermemizi sağlayan methot. Önceden verilmiş puan dizisine ekler.
        this.scores.add(score);
    }

    public double getAvarageScore(){                    //Film objesine verilen tüm puanları toplar ve ortalama bir puanı kullanıcıya geri döndürür.
        int counter=0;
        double avarage=0;

        for(double number:scores){
            avarage += number;
            counter++;
        }
        return avarage/counter;
    }

    public double getMaximumScore(){                    //Kullanıcıların verdiği puanlar arasından en yüksek olanu bulup geri döndürür.
        double max=0;

        for(double number:scores){
            if(number > max){
                max=number;
            }
        }

        return max;
    }

    public double getMinimumScore(){                    //Kullanıcıların verdiği puanlar arasından en küçük olanı bulup geri döndürür.
        double min= scores.get(0);

        for(double number:scores){
            if(min > number){
                min = number;
            }
        }

        return min;
    }

    public boolean deleteActor(int consumerId){     //Film objesinin içinde bulunan oyuncular dizisinden belli bir oyuncuyu siler. Silinen indexten sonraki tüm elementler 1 sola kayar.
                                                    //Bu sayede dizinin son halinde boşluk olmaz.
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
