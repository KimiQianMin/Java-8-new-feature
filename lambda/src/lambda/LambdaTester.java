package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTester {

	private static List<String> items = new ArrayList<>();

	static {
		items.add("A");
		items.add("BC");
		items.add("C");
		items.add("BD");
		items.add("E");
	}

	public static void main(String[] args) {
		for (String item : items) {
			System.out.println(item);
		}

		items.forEach(c -> System.out.println(c));

		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		System.out.println("--------");

		items.stream().filter(s -> s.contains("B"))
				.forEach(c1 -> System.out.println(c1));

	}

}
