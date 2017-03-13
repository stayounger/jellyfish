package com.tecule.jellyfish;

public class Calculator {
  /**
   * calculation summation by expression.
   * 
   * @param expression
   *          - arithmetic expression
   * @return return summation
   */
  public int evaluate(String expression) {
    int sum = 0;
    for (String summand : expression.split("\\+")) {
      sum += Integer.valueOf(summand);
    }
    return sum;
  }
}
