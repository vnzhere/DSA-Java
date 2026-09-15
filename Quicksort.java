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
