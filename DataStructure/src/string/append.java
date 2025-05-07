package string;

import java.security.PublicKey;
import java.util.Arrays;

public class append {

	public static String appenddata(String s1) {

		StringBuilder lowercase = new StringBuilder();
		StringBuilder Uppercase = new StringBuilder();

		StringBuilder Digit = new StringBuilder();

		for (char c : s1.toCharArray()) {

			if (Character.isDigit(c)) {

				Digit.append(c);
			} else {
				if (Character.isLowerCase(c)) {
					lowercase.append(c);

				} else {

					if (Character.isUpperCase(c)) {

						Uppercase.append(c);
					}
				}

				String sortedlowerString = sortingdata(lowercase.toString());
				String sortedupperString = sortingdata(Uppercase.toString());
				String digitString = sortingdata(Digit.toString());

//				return sortedlowerString+sortedupperString+digitString;

				return sortedlowerString + sortedupperString + digitString;
			}
		}
//		return sortedlowerString+sorted;
//		return s1;

	}

	public static String sortingdata(String s1) {

		char[] data = s1.toCharArray();

		Arrays.sort(data);
		String s11 = new String(data);

		return s11;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(appenddata("AaBbCc12"));

	}

}
