

public class IntegerNumber extends MyNumber {

    int value;

    @Override
    MyNumber add(MyNumber other) {
        IntegerNumber total = new IntegerNumber(); // tao ra 1 object de tinh tong
        IntegerNumber o = (IntegerNumber)other; // ep kieu tham so ve dang so nguyen
        total.value = this.value + o.value; // tinh tong
        return total; // tra ve ket qua

    }

    @Override
    MyNumber subtract(MyNumber other) {
        IntegerNumber total = new IntegerNumber(); // tao ra 1 object de tinh tong
        IntegerNumber o = (IntegerNumber)other; // ep kieu tham so ve dang so nguyen
        total.value = this.value - o.value; // tinh tong
        return total; // tra ve ket qua
    }

    @Override
    MyNumber multiply(MyNumber other) {
        IntegerNumber total = new IntegerNumber(); // tao ra 1 object de tinh tong
        IntegerNumber o = (IntegerNumber)other; // ep kieu tham so ve dang so nguyen
        total.value = this.value * o.value; // tinh tong
        return total; // tra ve ket qua
    }

    @Override
    MyNumber divide(MyNumber other) {
        IntegerNumber total = new IntegerNumber(); // tao ra 1 object de tinh tong
        IntegerNumber o = (IntegerNumber)other; // ep kieu tham so ve dang so nguyen
        total.value = this.value / o.value; // tinh tong
        return total; // tra ve ket qua
    }

    @Override
    public String toString() {
        return this.value + " ";
    }
}
