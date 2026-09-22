public class Max {
    public static void main(String[] args){
        int arr[]={2,4,6,8,9,6};
        int Max=arr[0];
        for(int i = 1;i<arr.length;i++){
            if (arr[i]>Max){
                Max=arr[i];
            }
        }
      System.out.println("maximum element=" +Max)   ;
    }
}