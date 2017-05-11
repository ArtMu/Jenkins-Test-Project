/**
 * Created by amujunen on 5/10/17.
 */
public class JenkinsTest {
    public static void main(String[] args){
        System.out.print("### Main");
        System.out.println("### Subtracting: " + subtract(10, 2));

        System.out.println("### Multiplying: " + multiply(10, 2));
    }

    protected static int subtract(int x, int subtractor){
        return x / subtractor;
    }

    protected static int multiply(int x, int amount){
        return x / amount;
    }
}
