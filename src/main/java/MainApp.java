import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
//        System.out.println(bmi(80, 1.80));
//        int[] arr = {1, 2, 3};
//        System.out.println(Arrays.toString(map(arr)));
//        System.out.println(makeNegative(-2));
//
//        strCount("", 'l');
//        greet("Ryan");
//        basicMath("+", 10, 10);
//        System.out.println(repeatStr(3, "Hello"));
//        System.out.println(boolToWord(false));
//        System.out.println(highAndLow("1 2 -3 4 5"));

//        int [] arr = {1,-4,7,12};
//        System.out.println(sum(arr));
//        String s = "Robin Singh";
//        System.out.println(Arrays.toString(stringToArray(s)));
//        System.out.println(countingSheep(10));
//        System.out.println(getXO("ooxxx"));


    }
    public static boolean validatePin(String pin) {
        // Your code here...
        return true;
    }
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        int sum = laLigaGoals + copaDelReyGoals + championsLeagueGoals;;
        return sum;
    }
    public static boolean getXO(String str) {
        char[] words = str.toCharArray();
        System.out.println(Arrays.toString(words));
        int x = 0, o = 0;
        for (char i : str.toCharArray()) {
            if (i == 'x' || i == 'X') {
                x++;
            } else if (i == 'o' || i == 'O') {
                o++;
            }
        }
        if (x == o) {
            return true;
        }

        return false;
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i).append(" sheep...");
        }
        return sb.toString();
    }

    public static String[] stringToArray(String str) {
        String[] words = str.split(" ");
        return words;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static String highAndLow(String numbers) {
        String[] digits = numbers.split(" ");
        int max = Integer.parseInt(digits[0]);
        for (int i = 1; i < digits.length; i++) {
            if (max < Integer.parseInt(digits[i])) {
                max = Integer.parseInt(digits[i]);
            }
        }
        int min = Integer.parseInt(digits[0]);
        for (int i = 1; i < digits.length; i++) {
            if (min > Integer.parseInt(digits[i])) {
                min = Integer.parseInt(digits[i]);
            }
        }
        return max + " " + min;
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            str.append(string);
        }
        return str.toString();
    }

    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> 0;
        };
    }

    public static String greet(String name) {
        String str = "Hello, " + name + " how are you doing today?";
        System.out.println(str);
        return str;
    }

    public static int strCount(String str, char letter) {
        char[] res = new char[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            res[i] = str.charAt(i);
            if (res[i] == letter) {
                count++;
            }
        }
        System.out.println(Arrays.toString(res));
        System.out.println(count);
        return 0;
    }

    public static int makeNegative(final int x) {
        if (x > 0) {
            return x * (-1);
        }
        return x;
    }

    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

        return arr;
    }

    public static String bmi(double weight, double height) {
        double res = 0;
        res = weight / (height * height);
        if (res <= 18.5)
            return "Underweight";
        else if (res <= 25.0)
            return "Normal";
        else if (res <= 30.0) {
            return "Overweight";
        } else if (res > 30.0)
            return "Obese";
        return null;
    }


}


