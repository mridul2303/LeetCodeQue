import java.util.Scanner;

//count Primes
public class Med1 {
    public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt();
        System.out.println(countPrimes(n));
}
static int countPrimes(int n ){
int count = 1;
while (n>1){
   if (isPrime(n)){
       count++;
       n--;
   }
   else {
       n--;

   }}
return count;
}
static Boolean isPrime(int n ){
        if (n%2==0){
            return false;
        }
        for (int i = 3 ; i*i < n ; i++  ){
            if (n%i==0){

            }
        }}}
