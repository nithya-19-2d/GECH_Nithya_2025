package StaticInnerclass;

public class StaticInnerclass1 {
	
    static String outerStatic = "Outer Static";

    static class Inner {
        // Instance variable
        String innerInstance = "Inner Instance";

        // Static variable
        static String innerStatic = "Inner Static";

        void display() {
            System.out.println("Outer Static: " + outerStatic); // ✅
            System.out.println("Inner Instance: " + innerInstance); // ✅
            System.out.println("Inner Static: " + innerStatic); // ✅
        }

        static void staticMethod() {
            System.out.println("Static Method in Inner");
            System.out.println("Outer Static: " + outerStatic); // ✅
            // System.out.println(innerInstance); // ❌ Not allowed in static method
        }
    }

    public static void main(String[] args) {
    	StaticInnerclass1.Inner innerObj = new StaticInnerclass1.Inner();
        innerObj.display();
        StaticInnerclass1.Inner.staticMethod();
    }
}