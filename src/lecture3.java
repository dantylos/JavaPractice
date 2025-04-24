public class lecture3 {
    public static void main(String[] args) {
        // Section 1
        int[] myList = {46, 73, 51, 2, 93, 91, 45, 4, 80, 29, 79, 46, 16, 74, 68, 61, 87, 10, 37, 3};

        // Finding the greatest element
        int max = myList[0];

        for(var item : myList){
            if (max < item){
                max = item;
            }
        }
        System.out.println("Max is " + max);


        //Finding the second biggest num
        max = myList[0];
        int secondMax = myList[0];
        for(int i = 1; i < myList.length; i++){
            if(myList[i] > max){
                secondMax = max;
                max = myList[i];
            } else if(myList[i] > secondMax){
                secondMax = myList[i];
            }
        }
        System.out.println("SecondMax is: " + secondMax);


        //Print every second element in the array
        for (int i=1; i<myList.length; i += 2) {
            System.out.printf(myList[i] + " ");
        }
        System.out.println();


        //Print every even element in the array
        for (int k : myList) {
            if (k % 2 == 0) {
                System.out.printf(k + " ");
            }
        }
        System.out.println();


        // Sum of all numbers and numbers more than 50
        int total = 0;

        for (int k : myList) {
            total += k;
        }
        System.out.println("Summary of all numbers = " + total);

        total = 0;
        for (int k : myList) {
            if (k > 50) {
                total += k;
            }
        }
        System.out.println("Summary of all numbers (>50) = " + total);


        // The average of all odd values
        double total2 = 0;
        double counter = 0;
        for (int k : myList) {
            if (k % 2 == 1) {
                total2 += k;
                counter++;
            }
        }
        System.out.println(total2/counter);


        // Values divisible by 10 are increased by 1:
        for(int i = 0; i < myList.length; i++){
            if(myList[i] % 10 == 0){
                myList[i]++;
            }
            System.out.print(myList[i] + " ");
        }
        System.out.println();


        // Swap every even element
        for(int i = 0; i < myList.length; i+=2){
            int tmp = myList[i];
            myList[i] = myList[i+1];
            myList[i+1] = tmp;
        }
        for(var item: myList){
            System.out.print(item + ", ");
        }
        System.out.println();


        // Shift all items by one position to the left (the first one goes to the end)
        int first = myList[0];
        for(int i = 1; i < myList.length; i++){
            myList[i-1] = myList[i];
        }
        myList[myList.length - 1] = first; // Placing the first value to the last position
        for(var item: myList){
            System.out.print(item + " ");
        }
        System.out.println();

        // Section 2
        System.out.println("\n\nSection 2:");
        int[] array1 = {46, 73, 51, 2, 93, 91, 45, 4, 80, 29};
        int[] array2 = {79, 46, 16, 74, 68, 61, 87, 10, 37, 3};
        System.out.println("Inputs for this section: ");
        System.out.print("\tarray1: ");
        for(var item: array1){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("\tarray2: ");
        for(var item: array2){
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("\nTask 2a:");
        int[] newArray1 = new int[array1.length + array2.length];
        int newArray1Index = 0;
        for (int k : array1) {
            newArray1[newArray1Index] = k;
            newArray1Index++;
        }
        for (int k : array2) {
            newArray1[newArray1Index] = k;
            newArray1Index++;
        }
        System.out.print("\tCreate a new array and copy the array1 to the first half and array2 to the second half:\n\t\t");
        for(var item: newArray1){
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("\nTask 2b:");
        int[] newArray2 = new int[array1.length + array2.length];
        int newArray2Index = 0;
        for(int i = 0; i < array1.length; i++){
            newArray2[newArray2Index] = array1[i];
            newArray2Index++;
            newArray2[newArray2Index] = array2[i];
            newArray2Index++;
        }
        System.out.print("\tCreate a new array which is a zip from elements of array1 and array2:\n\t\t");
        for(var item: newArray2){
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("\nTask 2c:");
        int[] newArray3 = new int[array1.length];
        for(int i = 0; i < array1.length; i++){
            newArray3[i] = array1[i] + array2[i];
        }
        System.out.print("\tCreate a new array where each item is the sum of corresponding items from array1 and array 2:\n\t\t");
        for(var item: newArray3){
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("\nTask 2d:");
        for(int i = 1; i < array1.length; i+=2){
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
        System.out.print("\tSwap every second between both arrays:\n");
        System.out.print("\t\tarray1: ");
        for(var item: array1){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("\t\tarray2: ");
        for(var item: array2){
            System.out.print(item + " ");
        }
        System.out.println();


        // Section 3
        System.out.println("\n\nSection 3:");
        System.out.print("Input for this section: ");
        for(var item: myList){
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.print("\nTask:\n\tSort all items by using the bubble sort algorithm:\n\t\t");
        for(int i = 0; i < myList.length - 1; i++){
            for(int j = 0; j < myList.length - 1 - i; j++){
                if(myList[j] > myList[j+1]){
                    int tmp = myList[j];
                    myList[j] = myList[j+1];
                    myList[j+1] = tmp;
                }
            }
        }
        for(var item: myList){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}