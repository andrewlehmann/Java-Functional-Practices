import java.util.*;

class PickDifferentNames	{

	final Function<String, Predicate<String>> startsWithLetter =
		letter -> name -> name.startsWith(letter);

	public static void main(String[] args) {

		final List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		final long countFriendsStartN =
			friends.stream()
				.filter(startsWithLetter.apply("N"))
				.count();
		final long countFriendsStartB =
			friends.stream()
				.filter(startsWithLetter.apply("B"))
				.count();
	}
}

