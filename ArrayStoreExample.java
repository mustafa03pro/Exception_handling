
public class ArrayStoreExample {

    // Static method to store objects in a String array
    public static void storeObjects() {
        // Initialize an array of Strings
        Object[] strings = new String[5];

        // Try storing different objects
        try {
            strings[0] = "Hello";   // Valid
            strings[1] = "World";   // Valid
            strings[2] = "java";    // Valid

            // Uncomment the following line for test case 2
            // strings[2] = 123;    // Invalid - causes ArrayStoreException

            System.out.println("Objects stored successfully.");
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException caught: Incompatible type: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        storeObjects();  // Call the method
    }
}
