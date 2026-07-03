package DSA;

import java.util.PriorityQueue;

class Heap{
    int arr[];
    int size;

    public Heap(){
        arr = new int[100];
        size = 0;
    }

    public void insertVal(int data){
        arr[size] = data;
        int index = size;
        size++;
        while(index > 0){

            int parent =  (index - 1)/2;

            if(arr[parent] < arr[index]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
                index = parent;
            }else{
                break;
            }

        }
    }

    void printHeap(){
        for(int i = 0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

    void deleteFromHeap(){
        if(size == 0){
            System.out.println("heap is empty");
            return;
        }
        arr[0] = arr[size - 1];

        size--;

        int index = 0;

        while(true){
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            int largest = index;

            if(left < size && arr[left] > arr[largest]){
                largest = left;
            }
            if(right < size && arr[right] > arr[largest]){
                largest = right;
            }

            if(largest == index){
                break;
            }

            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            index = largest;
        }
    }
    void heapify(int[] nums,int n,int i){
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int largest = i;

        if(left < n && nums[left] > nums[largest]){
            largest = left;
        }
        if(right < n && nums[right] > nums[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;
            heapify(nums,n,largest);
        }
    }
}
public class HeapImpl {
    public static void main(String[] args) {
//        Heap heap = new Heap();
//
//        heap.insertVal(10);
//        heap.insertVal(20);
//        heap.insertVal(30);
//        heap.insertVal(40);
//        heap.insertVal(4);
//        heap.insertVal(100);
//
//        heap.printHeap();
//
//        heap.deleteFromHeap();
//
//        System.out.println();
//
//        heap.printHeap();
//
//        int []nums = {2,12,24,3,25,78,29};
//        int n = 7;
//
//        for(int i = n/2-1;i>=0;i--){
//            heap.heapify(nums,n,i);
//        }
//        System.out.println();
//        for(int i = 0;i<n;i++){
//            System.out.println(nums[i]);
//        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(4);
        pq.add(40);
        pq.add(29);
        pq.add(13);
        pq.add(2);

        System.out.println("Hello demoo");


        System.out.println(pq.peek());

        pq.poll();
        System.out.println(pq.peek());




    }
}
