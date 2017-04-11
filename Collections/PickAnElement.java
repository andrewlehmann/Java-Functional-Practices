class PickAnElement	{

	public static void pickName(
		final List<String> names, final String startingLetter)	{

		final Optional<String> foundName =
			names.stream()
				.filter(name -> name.StartsWith(startingLetter))
				.findFirst();
		System.out.println(String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No name found")));
	}

	public static void main(String[] args) {

		final List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		pickName(friends, "N");
		pickName(friends, "Z");

		foundName.ifPresent(name -> System.out.println("Hello " + name));
	}

}
