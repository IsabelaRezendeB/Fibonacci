package inatel.isabela;

public class Fibonacci {

    public long result (int n){

        if(n <= 0){
            return 0;
        } else if (n <= 2) {
            return 1;
        } else {
            return (result(n-1) + result(n-2));
        }

    }

}
