public class linearsearch {
    static void main(String[] args) {
        int[] arr = {2, 3, 5, 15, 4};
        int tofind=16;
        int res=linearsearch(arr,tofind);
        if(res == -1){
            System.out.println("not found");
        } else
        {
            System.out.println("the index is:" +res);
        }
    }

    public static int linearsearch(int[] arr, int tofind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tofind) {
                return i;
            }
        }
        return -1;

}
}