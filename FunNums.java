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

  //Main
  public static void main(String[] args) {
    //System.out.println("test");
    isPrime(13);
    isPrime(12);
    oddEven(13);
    oddEven(12);
  }
}
