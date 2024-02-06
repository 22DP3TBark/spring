package rvt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Moneytest {

    @Test
    public void testPlusMethod(){

        Money mon1 = new Money(1, 85);
        Money mon2 = new Money(2, 90);

        Money result1 = mon1.plus(mon2);

        assertEquals(null, null);

    }
    

    @Test
    public void testMinusMethod(){

    }
}
