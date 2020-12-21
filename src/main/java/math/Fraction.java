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
    return new Fraction(this.numerator + that.numerator, denominator);
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
