public class lecture5 {
    public static void main(String[] args) {
        String input = "1+h+1+8-";
        System.out.println("Input: " + input);

        int result = 0;
        try {
            result = calculate3(input);
        } catch (UnknownOperatorException e) {
            System.out.println("Error: Unknown operator:");
            showErrorPosition(input, e.getPosition());
            System.exit(1);
        } catch (NotADigitException e) {
            System.out.println("Error: Not a digit value:");
            showErrorPosition(input, e.getPosition());
            System.exit(2);
        } catch (UnfinishedInputExcception e) {
            System.out.println("Error: Input is unfinished:");
            showErrorPosition(input, e.getPosition());
            System.exit(3);
        }
        System.out.println(result);
    }

    private static void showErrorPosition(String input, int position) {
        System.out.println(input);
        for(int i = 0; i < position; i++){
            System.out.print(" ");
        }
        System.out.println("^");
    }

    private static int calculate1(String input) {
        int result = Character.getNumericValue(input.charAt(0));
        for(int i = 1; i < input.length(); i++){
            char operator = input.charAt(i);
            i++;
            int operand = Character.getNumericValue(input.charAt(i));
            if(operator == '+'){
                result += operand;
            } else {
                result -= operand;
            }
        }
        return result;
    }

    private static int calculate2(String input) {
        int result = Character.getNumericValue(input.charAt(0));
        if(result > 9 || result < 0){
            System.out.printf("Error: incorrect input value %c\n", input.charAt(0));
            System.exit(3);
        }
        for(int i = 1; i < input.length(); i++){
            char operator = input.charAt(i);
            i++;
            if(i == input.length()){
                System.out.println("Error: unfinished input!");
                System.exit(2);
            }
            int operand = Character.getNumericValue(input.charAt(i));
            if(operand > 9 || operand < 0){
                System.out.printf("Error: incorrect input value %c\n", input.charAt(i));
                System.exit(3);
            }
            switch(operator){
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                default:
                    System.out.printf("Error: Unknown operand %c\n", operator);
                    System.exit(1);
            }

        }
        return result;
    }

    private static int calculate3(String input) throws UnknownOperatorException, NotADigitException, UnfinishedInputExcception {
        int result = 0;
        int i = 0;
        try{
            result = convertCharacterToDigit(input, 0);
            for(i = 1; i < input.length(); i++){
                char operator = input.charAt(i);
                i++;
                int operand = convertCharacterToDigit(input, i);
                switch(operator){
                    case '+':
                        result += operand;
                        break;
                    case '-':
                        result -= operand;
                        break;
                    default:
                        throw new UnknownOperatorException(i - 1);
                }
            }
        } catch(StringIndexOutOfBoundsException e){
            throw new UnfinishedInputExcception(i);
        }

        return result;
    }

    private static int convertCharacterToDigit(String input, int i) throws NotADigitException {
        int result = Character.getNumericValue(input.charAt(i));
        if(result > 9 || result < 0){
            throw new NotADigitException(i);
        }
        return result;
    }
}

class UnknownOperatorException extends Exception {
    int position;


    public UnknownOperatorException(int position) {
        this.position = position;
    }


    public int getPosition() {
        return position;
    }
}

class NotADigitException extends Exception {
    int position;


    public NotADigitException(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}

class UnfinishedInputExcception extends Exception {
    int position;


    public UnfinishedInputExcception(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
