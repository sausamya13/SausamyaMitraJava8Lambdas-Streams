@FunctionalInterface
interface MyInterface {

    // abstract method
    float getInput(float n);
}

public class IntegerAverage {

    public static void main( String[] args ) {

        // declare a reference to MyInterface
        // assign a lambda expression to the reference
        MyInterface ref = (a) -> {

            float average;
			float  sum=0;
            for (int i = 1; i <= a ; i++)
            sum += i;
            average=sum/a;
			return average;
        };

        // call the method of the interface
        System.out.println("Average Value = " + ref.getInput(5));
    }

}