package Custom_Exceptions;

public class finally_keyword {
	public static void main(String[] args) {
		int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally for value of b "+ b);
            }
            b--;
        }
        // at the place of catch we can use finally but if exception occurs it will give the error
        try {
            System.out.println(5/0);
        } finally {
            System.out.println("Yes i am finally");
        }
	}
}
