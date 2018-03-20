public class ShellSort {public static void main(String[] args) {
    int[] array = {30, 2, 10, 4, 6};
    int length = array.length;


    int a = array.length/2;
    while (a > 0) {
        for (int i = 0; i < (array.length - a); i++) {
            int s = i;
            while ((s >= 0) && array[s] > array[s + a]) {
                int k = array[s];
                array[s]  = array[s + a];
                array[s + a] = k;
                s--;
            }
        }

        a = a/2;
    }

    for (int i = 0; i < length; i++) {
        System.out.print(array[i] + " ");
    }
}
}
