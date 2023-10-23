/*
 * add comments on authors, data, version, & purpose 
 * need to add import for scanner & anything else that is needed
*/
import java.util.Scanner;

public class FunNums {
  
  // Methods

  /*
   * isPrime is a static method that prints out a statement that tells the user whether or not the number they inputted is prime or not
   * @param num - the input number that is tested to be prime or not
   */
  public static void isPrime(int num) {
    boolean prime = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        prime = false;
      }
    }
    if (prime) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
  }

  /*
   * oddEven is a static method that prints out a statemnt that tells the user whether the number they inputted is odd or even
   * @param num - the input number that is tested to be odd or even
   */
  public static void oddEven(int num) {
    if (num % 2 ==0) {
      System.out.println(num + " is an even number.");
    } else {
      System.out.println(num + " is an odd number.");
    }
  }

  /*
     * lcm is a static method that prints out a statement that tells the user the least common multiple of the two numbers that they inputted
     * @param num1 - the first number that the user inputs that is used to find the LCM
     * @param num2 - the second number that the user inputs that is used to find the LCM
     */
    public static void lcm(int num1, int num2) {
      int smallerNumber;
      if (num1 < num2) {
          smallerNumber = num1;
      } else {
          smallerNumber = num2;
      }

      int count = smallerNumber; // Initialize count with the smaller number

      while (true) {
          if (count % num1 == 0 && count % num2 == 0) {
              System.out.println("The LCM of " + num1 + " and " + num2 + " is " + count);
              break; // Found the LCM, exit the loop
          }
          count += smallerNumber;
      }
  }

/*
   * gcf is a static method that calculates and returns the greatest common factor of two numbers.
   * @param num1 - the first number
   * @param num2 - the second number
   */
  public static void gcf(int num1, int num2) {
    System.out.print("The GCF of " + num1 + " and " + num2 + " is ");
      while (num2 != 0) {
          int temp = num2;
          num2 = num1 % num2;
          num1 = temp;
      }
      System.out.println(num1);
  }

  /*
   * checknum checks if the input is an integer and required the user to enter a valid input to end
   * @param num - number inputed by the user and is being checked
   */
  public static int check_num() {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    try {
      if (!input.isEmpty()) {
        sc.close();
        check_num();
      }
      int num = Integer.valueOf(input);
      sc.close();
      return num;
    }
    catch(NumberFormatException e){
      System.out.println("Invalid input. Try again");
      sc.close();
      check_num();
    }
    return 0;
  }

  public static int[] check_nums() {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    try {
      if (!input.isEmpty()) {
        sc.close();
        check_num();
      }
      int sep_index = input.indexOf(",");
      int num1 = Integer.valueOf(input.substring(0, sep_index));
      int num2 = Integer.valueOf(input.substring(sep_index + 1));
      int[] nums = new int[2];
      nums[0] = num1;
      nums[1] = num2;
      sc.close();
      return nums;
    }
    catch(NumberFormatException e) {
      System.out.println("Invalid input. Try again");
      sc.close();
      check_nums();
    }

    return [1, 2];
  }

  //Main
  public static void main(String[] args) {
    System.out.println("Welcome to FunNums! Please follwo along the prompts to use the program. Have fun!\n");
    Scanner sc = new Scanner(System.in);
    boolean play = true;
    while (play) {
      System.out.println("Please choose a function to use :\n (a) is prime\n (b) odd or even\n (c) LCM (least common multiple\n (d) GCF (greatest common factor)\n {e} Quit");
      System.out.println("/nPlease input on of the following letters to make your selection: a, b, c, or d");
      String choice = sc.nextLine();
      int inputnum;
      int[] inputnums = new int[2];

      switch (choice) {
        case "a" :
          System.out.println("You have chosen is prime\n Please input 1 integer number");
          inputnum = check_num();
          isPrime(inputnum);
        case "b" :
          System.out.println("You have chosen is odd or even");
          inputnum = check_num();
          oddEven(inputnum);
        case "c" :
          System.out.println("You have chosen is LCM");
          inputnums = check_nums();
          lcm(inputnums[0], inputnums[1]);
        case "d" :
          System.out.println("You have chosen is GCF");
          inputnums = check_nums();
          gcf(inputnums[0], inputnums[1]);
        case "e" :
          System.out.println("Thank you to using this method! Have fun with nums!");
          play = false;
      }
    }
    sc.close();
    
  }
}