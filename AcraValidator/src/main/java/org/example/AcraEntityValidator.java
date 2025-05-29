package org.example;
//For pattern B (Local companies registered with ACRA)
public class AcraEntityValidator implements UENValidator {


    public static final String[] entityIn = {"LP", "LL", "FC", "PF", "RF", "MQ", "MM", "NB", "CC", "CS", "MB", "FM", "GS", "DP", "CP", "NR", "CM", "CD", "MD", "HS", "VH", "CH", "MH", "CL", "XL", "CX", "HC", "RP", "TU", "TC", "FB", "FN", "PA", "PB", "SS", "MC", "SM", "GA", "GB"};
    public static final char[] yearChar = {'T', 'S', 'R'};

    public boolean isValid(String uen) {
        // Make input uppercase to standardize
        uen = uen.toUpperCase();

        //Check the Pattern of the string (  (10 digits) )
        if (!uen.matches("^[A-Z]\\d{2}[A-Z]{2}\\d{4}[A-Z]$")) {
            return false;
        }

        // Get the 1st Letter to check if correct year of issuance is used
        char firstLetter = uen.charAt(0);
        boolean yearCheck = false;

        for (char i : yearChar) {
            if (firstLetter == i) {
                yearCheck = true;
                break;
            }
        }

        // Grab the "PQ" Letters and loop through the accepted Entity Indicator to find a match
        String entityLetters = uen.substring(3, 5);
        boolean entityCheck = false;

        for (String x : entityIn) {
            if (entityLetters.equals(x)) {
                entityCheck = true;
                break;
            }
        }
        // If Passed both checks
        return yearCheck && entityCheck;
    }
}
