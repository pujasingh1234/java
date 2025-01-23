
public class CallByValue {
    // Method that takes an integer and tries to modify it
    public static void modifyValue(int num) {
        num = num * 2; // This only changes the local copy of 'num'
        System.out.println("Inside modifyValue method: " + num);
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before modifyValue method: " + x);
        modifyValue(x); // Pass the value of 'x'
        System.out.println("After modifyValue method: " + x); // 'x' remains unchanged
    }
}
