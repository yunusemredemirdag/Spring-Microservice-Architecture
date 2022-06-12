import java.util.ArrayList;
import java.util.Collections;

public class aa {
    public static void main(String[] args) {
        int[] arr = {3, 5, -1, 8, 12};
        int[] arr2 = {5, 7, 7, 1, 2};
        int[] arr3 = {4, 6, 23, 10, 1, 3};
        System.out.println(max_repeat_find(arr2));

    }

    public static int max_repeat_find(int[] array){
        ArrayList<Integer> a = new ArrayList();
        ArrayList<Integer> b = new ArrayList();
        int sum = 0;
        for(int i=0;i<array.length;i++){
            a.add(array[i]);
            sum = 0;
            for(int j=0;j<array.length;j++){
                if(array[i] == array[j]){
                    sum++;
                }
            }
            b.add(sum);
        }


        Integer max = Collections.max(b);
        if(max == 1){
            return -1;
        }
        System.out.println(max);
        System.out.println(a.get(b.indexOf(max)));

        return max;
    }

    public static boolean arrayAdd(int[] arr){
        int len = arr.length;
        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(arr[j+1]<arr[j]){

                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                }
            }
        }

        int maxNum = arr[arr.length-1];
        int tot = 0;

        int new_arr[] = new int[arr.length-1];
        for(int i=0;i<new_arr.length; i++){
            new_arr[i] = arr[i];
        }

        for (int i = 0; i < new_arr.length; i++){
            tot += new_arr[i];
            for (int j = 0; j < new_arr.length; j++){
                if (i != j) {
                    tot += new_arr[j];
                    if (tot == maxNum) {
                        return true;
                    }
                }
            }

            for (int k = 0; k < new_arr.length; k++) {
                if (i != k) {
                    tot -= new_arr[k];
                    if (tot == maxNum) {
                        return true;
                    }
                }
            }
            tot = 0;
        }

        return false;
    }

}