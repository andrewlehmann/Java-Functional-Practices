import java.util.*;
class Collections1 {
	public static void main(String[] args) {
		final List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		friends.forEach(System.out::println);
	}
}
