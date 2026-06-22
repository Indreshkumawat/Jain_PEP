package DSA;

public class Questions {

    public static boolean checkSorted(int[] arr){
        for(int i = 0;i<arr.length - 1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[] = {10,5,17,18,12};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        int avg = sum/arr.length;
        int count = 0;
        for(int  i = 0;i<arr.length;i++){
            if(arr[i] > avg){
                count++;
            }
        }

        int first = -1;
        int last = -1;

        int num = 10;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }

        int number[] = {2,4,6,8,9,11};

        boolean sorted = true;

        for(int i = 0;i<number.length;i++){
            if(arr[i] > arr[i+1]){
                System.out.println("Array is not sorted");
                sorted = false;
                break;
            }
        }

        if(sorted == true){
            System.out.println("sorted");
        }





        System.out.println(count);
    }
}
