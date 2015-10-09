package com.glen.he;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexCalculationTest {
ComplexCalculation cc = new ComplexCalculation();
    
    @Test
    public void DivisionTest() {
        
        int c = cc.Division(100, 5);
        
        assertEquals(20, c);        
    }

    @Test
    public void MultiplyTest() {
        
        int c = cc.Multiply(100, 5);
        
        assertEquals(500, c);        
    }
}
