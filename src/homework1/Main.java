package homework1;

public class Main {
    public static void main(String[] args) {
//  1. Declare an int primitive variable and an Integer wrapper variable
        int primitiveInt = 10;
        Integer wrapperInteger;

//  2. Assign the int value to the Integer variable (autoboxing)
        wrapperInteger = primitiveInt;

//  3. Declare another Integer wrapper variable and assign it a value.
        Integer wrapperInteger2 = 17;
        Integer wrapperInteger3 = 18;

//  4. Assign the Integer value to an int variable (unboxing).
        int primitiveInt2 = (int) wrapperInteger2;
        int primitiveInt3 = wrapperInteger3; // Unboxing happens automatically

//  Display results
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer (autoboxed): " + wrapperInteger);
        System.out.println("Another Wrapper Integer: " + wrapperInteger2);
        System.out.println("Another Wrapper Integer: " + wrapperInteger3);
        System.out.println("Unboxed int: " + wrapperInteger2);
        System.out.println("Unboxed int: " + wrapperInteger3);
    }
}