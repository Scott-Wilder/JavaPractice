
public class charArray {

	public static void main(String[] args) {
		char[] letters= {'A', 'B', 'C', 'D', 'D', 'D'};
		int count = countOccurrences(letters, 'D');
		System.out.println(count);
	}
	public static int countOccurrences(char[] letters, char searchLetter) {
		int count = 0;
		for (char letter : letters) {
			if (letter == searchLetter) {
				count++;
			}		
		}
		return count;
	}
}
