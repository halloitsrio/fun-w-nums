/*
 * add comments on authors, data, version, & purpose 
 * need to add import for scanner & anything else that is needed
*/

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
          count++;
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


  //Main
  public static void main(String[] args) {
    //System.out.println("test");
    isPrime(13);
    isPrime(12);
    oddEven(13);
    oddEven(12);
    int num1 = 12;
    int num2 = 18;
    lcm(num1, num2);
    num1 = 24;
    num2 = 18;
    gcf(num1, num2);

  }
}