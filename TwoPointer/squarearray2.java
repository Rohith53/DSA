// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public int[] makeArr2(int[] array){
        int l = 0;
        int r = array.length-1;
        int[] arr2 = new int[array.length];
        int k = arr2.length-1;
        while(l<=r){
            int lsq = array[l]*array[l];
            int rsq = array[r]*array[r];
            if(rsq > lsq){
                arr2[k] = rsq;
                r--;
            }else{
                arr2[k] = lsq;
                l++;
            }
            k--;
        }
        return arr2;
    }
    public static void main(String[] args) {
        
        Main obj = new Main();
        int[] input = {-4, -2, 0, 3, 5};
        int[] result = obj.makeArr2(input);
        System.out.println("Sorted squares: " + Arrays.toString(result));

    }
}