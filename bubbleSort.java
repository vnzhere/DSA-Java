static void bubbleSort(int[] arr){
    int n = arr.length;
    for(int i=0; i < n-1; i++){
        boolean swapped = false;
         
         for(int j = 0; j < n-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
         }
         if(!swapped) break;
    }
}
System.out.println("=== Bubble Sort ===");
int[] arr = {5, 3, 8, 1, 2};
bubbleSort(arr);
System.out.println(Arrays.toString(arr));
// [1, 2, 3, 5, 8]

int[] arr2 = {1, 2, 3, 4};
bubbleSort(arr2);
System.out.println(Arrays.toString(arr2));
// [1, 2, 3, 4] → 0 swaps, exits early

// LC 283 Move zeroes