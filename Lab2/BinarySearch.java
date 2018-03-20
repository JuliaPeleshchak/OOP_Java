public class BinarySearch {
    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int s = 0;
        int f = data.length - 1;
        int middle = (s + f)/2;

        while(s<=f ) {
            middle = (s + f)/2;
            if (data[middle] == numberToFind ) {
                System.out.println(middle);
                break;
            }


            if(numberToFind > data[middle]) {
                s = middle + 1;

            }
            if(numberToFind < data[middle]){

                f = middle - 1;

            }


        }
        if(data[middle] != numberToFind) {
            System.out.println(-1);

        }

    }
}
