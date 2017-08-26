
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Returns
 */
public class Proj1 {

    public static void main(String[] args) {
        String outputDisplay = "Please enter n > 0: ";
        System.out.print(outputDisplay);

        int n = 0;
        boolean hasError = true;
        while (hasError) {
            Scanner sc = new Scanner(System.in);

            try {
                String input = sc.next();

                n = Integer.parseInt(input);

                if (n > 0) {
                    hasError = false;
                    sc.close();
                } else {
                    System.out.println("Please enter a number greater than 0.");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("NaN, please enter a valid integer value.");
            }
        }

        if (n == 0) {
            System.out.println("N is invalid: " + n);
            System.exit(1);
        }
        determinePossibleSums(n);
    }

    private static void determinePossibleSums(int n) {
        List<String> sums = partition(n, n, "", new ArrayList<>());

        for(int i = sums.size() - 1; i >= 0; i--) {
            System.out.println(sums.get(i).replaceFirst("\\+ ", ""));
        }
    }

    private static List<String> partition(int n, int max, String sumString, List<String> sumArray) {
        if(n == 0) {
            sumArray.add(sumString);
        } else {
            for(int i = Math.min(n, max); i >=1; i--) {
                partition(n - i, i, sumString + " + " + i, sumArray);
            }
        }
        return sumArray;
    }
}

