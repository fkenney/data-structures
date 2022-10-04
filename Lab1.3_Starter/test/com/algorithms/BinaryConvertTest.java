package com.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryConvertTest {

    // TODO-Lab1.3: Implement various tests using test plan



    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void binaryConversionTest_valid() {
       int answer = BinaryConvert.convertFromBinary("1111");
        Assert.assertEquals(15, answer );
    }

    @Test
    public void binaryConversionTest_invalid() {
        try {
            BinaryConvert.convertFromBinary("1113");
        } catch (IllegalArgumentException e) {
          // Assert.assertThrows(e.getCause())
        }
    }
}