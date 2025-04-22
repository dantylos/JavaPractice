public class lecture1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        int a = 15, b = 5, c = 50;
        char d = 'e';
        System.out.println(c - (a + b));
        System.out.println(d);

        double pi = 3.14;
        System.out.println(++pi); // Adds 1 to current output
        System.out.println(pi++); // Adds 1 to the next output with pi
        System.out.println(pi);

        String text = "Ooo";
        System.out.println();
        System.out.println(text + " yesss");


        System.out.printf("%d %10d", 12, 30);
    }
}

