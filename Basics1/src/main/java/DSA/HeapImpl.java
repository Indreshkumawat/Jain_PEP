package DSA;

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
}
public class HeapImpl {
    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.insertVal(10);
        heap.insertVal(20);
        heap.insertVal(30);
        heap.insertVal(40);
        heap.insertVal(4);
        heap.insertVal(100);

        heap.printHeap();

        heap.deleteFromHeap();

        System.out.println();

        heap.printHeap();


    }
}
