public class Main {
    public static void main(String[] args) {
        System.out.println("Call By Value VS Call By Reference!");

//		Passing values to methods can be done in
//		two primary ways:
//			- Pass by value (ByVal)
//			- Pass by reference (ByRef)
//
//		ByVal means a copy of the VALUE is created in memory
//		and passed to the method.
//		ByRef means a POINTER to the original value is passed
//		to the method.
//
//		When making changes to the variable, the pass type impacts
//		whether or not the original value is changed or not.
//
//		General rule: Primitive data types default to ByVal, while
//			objects/arrays typically default to ByRef. The String datatype
//			is an exception - it defaults to ByVal.

//		WHY IS THIS IMPORTANT TO KNOW? You need to understand the different behaviours,
//		otherwise you're sometimes working with a copy of your values instead of
//		the "real" value, leading to potential logical errors and/or unexpected
//		behaviours in our programs.

//		Disclaimer: By Reference in Java isn't truly "By Reference" like in a lot of
//		other programming languages, but for our purposes, we're going to consider it so.
//		(In Java, a copy of the pointer is passed... not important at our level!)

        //Example 1 - By Value
        int myNumber = 100;
        multiplyByFive(myNumber);
        System.out.println("Example 1: ");
        System.out.println(myNumber); //What value gets printed?
        // 100 - because it is passed By Value
        //Result: A COPY of 100 was multiplied by 5

        System.out.println(""); //Print a linebreak

        //Example 2 - By Reference
        int[] myNumbers = {10,20,30};
        multiplyByFive(myNumbers); //pointer-Pointing to a physical address in the RAM
        System.out.println("Example 2:");
        for (int i=0;i<myNumbers.length;i++)
            System.out.println(myNumbers[i]);//What values get printed?
        //50,100,150 - because the array is passed By Reference
        //Result: The values in the original array were changed
        //because a POINTER to the original array in memory was
        //passed into the method... we were always using the original.
    } // End of the main method

    //Original method used in Example 1
    private static void multiplyByFive(int aNumber)
    {
        aNumber = aNumber * 5;
        //System.out.println("From the method's body, the value is: " + aNumber);
    }

    //Altered method used in Example 2 (Note: Overload!)
    private static void multiplyByFive(int[] someNumbers)
    {
        for (int i=0;i<someNumbers.length;i++)
            someNumbers[i] = someNumbers[i] * 5;
    }

}