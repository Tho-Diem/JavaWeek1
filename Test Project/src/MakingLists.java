import java.util.ArrayList;

public class MakingLists {

	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static ArrayList<String> stringList = new ArrayList<String>();

	public static void main(String[] args) {
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		intList.add(9);
		intList.add(10);

		// intList.size();

		// System.out.println(intList);
		// System.out.println(intList.remove(5));
		// System.out.println(intList);
		// System.out.println(intList.size());
		// System.out.println(intList.get(4));
		System.out.println(q2(intList, 50));

		stringList.add("cat");
		stringList.add("tortoise");
		stringList.add("tortoise");
		System.out.println(stringList);
		System.out.println(q3(stringList, "turtle"));
		System.out.println(q5(intList, 10));
		System.out.println(quest4(stringList, "tortoise"));

	}

	public static boolean q2(ArrayList<Integer> inputlist, int num) {
		// if (inputlist.contains(num)) {
		// System.out.println("This list contains " + num);
		// }
		return (inputlist.contains(num));
	}

	public static boolean q3(ArrayList<String> inputlist, String animal) {
		return (inputlist.contains(animal));
	}

	// public static void q4(ArrayList <Integer> inputlist, int num) {
	// if (inputlist.contains(num % 5 == 0));
	// System.out.println(num * 10);
	// }

	public static int q5(ArrayList<Integer> inputlist, int num) {
		int total = 0;
		for (int i = 0; i < inputlist.size(); i++) {
			total += inputlist.get(i);
		}
		System.out.println(total);
		return total;
	}

	public static int quest4(ArrayList<String> stringList, String input) {
		return (int) stringList.stream().filter(s -> s.equals(input)).count();
	}

	public static int quest6(ArrayList<Integer> intList, int input) {
		return (int) intList.stream().reduce(Integer::max).get();
	}

}
