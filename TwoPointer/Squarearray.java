class Main {
 
public void makeArr(int[] arr) {
    int[] arr2 = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        arr2[i] = arr[i] * arr[i];
    }
    for(int j = 0; j<arr2.length;j++){
        System.out.println(arr2[j]);
    }
}
    public static void main(String[] args) {
       Main obj = new Main();
       int[] array = {1,2,3,4,5};
       obj.makeArr(array);
    }
}