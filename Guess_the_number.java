import java.util.Random;
import java.util.Scanner;

class guess_num{
    int comp;
    int user_In;
    static int nGuesses=0;
    public guess_num(){
        Random random= new Random();
        comp = random.nextInt(101);
    }
    public int getcom(){
        return comp;
    }
    public void take_User_Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Guess the number between 1 to 100");
        user_In=sc.nextInt();
    }
    public int getUser_In(){
        return user_In;
    }
    public void isCorrect() {
       do {
           take_User_Input();
           if (getUser_In() == getcom()) {
               System.out.println("Your guess is correct");
           } else if (getUser_In() > getcom()) {
               System.out.println("Lower number please");
           } else if (getUser_In() < getcom()) {
               System.out.println("Higher Number Please");
           }
           set_Guesses();
       }while (getUser_In()!=comp);
    }
    public void set_Guesses(){
        nGuesses++;
    }
    public void get_guesses(){
        System.out.println("You Guessed it in : "+nGuesses+" attempts");
    }
}
public class Guess_the_number{
    public static void main(String[] args) {
        guess_num g1= new guess_num();
        g1.isCorrect();
        g1.get_guesses();
    }
}