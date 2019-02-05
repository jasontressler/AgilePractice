package wordgame;

import java.util.Scanner;
public class WordGame 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
        String guess;
        String secretWord = "Github";
        boolean correct = false;
        
        while(!correct)
        {
            System.out.print("Please guess a word: ");
            guess = input.nextLine();
            if(guess.equalsIgnoreCase(secretWord))
                correct = true;
            else
                System.out.println("Nope!");
        }
        System.out.println("You got it!");
    }   
}
