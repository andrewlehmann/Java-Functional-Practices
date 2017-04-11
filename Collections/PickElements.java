import java.util.*;
import java.util.stream.Collectors;

class PickElements	{

	public static void main(String[] args) {

		final List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		final List<String> startsWithN =
			friends.stream()
				.filter(name -> name.startsWith("N"))
				.collect(Collectors.toList());
		System.out.println(String.format("Found %d names", startsWithN.size()));

	}
}
