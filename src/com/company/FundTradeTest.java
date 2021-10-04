package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FundTradeTest {
    FundTrade fundtrade = new FundTrade("T1", "APPL", 100, 12.5,  5.6);

    @Test
    public void testCalcDividend(){
        assertEquals(0.625, fundtrade.calcDividend());
    }
}
