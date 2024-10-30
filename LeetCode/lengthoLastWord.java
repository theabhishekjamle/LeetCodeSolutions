public class lengthoLastWord {
    public static void main(String ar[]){
        String s="Hello World";
        int n=s.length();
        int i=n;
        StringBuilder sb=new StringBuilder();
      while(i!=0){
        if(s.charAt(i)==' '){
            break;
        }
        sb.append(s.charAt(i));
        i--;
      }
      System.out.println(sb);
    }
}
