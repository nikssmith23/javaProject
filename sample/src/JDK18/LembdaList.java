package JDK18;

import java.util.LinkedHashMap;

public class LembdaList {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> ls = new LinkedHashMap<>();
		ls.put(111, "nik");
		ls.put(222, "anik");
		ls.put(333, "bnik");
		System.out.println(ls);
		ls.forEach((s, a) -> {
			System.out.println(s);
			System.out.println(a);

		});
	}
}