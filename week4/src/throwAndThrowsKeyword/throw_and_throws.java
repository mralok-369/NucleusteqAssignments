package throwAndThrowsKeyword;

public class throw_and_throws {
	public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        // made by harry
        int result = a/b;
        return result;
    }
}
