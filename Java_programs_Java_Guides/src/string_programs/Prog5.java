package string_programs;

public class Prog5 {

	public class StringPermutation {
	    public static void main(String[] args) {
	        String str = "ABC";
	        System.out.println("Permutations of " + str + ":");
	        permute(str, 0, str.length() - 1);
	    }

	    private static void permute(String str, int left, int right) {
	        if (left == right) {
	            System.out.println(str);
	            return;
	        }

	        for (int i = left; i <= right; i++) {
	            str = swap(str, left, i);
	            permute(str, left + 1, right);
	            str = swap(str, left, i);  // Backtrack
	        }
	    }

	    private static String swap(String str, int i, int j) {
	        char[] charArray = str.toCharArray();
	        char temp = charArray[i];
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
	}

	

}
