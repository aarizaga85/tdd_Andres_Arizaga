package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {
    ICalculator c = Mockito.mock(ICalculator.class);

    @Test
    public void given_two_integers_when_addition_then_ok() {
        Mockito.when(c.addition(2, 3)).thenReturn(5);

        assertEquals(5, c.addition(2, 3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        Mockito.when(c.subtraction(4, 2)).thenReturn(2);

        assertEquals(2, c.subtraction(4, 2));
    }

    @Test
    public void given_two_integers_when_division_then_ok(){
        Mockito.when(c.division(6, 2)).thenReturn(3);

        assertEquals(3, c.division(6, 2));
    }

    @Test
    public void given_two_integers_when_multiplication_then_ok(){
        Mockito.when(c.multiplication(4, 2)).thenReturn(8);

        assertEquals(8, c.multiplication(4, 2));
    }
}