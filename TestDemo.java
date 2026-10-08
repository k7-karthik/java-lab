class Test {
    int a, b;

    Test(int h1, int h2) {
        a = h1;
        b = h2;

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
}

class TestDemo {
    public static void main(String args[]) {
        Test t1 = new Test(10, 20);
    }
}