public class expo {
    public static int exp(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        
        if(n%2==0){
            return exp(x, n/2)*exp(x, n/2);//complexity logn
        }
        else{
            return exp(x, n/2)*exp(x, n/2)*x;
        }
    }




    public static void main(String[] args) {

       System.out.println( exp(7, 2));
        
    }
}
