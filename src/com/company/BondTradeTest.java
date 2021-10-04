package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BondTradeTest {
    BondTrade bondtrade = new BondTrade("T1", "APPL", 100, 12.5, 5.6);

    @Test
    public void testCalcDividend(){
        assertEquals(5.6, bondtrade.calcDividend());
    }
}
