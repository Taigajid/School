import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean letterfound = false;
		System.out.println("Bitte geben sie ihr Wort ein: ");
		String word = sc.nextLine();
		System.out.println("Bitte geben sie den Buchstaben an nach dem das Programm suchen soll: ");
		String check = sc.nextLine();
		char checkletter = check.charAt(0);
		char[] wordarray = word.toCharArray();
		int wordsize = word.length();
		for(int i = wordsize; i > 0; i-- ){
		    int arrayindex = i - 1;
		    if(wordarray[arrayindex] == checkletter){
		        letterfound = true;
		    }
		}
		if(letterfound == true){
		    System.out.println("Der gesuchte Buchstabe ist enthalten!");
		}
		else{
		    System.out.println("Der gesuchte Buchstabe ist nicht enthalten!");
		}
	}
}