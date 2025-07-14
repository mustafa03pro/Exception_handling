
public class Tester {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();

        for (String className : args) {
            try {
                child.loadingClass(className);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
}
class ParentClass {
    // Method to load a class by name
    public void loadingClass(String className) throws ClassNotFoundException {
        Class<?> cls = Class.forName(className);
        System.out.println("Class " + cls.getName() + " loaded successfully.");
    }
}
 class ChildClass extends ParentClass {
    @Override
    public void loadingClass(String className) {
        if (className == null || className.trim().isEmpty()) {
            throw new IllegalArgumentException("Class name cannot be null or empty.");
        }

        try {
            super.loadingClass(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found - " + className);
        }
    }
}

