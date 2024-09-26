
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Welcom to Rock, Paper, Scissors, Lizard, Spock");

        int playerScore = 0;
        int computerScore = 0;
        int gamesPlayed = 0;
        
       
        
        boolean gameOn = true;

        while (gameOn) {
            
            System.out.println("Enter your choice of R for Rock, P for Paper, S for Scissors, L for Lizard, V for Spock\nYou can quit the game by pressing Q");
            String answer = keyboard.nextLine(); 
             answer = answer.toUpperCase();

             int computerGuess = random.nextInt(5);
            String[] options = {"R", "P", "S", "L", "V"};
            String computerChoice = options[computerGuess];


            



            



            

            




            switch (answer) {
                case "R":
                
                if (answer.equals("R")) {
                    if (computerChoice.equals("S") || computerChoice.equals("L")) {
                        System.out.println("You win!");
                        playerScore++;
                        gamesPlayed++;
                    } else if (computerChoice.equals("P") || computerChoice.equals("V")) {
                        System.out.println("Computer wins!");
                        computerScore++;
                        gamesPlayed++;
                    } else {
                        System.out.println("It's a tie!");
                        gamesPlayed++;
                    }
                }
               
                break;
                case "P":
                
                if (answer.equals("P")) {
                    if (computerChoice.equals("R") || computerChoice.equals("V")) {
                        System.out.println("You win!");
                        playerScore++;
                        gamesPlayed++;
                    } else if (computerChoice.equals("S") || computerChoice.equals("L")) {
                        System.out.println("Computer wins!");
                        computerScore++;
                        gamesPlayed++;
                    } else {
                        System.out.println("It's a tie!");
                        gamesPlayed++;
                    }
                }
                    break;

                    case "S":
                
                if (answer.equals("S")) {
                    if (computerChoice.equals("P") || computerChoice.equals("L")) {
                        System.out.println("You win!");
                        playerScore++;
                        gamesPlayed++;
                    } else if (computerChoice.equals("R") || computerChoice.equals("V")) {
                        System.out.println("Computer wins!");
                        computerScore++;
                        gamesPlayed++;
                    } else {
                        System.out.println("It's a tie!");
                        gamesPlayed++;
                    }
                }
                break;

                case "L":
                
                if (answer.equals("L")) {
                    if (computerChoice.equals("P") || computerChoice.equals("V")) {
                        System.out.println("You win!");
                        playerScore++;
                        gamesPlayed++;
                    } else if (computerChoice.equals("S") || computerChoice.equals("R")) {
                        System.out.println("Computer wins!");
                        computerScore++;
                        gamesPlayed++;
                    } else {
                        System.out.println("It's a tie!");
                        gamesPlayed++;
                    }
                }
                break;

                case "V":
                
                if (answer.equals("V")) {
                    if (computerChoice.equals("S") || computerChoice.equals("R")) {
                        System.out.println("You win!");
                        playerScore++;
                        gamesPlayed++;
                    } else if (computerChoice.equals("L") || computerChoice.equals("P")) {
                        System.out.println("Computer wins!");
                        computerScore++;
                        gamesPlayed++;
                    } else {
                        System.out.println("It's a tie!");
                        gamesPlayed++;
                    }
                }
                break;

                case "Q":
            System.out.println("Thanks for playing!");
            gameOn = false;
            break;


            

                default:
                System.out.println("Dont think it matched");
                    break;
            }
efasrga


            
            if(gamesPlayed >= 10){
                System.out.println("----------------------------------------------------------------------------");

                System.out.println("you have been playing for awhiile, Are you bored yet?");

                System.out.println("----------------------------------------------------------------------------");
            }

            

            System.out.println();
            System.out.println();
            System.out.println("Player Score: " + playerScore);
            System.out.println("Computer Score: " + computerScore);
            System.out.println("Games Played: " + gamesPlayed);
        }  



    }  
}
