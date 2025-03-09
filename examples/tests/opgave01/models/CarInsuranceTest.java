package opgave01.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {

    @Test
    void calculatePremium() {
        CarInsurance carInsurance = new CarInsurance(500);

        double test = carInsurance.calculatePremium(24,true, 3);
        double expected = 504.6875;

        assertEquals(expected,test);
    }

    @Test
    void testCalculatePremium() {
    }
}