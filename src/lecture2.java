public class lecture2 {
    public static void main(String[] args) {

        int[] myList = {46, 73, 51, 2, 93, 91, 45, 4, 80, 29, 79, 46, 16, 74, 68, 61, 87, 10, 37, 3};

        // Finding the greatest element
        int max = myList[0];

        for(var item : myList){
            if (max < item){
                max = item;
            }
        }
        System.out.println("Max is " + max);


        // Finding second greatest element
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
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 == 0) {
                System.out.printf(myList[i] + " ");
            }
        }
        System.out.println();


        // Sum of all numbers and numbers more than 50
        int total = 0;

        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Summary of all numbers = " + total);

        total = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > 50) {
                total += myList[i];
            }
        }
        System.out.println("Summary of all numbers (>50) = " + total);


        // The average of all odd values
        double total2 = 0;
        double counter = 0;
        for(int i = 0; i < myList.length; i++){
            if (myList[i] % 2 == 1) {
                total2 += myList[i];
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


        // Shift all items by one position to the left (the first one goes to the end
        int first = myList[0];
        for(int i = 1; i < myList.length; i++){
            myList[i-1] = myList[i];
        }
        myList[myList.length - 1] = first; // Placing the first value to the last position
        for(var item: myList){
            System.out.print(item + " ");
        }
        System.out.println();


        //
    }
}