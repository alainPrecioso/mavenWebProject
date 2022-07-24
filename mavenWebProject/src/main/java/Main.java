import java.io.IOException;
import java.sql.SQLException;
import java.util.function.Predicate;



public class Main {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
		
		Predicate<String> x = (String s) -> {if (s.equals("")) {
			return true;
		} else {
			return false;
		}};
		
		Predicate<String> y = (s) -> {return s.equals("");};
		
		Predicate<String> z = s -> s.equals("");
		
		
		
		String str = "";
		
		System.out.println();
	}
	
	public boolean test(String s) {
		if (s.equals("")) {
			return true;
		} else {
			return false;
		}
	}

}
