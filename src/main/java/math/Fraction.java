package math;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

public class Fraction {
  private final int input;
  private final int denominator;

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction(int numerator, int denominator) {
    this.input = numerator;
    this.denominator = denominator;
  }

  public Fraction plus(Fraction fraction) {
    return new Fraction(input + fraction.input, fraction.denominator);
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
