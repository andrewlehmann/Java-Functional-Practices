class PrintList {
	public static void main(String[] args)	{
		final List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		System.out.println(
			friends.stream()
				.map(String::toUpperCase)
				.collect(joining(", ")));
	}
}
