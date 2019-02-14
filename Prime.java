public class Prime {

    public boolean isPrime(int number) {
        int i = 2;
        boolean result = false;

        while(i <= number/2) {
            if(number % i == 0) {
                result = true;
                break;
              }
          ++i;
        }

        return result;
    }
}
