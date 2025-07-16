import java.io.*;
import java.util.Scanner;

public class lecture7 {
    public static void main(String[] args) {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("input.txt");
//            int value = fileInputStream.read();
//            System.out.println(value);
//            System.out.println((char) value);
//            fileInputStream.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//            System.exit(1);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            System.exit(2);
//        }
//
//        try {
//            FileReader fileReader = new FileReader("input.txt");
//
//            char[] chars = new char[100];
//            int charsRead = fileReader.read(chars);
//            for(int i = 0; i < charsRead; i++){
//                System.out.println(chars[i]);
//            }
//            String text = String.valueOf(chars, 0, charsRead);
//            System.out.println(text);
//
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//            System.exit(1);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            System.exit(2);
//        }

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
//
//            String line = bufferedReader.readLine();
//            while(line != null){
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//            System.exit(1);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            System.exit(2);
//        }

//        try {
//            Scanner scanner = new Scanner(new FileReader("input.txt"));
//
////            if(scanner.hasNextInt()){
////                int value = scanner.nextInt();
////                System.out.println(value);
////            }
//
////            while(scanner.hasNextInt()){
////                int value = scanner.nextInt();
////                System.out.println(value);
////            }
//
////            while(scanner.hasNext()){
////                String word = scanner.next();
////                System.out.println(word);
////            }
//
//            while(scanner.hasNextLine()){
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//            System.exit(1);
//        }

//        Scanner scanner = new Scanner(System.in);

//        while(scanner.hasNextInt()){
//            int value = scanner.nextInt();
//            System.out.println(value);
//        }

//        while(scanner.hasNextLine()){
//            String line = scanner.nextLine();
//            System.out.println(line);
//        }

//        try {
//            FileWriter fileWriter = new FileWriter("output.txt");
//
//            fileWriter.write("Hello world!\n");
//            fileWriter.write("Hello world again!\n");
//
//            for(int i = 0; i < 10; i++){
//                fileWriter.write(String.format("%5d ", i));
//            }
//
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            System.exit(1);
//        }

        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("output.txt"));

            for(int i = 0; i < 10; i++){
//                fileWriter.write(String.format("%5d ", i));
                printStream.printf("%5d ", i);
            }

            printStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }
}