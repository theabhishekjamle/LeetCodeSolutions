public class twosum {
    public static void main(String ar[]){
        int arr[]={2,7,11,15};
        int target=9;
        int r[]=new int[5];
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    r[i]=i;
                }
            }
        }
        return null;
        
    }
}
