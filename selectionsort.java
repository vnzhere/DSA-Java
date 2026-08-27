int n = arr.length;
for (int i =0; i < n-1; i++){
    int minIndex =i;

    for (int j = i+1; j< n-1; j++){
        if(arr[j] < arr[MinIndex]){
            MinIndex =j;
        }
    }

    int temp = arr[i];
    arr[i] = arr[MinIndex];
    arr[MinIndex] = temp;
}