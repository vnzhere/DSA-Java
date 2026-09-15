static void quickSort(int[] arr, int low, int high) {

    if (low < high) {
        // partition and get pivot index
        int pivotIndex = partition(arr, low, high);

         // sort left of pivot
        quickSort(arr, low, pivotIndex - 1);

        // sort right of pivot
        quickSort(arr, pivotIndex + 1, high);
    }
    // base case: low>=high means 0 or 1 element
}
static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    // choose last element as pivot

    int i = low - 1;
    // i tracks position for smaller elements

     for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

             }
    }

    // place pivot in correct position
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
    // return pivot's final index
}
