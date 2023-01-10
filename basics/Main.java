import java.util.Random;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args){
    System.out.println("testing");
    pluralize("dog", 1);
    pluralize("cat", 2);
    pluralize("turtle", 0);
    flipNHeads(3);
    clock();

  }
  //PLURALIZE
  public static void pluralize (String word, int num) {
    if(num == 0 || num > 1) {
      System.out.println("I own " + num + " " + word + "s.");

    } else {
      System.out.println("I own " + num + " " + word + ".");
    }

  }
  // FLIPPING COIN 
  public static void flipNHeads(int num) {
    Random rand = new Random();
    int headCount = 0;
    int flips = 0; 
    while(headCount < num) {
        flips++;
        if (rand.nextFloat() >= 0.5) { // nextFloat() gives us a float beteen 0.0 and 1.0;
                headCount++;
                System.out.println("heads");
            } else {
                headCount = 0;
                System.out.println("tails");
            }
        }
        System.out.println("It took " + flips + " flips to flip " + num + " heads in a row.");
    }

       // COMMAND LINE CLOCK 
   public static void clock() {
     while (true) {
       try {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(formatTime);
        System.out.println(formattedTime);
        // delays the for a set number of miliseconds 
        Thread.sleep(1000);
      } catch (Exception err) {
        System.out.println(err);
      }
   }
}
}