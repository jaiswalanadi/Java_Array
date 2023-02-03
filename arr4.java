public class arr4 {
    public static void main(String[] args){
        int[] arr = {2,6,-5,-1,0,4,-9};
        for(int i=1; i < arr.length; i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
