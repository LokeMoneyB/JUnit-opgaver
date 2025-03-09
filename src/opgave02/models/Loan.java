package opgave02.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate actualDate, boolean adult) {
        int bøde = 0;
        int daysBetween = (int) ChronoUnit.DAYS.between(returnDate, actualDate);

        if(daysBetween >= 1 && daysBetween <= 7){
            if(adult==true){
                bøde = 20;
            } else{
            bøde = 10;}
        } else if(daysBetween >= 8 && daysBetween <= 14){
            if(adult==true){
                bøde = 60;
            } else {
            bøde = 30;}
        } else if(daysBetween >= 15){
            if(adult==true){
                bøde = 90;
            } else {
            bøde = 45;}
        }
        return bøde;
    }
}
