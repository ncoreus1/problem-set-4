/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		
		ps.surroundMe("ABCD", "EFG");
		ps.endsMeet("qwerty", 2);
		ps.doubleVision("Tesla");
		ps.upOrDown(12.5, 'f');
		ps.addMe("Nice", true);
		ps.centered("string", "String");
		ps.middleMan("String");
		ps.countMe("Yesterday", 'y');
		ps.isNotEqual("Is not is not");
		ps.triplets("String");
	}
	
	/**
	 * @surroundMe is a public method that accepts two Strings as input, and
	 * returns a single String as output.
	 * 
	 * Given two Strings, @out and @in, return a new String built by surrounding @in
	 * with the first and last two characters of @out. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param out - a 4-character String of the format AABB
	 * @param in - a 3-character String of the format XYZ
	 * 
	 * @return a String constructed from @in and @out of the format AAXYZBB
	 */
	
	public String surroundMe(String out, String in) {
		if (out == null || in == null) {
		return out.substring(0, 2) + in + out.substring(2);
		}
		else {
			return null;
		}
	}
	
	/**
	 * @endsMeet is a public method that accepts a String and an integer as input, and
	 * returns a single String as output.
	 * 
	 * Given a String, @str, and an integer, @n, return a new String built by
	 * combining the first @n and last @n characters of @str. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String whose length falls in the range [1, 10]
	 * @param n - an integer no greater than the length of @str
	 * 
	 * @return a String constructed from the first @n and last @n characters of @str
	 */
	
	public void endsMeet(String str, int n) {
		int length = str.length();
		String NewString = str.substring(0, n) + str.substring(length - n);
		if (length <= 10 && length > 0 && length < n) {
			System.out.println(NewString);
		}
	}
	
	/**
	 * @middleMan is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is odd, return a 3-character String built from the
	 * 3 middle characters of the original String. Return null if the input
	 * specifications are not met.
	 * 
	 * @param str - a String whose length is odd
	 * 
	 * @return a 3-character String constructed from the middle 3 characters of @str
	 */
	
	public String middleMan(String str) {
		if (str.length() % 2 == 1) {
			String NewString = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
			return NewString;
		}
		else {
			return null;
		}
	}
	
	/**
	 * @doubleVision is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is at least 1, return a String built from duplicating
	 * every character from the original String. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String whose length is at least 1 in the format ABC
	 * 
	 * @return a String where each character in @str is duplicated in the format AABBCC
	 */
	
	public String doubleVision(String str) {
		String NewString = "";
		if (str == null) {
			for (int i = 0; i < str.length(); i++) {
				NewString = NewString + str.charAt(i) + str.charAt(i);
			}
			return NewString;
		}
		else {
			return null;
		}
	}
	
	/**
	 * @centered is a public method that accepts a single String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String, determine whether or not a target sequence is in the middle of the
	 * original String. The middle of a String will be defined as follows: the number of
	 * characters the left and right of the target sequence differ by at most 1. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String that contains @target
	 * @param target - a 3-character String of the format ABC
	 * 
	 * @return true if @target is in the middle of @str and false if it is not
	 */

	public boolean centered(String str, String target) {
		if (str == (null) || target == (null) || target.length() != 3) {
			return false;
		}
		if (target.equals( str.substring((str.length() / 2) - 1 , (str.length() / 2) + 2))) {
			return true;
		}
		return false;
	}

	
	/**
	 * @upOrDown is a public method that accepts a decimal value and a character as
	 * input, and returns an integer as output.
	 * 
	 * Given a decimal value and a character representing either rounding up (+),
	 * rounding down (-), flooring (f), or ceiling (c), return the result of the
	 * operation as an @int. Return -1 if the input specifcations are not met.
	 * 
	 * @param number - a decimal value
	 * @param operation - a @char in the set [+, -, f, c]
	 * 
	 * @return the result of the operation as an @int
	 */
	
	public int upOrDown(double decimal, char direction) {
		int decimal2 = (int)decimal;
		if (decimal % Math.floor(decimal) != 0 && direction == 'f' || direction == 'c') {
			switch(direction) {
			case 'f':
			Math.floor(decimal);
			break;
			case 'c':
				if (decimal - Math.floor(decimal) > 0.5) {
				decimal += 0.5;
				Math.round(decimal);
				break;
				}
				else {
					Math.round(decimal);
					break;
				}
			}
		}
		return decimal2;
	}
	
	/**
	 * @countMe is a public method that accepts a String and a character as input,
	 * and returns an integer as output.
	 * 
	 * Given a String and a character, count and return the number of words in the
	 * specified String that end in the specified character. For our purposes, the
	 * end of a word will be defined as an alphabetic character followed by whitespace
	 * (i.e., a space, tab, or line break). Return -1 if the input specifcations are
	 * not met.
	 * 
	 * @param text - a sequence of alphabetic and whitespace characters
	 * @param end - a character in the range [Aa-Zz]
	 * 
	 * @return the number of words in @text that end with @end
	 */
	
	public int countMe(String text, char end) {
		if (text == (null)) {
			return -1;
		}
		if (!Character.isLetter(end)) {
			return -1;
		}
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == end && text.charAt(i + 1) == ' ') {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * @isNotEqual is a public method that accepts a String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String of text, determine whether the number of case-sensitive appearances
	 * of the word is equals the number of case-sensitive appearances of not. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String of text containing 0 or more appearances of is and not
	 * 
	 * @return true if the appearances of is == the appearances of not; false otherwise
	 */
	
	public boolean isNotEqual(String str) {
		int isCount = 0;
		int notCount = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.substring(i - 1, i) == "is") {
				isCount++;
			}
		}
		for (int h = 1; h < str.length(); h++) {
			if (str.substring(h - 1, h) == "not") {
				notCount++;
			}
		}
		return isCount == notCount;
	}
	
	/**
	 * @triplets is a public method that accepts a single String as input, and
	 * returns an integer as output.
	 * 
	 * Given a String of case-insenstive letters, return the number of triplets. A triplet
	 * is defined as a case-sensitive sequence of 3 identical characters in a row. A triplet
	 * can overlap, meanning AAAA counts as 2 triplets. Return -1 if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String of alphabetic letters without whitespace
	 * 
	 * @return the number of triplets in @str
	 */
	

	public int triplets(String str) {
		if (str == (null)) {
			return -1;
		}
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (Character.isLetter(str.charAt(i)) == false) {
				return -1;
			}
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				count++;
			}
		}
		return count;
	}

	
	/**
	 * @addMe is a public method that accepts a String and a boolean as input, and
	 * returns an integer as output.
	 * 
	 * Given a String, compute and return either the sum of the digits or the sum of the numbers
	 * contained within that String. If @digits is true, then sum the digits individually. If it
	 * is false, sum the numbers. A number is defined as a consecutive series (possibly 1) of
	 * digits in the String. Return -1 if the input specifications are violated.
	 * 
	 * @param str - a String of alphanumeric text
	 * @param digits - indicates whether to sum the digits or the numbers
	 * 
	 * @return the sum of the digits or numbers as specified by @digits
	 */
	
	public int addMe(String str, boolean digits) {
		int sum = 0;
		if (digits == true) {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					sum += (int)str.charAt(i);
				}
			}
		}
		else if (digits == false) {
			int tens = 0;
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					tens *= 10;
					tens += (int)str.charAt(i);
				}
				else if (!Character.isAlphabetic(str.charAt(i))) {
					return -1;
				}
				else {
					sum += tens;
					tens = 0;
				}
			}
			sum += tens; 
		}
		return sum;
	}
	
	
	// 1abc2abc3 == 6
	// 12abc3
	
}