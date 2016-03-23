package test.hackerearth.algo;

class Base {
	int value = 0;

	Base() {
		addValue();
	}

	void addValue() {
		value += 10;
	}

	int getValue() {
		return value;
	}
}

class Derived extends Base {
	Derived() {
		addValue();
	}

	void addValue() {
		value += 30;
	}
}

public class Test extends Thread {
    public void run() {
        System.out.println("Hacker");
    }
    public void run(String s) {
        System.out.println("Earth");
    }
    public static void main(String[] args) {
        new Test().start();
    }
}