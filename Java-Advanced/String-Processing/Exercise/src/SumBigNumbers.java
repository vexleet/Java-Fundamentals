import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine().replaceAll("^[0]*", "");
        String secondNumber = scanner.nextLine().replaceAll("^[0]*", "");;

        if (firstNumber.length() > secondNumber.length())
        {
            secondNumber = leftPad(secondNumber, firstNumber.length(), '0');
        }
        else
        {
            firstNumber = leftPad(firstNumber, secondNumber.length(), '0');

        }

        byte sum = 0;
        byte numberInMind = 0;
        byte remainder = 0;
        StringBuilder result = new StringBuilder();

        for (int i = firstNumber.length() - 1; i >= 0; i--)
        {
            sum = (byte)(Byte.parseByte(Character.toString(firstNumber.charAt(i))) + Byte.parseByte(Character.toString(secondNumber.charAt(i))) + numberInMind);
            numberInMind = (byte)(sum / 10);
            remainder = (byte)(sum % 10);
            result.append(remainder);
            if (i == 0 && numberInMind != 0)
            {
                result.append(numberInMind);
            }
        }

        char[] resultToChar = result.toString().toCharArray();

        for(int i=0; i<resultToChar.length/2; i++){
            char temp = resultToChar[i];
            resultToChar[i] = resultToChar[resultToChar.length -i -1];
            resultToChar[resultToChar.length -i -1] = temp;
        }

        System.out.println(resultToChar);
    }

    public static String leftPad(String originalString, int length,
                                 char padCharacter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(padCharacter);
        }
        String padding = sb.toString();
        String paddedString = padding.substring(originalString.length())
                + originalString;
        return paddedString;
    }
}
