static void insertionSort(int[] arr) {
    int n = arr.length;
     for (int i = 1; i < n; i++) {
        int key = arr[i];
        // element to be inserted

        int j = i - 1;
        // start comparing from left

