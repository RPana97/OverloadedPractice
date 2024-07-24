public class Counter {
    private int value;

    // Constructor that sets the start value of the counter to "startValue"
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Constructor that sets the start value of the counter to 0
    public Counter() {
        this.value = 0;
    }

    // Method that returns the current value of the counter
    public int value() {
        return this.value;
    }

    // Method that increases the value by 1
    public void increase() {
        this.value++;
    }

    // Method that decreases the value by 1
    public void decrease() {
        this.value--;
    }

    // Overloaded method that increases the value by the value of increaseBy
    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.value += increaseBy;
        }
    }

    // Overloaded method that decreases the value by the value of decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value -= decreaseBy;
        }
    }

    public static void main(String[] args) {
        // Create a counter with the start value of 10
        Counter counter1 = new Counter(10);
        System.out.println("Counter1 initial value: " + counter1.value());

        // Increase counter1 by 1
        counter1.increase();
        System.out.println("Counter1 after increase by 1: " + counter1.value());

        // Decrease counter1 by 1
        counter1.decrease();
        System.out.println("Counter1 after decrease by 1: " + counter1.value());

        // Increase counter1 by 5
        counter1.increase(5);
        System.out.println("Counter1 after increase by 5: " + counter1.value());

        // Decrease counter1 by 3
        counter1.decrease(3);
        System.out.println("Counter1 after decrease by 3: " + counter1.value());

        // Create a counter with the default start value of 0
        Counter counter2 = new Counter();
        System.out.println("\nCounter2 initial value: " + counter2.value());

        // Increase counter2 by 2
        counter2.increase(2);
        System.out.println("Counter2 after increase by 2: " + counter2.value());

        // Decrease counter2 by 1
        counter2.decrease(1);
        System.out.println("Counter2 after decrease by 1: " + counter2.value());

        // Attempt to increase counter2 by -3 (should not change)
        counter2.increase(-3);
        System.out.println("Counter2 after attempting to increase by -3: " + counter2.value());

        // Attempt to decrease counter2 by -2 (should not change)
        counter2.decrease(-2);
        System.out.println("Counter2 after attempting to decrease by -2: " + counter2.value());
    }
}
