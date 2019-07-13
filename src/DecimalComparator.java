public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
//        boolean to integer below in parenthesis but why second set parenthesis
         num1 = (int) (num1 * 1000);

         num2 = (int) (num2 * 1000);

        if (num1 == num2) {

            return true;
        }
        else

            return false;


    }

}
