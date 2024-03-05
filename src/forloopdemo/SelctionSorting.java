package forloopdemo;

public class SelctionSorting {


    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]){


        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
//        int[] arr1 = {5,1,12,-5,16,2,12,14};
//        System.out.println("Before Selection Sort");
//        for(int i:arr1){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//
//        selectionSort(arr1);//sorting array using selection sort
//
//        System.out.println("After Selection Sort");
//        for(int i:arr1){
//            System.out.print(i+" ");
//        }
    }

}
