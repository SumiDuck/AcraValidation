package org.example;

import static java.lang.Integer.parseInt;

//For pattern B (Local companies registered with ACRA)
public class AcraLocalValidator implements UENValidator {

    public boolean isValid(String uen) {
        // Make input uppercase to standardize
        uen = uen.toUpperCase();
        //Check the Pattern of the string ( yyyynnnnnX (10 digits) )
        if(!uen.matches("\\d{9}[A-Z]")){
           return false;

       }
       // Use substring(start,end) to take out parts of the uen string for validation
        int year = Integer.parseInt(uen.substring(0, 4));
        int currentYear = java.time.Year.now().getValue();

        if (year < 1800 || year > currentYear) {
            return false;
        }

        return true;
    }

    }

