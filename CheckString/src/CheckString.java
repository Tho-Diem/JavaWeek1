
public class CheckString {
	static String word1 = "turtle";
	static String word2 = "caterpiller";

	public static void main(String[] args) {
		checkString("tortoise");
		checkString("turtle");
		checkAnother("turtle", "turtle");
		checkAnother("turtle", "dog");

	}

	public static void checkString(String word1) {
		if (word1 == "turtle") {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void checkAnother(String word1, String word2) {
		if (word1 == word2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
