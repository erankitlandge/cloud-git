public class DuplicateElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 5, 6, 7, 6, 5, 7, 44, 32, 43, 56, 11, 8, 6, 9);

		Set<Integer> duplicate = list.stream().filter(e -> Collections.frequency(list, e) > 1)
				.collect(Collectors.toSet());

		System.out.println(duplicate);
	}

}
this is java filr
addedd
