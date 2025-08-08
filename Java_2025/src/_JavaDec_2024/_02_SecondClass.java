package _JavaDec_2024;

public class _02_SecondClass {

	public void division(int a, int b) throws Exception {
		System.out.println("the result is =" + a / b);
	}

	public void validateAge(int age) throws _02_AgeLessthanZeroException {
		if (age < 0) {
			throw new _02_AgeLessthanZeroException("Oh no!, something went wrong");
		}
	}

	public static void main(String[] args) {
		try {
//			int c = 10 / 0;
			int age = 17;
			if (age < 18) {
				_02_SecondClass obj = new _02_SecondClass();
//				obj.division(40,  0);
				obj.validateAge(-2);

				throw new RuntimeException("Age is less.");
			} else {
				System.out.println("you can vote!!");
			}

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException :)-->" + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException :)-->" + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("RuntimeException :)-->" + e.getMessage());
		} catch (_02_AgeLessthanZeroException e) {
			System.out.println("AgeLessthanZeroException :)-->" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception -->" + e.getMessage());
		}  finally {
			System.out.println("finally block");
		}

	}

}
