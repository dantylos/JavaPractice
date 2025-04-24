public class lecture2 {
    public static void main(String[] args) {
        int[] array1;
        array1 = new int[]{5, 10, 20, 40};

        System.out.println(array1.length);
        System.out.println(array1[1]);
        System.out.println(array1[array1.length-1]);

        int[] newArray = new int[100];
        int a;
        int c = 10;
        int b = 22;

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unknown");
        }


        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;

        // While loop
        while (i < 10) {
            System.out.printf(values[i] + " ");
            i++;
        }

        // For loop
        for(int j = 0; j < 10; j++){
            System.out.println(values[j]);
        }

        // do loop
        int j = 1;
        do {
            System.out.println(values[j]);
            j++;
        } while(j < 10);


        // for each loop
        for (var item: values) {
            System.out.println(item);
        }
    }
}