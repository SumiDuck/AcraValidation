package org.example;
//For pattern A (Businesses registered with ACRA)
public class AcraBusinessValidator implements UENValidator{
    public boolean isValid(String uen) {

        // Make input uppercase to standardize
        uen = uen.toUpperCase();
        //Check the Pattern of the string ( nnnnnnnnX (9 digits) )
        return uen.matches("\\d{8}[A-Z]");
    }

}
