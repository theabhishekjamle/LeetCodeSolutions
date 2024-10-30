public class palindrome {
    public static void main(String ar[]){
        int n=121;
        int n2=n;
        int s=0,a=0;
        while(n!=0){
            a=n%10;
            s=s*10+a;
            n=n/10;
        }
       System.out.print(s);
    }
}
