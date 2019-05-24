
public class Runner {
	public static void main(String[] args) {
		// System.out.println("HelloWorld");

		// String exampletest = "HelloWorld";
		// System.out.println(exampletest);
		// System.out.println(methodtest("Hello Owen!"));
		// System.out.println(addition(5, 7));
		// System.out.println(subtraction(6, 4));
		// System.out.println(multiplication(10, 2));
		// System.out.println(division(9, 2));

		calculator(5, 6, "subtract");
	}

	static String methodtest(String inputstring) {
		return inputstring;
	}

	static double addition(double value1, double value2) {
		return value1 + value2;
	}

	static double subtraction(double value1, double value2) {
		return value1 - value2;
	}

	static double multiplication(double value1, double value2) {
		return value1 * value2;
	}

	static double division(double value1, double value2) {
		return value1 / value2;
	}

	public static void calculator(double value1, double value2, String operation) {
		switch (operation) {
		case "add":
			System.out.println(addition(value1, value2));
			break;
		case "subtract":
			System.out.println(subtraction(value1, value2));
			break;
		case "multiply":
			System.out.println(multiplication(value1, value2));
			break;
		case "divide":
			System.out.println(division(value1, value2));
		default:
			System.out.println("Error");
		}
	}
}
