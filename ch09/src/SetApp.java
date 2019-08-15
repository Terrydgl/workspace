import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetApp {

	public static void main(String[] args) {
		// testHashSet();

		// testTreeSet();
	}

	private static void testTreeSet() {
		TreeSet<String> treeSet = new TreeSet<String>(new StringComparator());

		treeSet.add("AAA");
		treeSet.add("AAA");
		treeSet.add("AAA");
		treeSet.add("AAA");
		treeSet.add("AAA");
		treeSet.add("AAA");
		treeSet.add("BBB");
		treeSet.add("CCC");

		// 迭代(增强for循环语句):
		for (String item : treeSet) {
			System.out.printf("%4s ", item);
		}
		System.out.println();
	}

	private static void testHashSet() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("AAA");
		hashSet.add("AAA");
		hashSet.add("AAA");
		hashSet.add("AAA");
		hashSet.add("AAA");
		hashSet.add("AAA");
		hashSet.add("BBB");
		hashSet.add("CCC");

		System.out.println("hashSet.size() = " + hashSet.size());
		System.out.println("hashSet.isEmpty() = " + hashSet.isEmpty());
		System.out.println("hashSet.contains(\"BBB\") = " + hashSet.contains("BBB"));

		// 迭代方法一:
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.printf("%4s ", element);
		}
		System.out.println();

		// 迭代方法二(增强for循环语句):
		for (String item : hashSet) {
			System.out.printf("%4s ", item);
		}
		System.out.println();
	}

}

class StringComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;

		if (s1.charAt(0) < s2.charAt(0)) {
			return 1;
		} else if (s1.charAt(0) > s2.charAt(0)) {
			return -1;
		} else {
			return 0;
		}
	}

}
