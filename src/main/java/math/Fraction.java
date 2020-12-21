package math;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

public class Fraction {
  public static final int INTEGER_DENOMINATOR = 1;
  public int numerator;
  public int denominator;

  public Fraction(int integerValue) {
    this(integerValue, INTEGER_DENOMINATOR);
  }

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Fraction plus(Fraction that) {
    int numerator1 = this.numerator;
    int denominator1 = this.denominator;
    int numerator2 = that.numerator;
    int denominator2 = that.denominator;

    if (denominator1 == denominator2){
      return new Fraction(numerator1 + numerator2, denominator1);
    }else {
      int numerator3 = numerator1 * denominator2;
      int numerator4 = numerator2 * denominator1;

      return new Fraction(numerator3 + numerator4, denominator1 * denominator2);
    }
  }

  @Override
  public boolean equals(Object other) {
    return reflectionEquals(this, other);
  }

  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }
}
