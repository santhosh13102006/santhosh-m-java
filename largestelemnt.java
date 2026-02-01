public class largest_element {
    static void main(String[] args) {
        int[] arr={21,65,43,33,87};
         int largest=arr[0];
         int n = arr.length;
        for(int i=1;i<n;i++)
         if(arr[i]>largest)
             largest=arr[i];
        System.out.println("the largest element is:"+largest);
    }
}
