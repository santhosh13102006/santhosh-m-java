public class issorted {
    public static void main(String[] args) {
        int[] arr={23,45,65,74};
        if(issorted(arr)){
            System.out.println("it is sorted");
        }else
            System.out.println("not sorted");
    }
      static boolean issorted(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
            }
        return true;
      }
}
