package LInkedlist_java;

public class CallByreference {

    // Call by value with primitive
    static void changePrimitive(int x) {
        x = 100;  // only local copy changes
    }

    // Call by value with object reference
    static void changeObject(StringBuilder sb) {
        sb.append(" World"); // modifies object content
    }

    static void reassignObject(StringBuilder sb) {
        sb = new StringBuilder("New Object"); // only local reference changes
    }

    public static void main(String[] args) {
        // primitive example
        int a = 10;
        changePrimitive(a);
        System.out.println("After changePrimitive, a = " + a); // still 10

        // object example
        StringBuilder str = new StringBuilder("Hello");
        changeObject(str);
        System.out.println("After changeObject, str = " + str); // Hello World
        StringBuilder str1 = new StringBuilder("Hellohii");
        reassignObject(str1);
        System.out.println("After reassignObject, str = " + str1); // still Hello World
        
        String str2 = "nithya";
        str2 = "anil";
        System.out.println(str2);  //it will print the replaing value . anil , not nithya
//        str1 = "anil";
//        System.out.println(str1);  // print anil , if we dont use the printing statement after reassigning the value , then it will shows the nithya
        
    }
}

