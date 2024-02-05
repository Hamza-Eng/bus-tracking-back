package akaza.com.dto;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("haMza","salLh");

		// Getting a stream consisting of the
		// elements that are divisible by 5
		// Using Stream filter(Predicate predicate)
		 list.stream()
//		.filter(num -> num > 3)
//		.filter(num -> num < 10)
//		.forEach(x-> System.out.println(x));
		.forEach(x-> System.out.println(x.toUpperCase()));

	}

}
