// Class demonstrating method overloading
class method {
    // Method to add two integers
    public int add(int n, int m) {
        return n + m;
    }

    // Method to add three integers
    public int add(int a, int n, int m) {
        return a + n + m;
    }

    // Method to concatenate two strings
    public String add(String n, String m) {
        return n + m;
    }
}

// Main class to demonstrate method overloading
public class meth {
    public static void main(String[] args) {
        method me = new method();

        // Call the add method with two integers
        int result = me.add(3, 4);
        System.out.println(result);

        // Call the add method with three integers
        int r2 = me.add(5, 7, 8);
        System.out.println(r2);

        // Call the add method with two strings
        String r3 = me.add("Sneha", " Dev");
        System.out.println(r3);
    }
}
