import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {


    @Test
    public void whenInputIsNumber() {
        StringAdder adder = new StringAdder();
        int number = adder.add("5");
        assertEquals(5, number);
    }

    @Test
    public void whenInputIsZero() {
        StringAdder adder = new StringAdder();
        int zero = adder.add("0");
        assertEquals(0,zero);
    }

    @Test
    public void inputUnkown(){
        StringAdder adder = new StringAdder();
        int lotsOfNumbers = adder.add("0 123 4123 4129432");

    }




}