public class lecture2 {
    public static void main(String[] args) {
//        // Print all the array elements
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i] + " ");
//        }

        int[] myList = {46, 73, 51, 2, 93, 91, 45, 4, 80, 29, 79, 46, 16, 74, 68, 61, 87, 10, 37, 3};

        // Finding the greatest element
        int max = 0;
        int secmax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max)
                max = myList[i];
            if (myList[i] > secmax && secmax != max)
                secmax = myList[i];
        }
        System.out.println("Max is " + max);
        System.out.println("Secmax is " + secmax);

        //Print every second element in the array
        for (int i=0; i<myList.length; i=i+2) {
            System.out.println(myList[i]);
        }

        //Print every even element in the array
        for (int i = 1; i < myList.length; i+=2) {
            System.out.println(myList[i] + " ");
        }

        // Sum of all numbers
        int j = 0;
        int total = 0;
        int total50 = 0;

        for (j = 0; j < myList.length; j++) {
            total += myList[j];
        }
        for (j = 0; j < myList.length; j++) {
            if (myList[j] >= 50) {
                total50 += myList[j];
            }
        }
        System.out.println("Summary of all numbers = " + total);
        System.out.println("Summary of all numbers (>50) = " + total50);

        // Average of all odd values
        for(int val : myList) {
            if (val % 2 == 1) {
                System.out.print(val + " ");
            }
        }
    }
}