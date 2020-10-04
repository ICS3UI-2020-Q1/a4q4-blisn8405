import java.util.Scanner; 
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
Scanner input = new Scanner(System.in); 
    //create variable for user input
   System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
   int number = input.nextInt();

int fizz = 0;
int buzz = 0;
int fizzbuzz = 0;

 do{
      //print the number
      System.out.println(number);
      //increment the counter
      number = number + 1;
      fizz = number % 3;
      buzz = number % 5;
      fizzbuzz = number % 3 && number % 5;


    }while(number >= 0);




  }
}
