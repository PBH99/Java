/* Write a program to fill in a letter template which looks like below 
 *      letter = "Dear <|name|> , Thanks a lot "
 *      Replace <|name|> with a string <some name)*/

package program;

public class Prg32 {

	public static void main(String[] args) {
		String letter ="Dear <|name|> , Thanks a lot ";
		
		letter=letter.replace("<|name|>" ,"Prashant bharadwaj");
		System.out.println(letter);

	}

}
