static void quickSort(int[] arr, int low, int high) {

    if (low < high) {
        // partition and get pivot index
        int pivotIndex = partition(arr, low, high);