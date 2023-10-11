
public class Maths {
    int addTwoNumbers(int one, int two){
        return  one + two;
    }

   public boolean isPrime(int number) {
       boolean flag = true;
       for (int i = 2; i < number / 2; i++) {
           if (number % 2 == 0) {
               flag = false;
           }
       }
       return flag;
   }
}
