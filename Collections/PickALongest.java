import java.util.*;

class PickALongest	{

	public static void main(String[] args)	{
		final List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		System.out.println("Total # of characters in all names: " +
			friends.stream()
				.mapToInt(name -> name.length())
				.sum());
	}
}
