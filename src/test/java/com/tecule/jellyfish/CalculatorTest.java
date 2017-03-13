package com.tecule.jellyfish;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void testEvaluateExpression() {
    Calculator calc = new Calculator();
    int sum = calc.evaluate("1+2+3");
    Assert.assertEquals("summary is not 6", 6, sum);
  }
}
