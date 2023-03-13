package throwAndThrowsKeyword;
import java.lang.Exception;

public class NegativeRadiusException extends Exception {
	@Override
    public String toString() {
        return "Radius cannot be negative..!!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative..!!";
    }
}
