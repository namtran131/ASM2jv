
public class Fraction extends MyNumber{

    int numberator;

    int denominator;

    @Override
    MyNumber add(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator * o.numberator;
        total.numberator = this.numberator * o.denominator + this.denominator * o.numberator;
        return total;
    }

    @Override
    MyNumber subtract(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator * o.numberator;
        total.numberator = this.numberator * o.denominator - this.denominator * o.numberator;
        return total;
    }

    @Override
    MyNumber multiply(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator * o.numberator;
        total.numberator = this.numberator * o.denominator * this.denominator * o.numberator;
        return total;
    }

    @Override
    MyNumber divide(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator * o.numberator;
        total.numberator = this.numberator * o.denominator / this.denominator * o.numberator;
        return total;
    }

    @Override
    public String toString() {
        return this.numberator + "/" + this.denominator;
    }
}

