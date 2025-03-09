package opgave02.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void calculateFine() {
        Loan loan = new Loan(LocalDate.of(2025,12,14));
        int bødePris = loan.calculateFine(LocalDate.of(2025,12,28),true);

        assertEquals(60,bødePris);
    }
}