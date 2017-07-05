import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class permutation {

	public static List<List<Integer>> permuteUnique(int[] num) {
		Set<List<Integer>> permutations = new HashSet<List<Integer>>();

		if (num.length > 0) {
			permutations.add(Arrays.asList(num[0]));

			for (int index = 1; index < num.length; index++) {

				Set<List<Integer>> newPermutations = new HashSet<List<Integer>>();
				for (List<Integer> list : permutations) {

					for (int innerIndex = 0; innerIndex <= list.size(); innerIndex++) {
						List<Integer> newList = new ArrayList(list);
						newList.add(innerIndex, num[index]);
						newPermutations.add(newList);
					}
				}

				permutations = newPermutations;
			}
		}
		return new ArrayList<List<Integer>>(permutations);
	}

	public static void main(String[] args) {

		int[] a = {1,2,3};

		System.out.println(permuteUnique(a));
	}
}