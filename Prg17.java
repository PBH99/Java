package prashant;

public class Prg17 {

	public static void main(String[] args) {
		
		String name = "Prashant";
		System.out.println(name);
		int value =name.length();
		System.out.println(value);
		System.out.println(name.length());
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String names = "     Rahul    ";
        // String names = names.Trim();
		System.out.println(names);      // We can use both method (1 - create new string or write variable.string method in print function )
		System.out.println(names.trim());
		
		System.out.println(name.substring(5));
		System.out.println(name.substring(1,5));
		System.out.println(name.replace('r','t'));
		System.out.println(name.replace("Pra","bra"));
		System.out.println(name);
		
	}

}
