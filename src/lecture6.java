public class lecture6 {
    public static void main(String[] args) {
        int[][] a1 = new int[3][3];

        int value = 1;
        for(int row = 0; row < a1.length; row++){
            for(int column = 0; column < a1[row].length; column++){
                a1[row][column] = value;
                value++;
            }
        }

        for (int[] ints : a1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        for(var row:a1){
            for(var item:row){
                System.out.print(item + " ");
            }
            System.out.println();
        }

    }
}