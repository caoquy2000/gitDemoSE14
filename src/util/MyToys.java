
package util;


public class MyToys {
    //Class nay chua cac ham sai chung cho moi du an
    //cP: compute Fatorial, tinh giai thua n!
    public static long cF(int n){
        if(n < 0 || n > 15) throw new IllegalArgumentException("n must be between 0 ... 15");
        if(n == 0) return 1;
        long product = 1; 
        for(int i = 1; i <= n; i++){
            product *= i;
        }
        return product;
    }
}
