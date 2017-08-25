import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kendra's Laptop on 8/24/2017.
 */
public class Proj1 {

    public void main(String[] args) {
        String outputDisplay = "Please enter n > 0: ";
        System.out.print(outputDisplay);

        int n = 0;
        boolean hasError = true;
        while(hasError) {
            Scanner sc = new Scanner(System.in);

            try {
                String input = sc.next();

                n = Integer.parseInt(input);

                if(n > 0) {
                    hasError = false;
                    sc.close();
                } else {
                    System.out.println("Please enter a number greater than 0.");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("NaN, please enter a valid integer value.");
            }
        }

        if(n == 0 ) {
            System.out.println("N is invalid: " + n);
            System.exit(1);
        }
        List<String> possibileSums = determinePossibleSums(n);
    }

    public List<String> determinePossibleSums (int n) {
        List<String> possibleSums = new ArrayList <>();


        return possibleSums;
    }
}
