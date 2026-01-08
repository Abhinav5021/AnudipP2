public class factorial{
    public static void main(){
        int num = 50;
        long fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}