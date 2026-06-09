package Contest;

public class ReformatPhoneNumber {
    public static void main(String[] args) {
        String s = "123 4-5678";
        reformatNumber(s);
    }

    public static String reformatNumber(String number) {

        String validNums = number.replaceAll("[^0-9]+", "");

        // now divide them in blocks

        StringBuilder subString = new StringBuilder();
        int length = validNums.length();

        int i = 0;
        while (length > 0) {

            int j = i;
            if (length > 4) {
                for (; i < j+3; i++) {
                    subString.append(validNums.charAt(i));
                }
                length = length - 3;
                System.out.println(subString);

                if (length == 0) {
                    break;
                }

                subString.append("-");

            }

            j = i;
            if (length == 3) {
                for (; i <= j + 2; i++) {
                    subString.append(validNums.charAt(i));
                }
                System.out.println(subString);
                length = length - 3;
                if (length == 0) {
                    break;
                }
                subString.append("-");

            }

            j = i;
            if (length == 4) {

                for (; i < j + 2; i++) {
                    subString.append(validNums.charAt(i));
                }
                j = j + 2;
                System.out.println(subString);
                subString.append("-");

                for (; i < j + 2; i++) {
                    subString.append(validNums.charAt(i));
                }

                System.out.println(subString);
                length = length - 4;
                if (length == 0) {
                    break;
                }

                subString.append("-");
            }

            j = i;
            if (length == 2) {
                {
                    for (; i < j + 2; i++) {
                        subString.append(validNums.charAt(i));
                    }

                    System.out.println(subString);

                    length = length - 2;

                    if (length == 0) {
                        break;
                    }

                    subString.append("-");
                }
            }

            System.out.println(subString);
        }

        return subString.toString();
    }

}
