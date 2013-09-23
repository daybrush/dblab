import java.util.ArrayList;

public class week1 {
	public static long f(int n) {
		if (n == 1)
			return 2;
		else if (n == 2)
			return 3;
		else
			return f(n - 1) * f(n - 2);

	}

	public static String sort(String s) {
		ArrayList<String> sort = new ArrayList<String>();
		int insert = 0;
		if (s.length() == 0)
			return "";

		for (int i = 0; i < s.length(); i++) {
			for (insert = 0; insert < sort.size(); insert++) {
				if (sort.get(insert).charAt(0) > s.charAt(i))
					break;
			}
			sort.add(insert, "" + s.charAt(i));
		}
		StringBuilder b = new StringBuilder();
		for(String st:sort) {
			b.append(st);
		}
		return b.toString();
	}

	public static void main(String[] args) {
		System.out.println("f(9) = " + f(9));
		System.out.println("apple => " + sort("apple"));
	}
}
