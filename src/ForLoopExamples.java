package src;

public class ForLoopExamples {

	public static void main(String[] args) {
		/**
		 * Basic for loop
		 */
		for(int i =0; i < 10; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();
		
		/**
		 * Reverse for loop
		 */
		for(int i =10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		/**
		 * A to z
		 * Upper to lower
		 * Notice the special characters between capital Z and lower a
		 */
		for(char i ='A'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		/**
		 * Nested for loop
		 */
		for(int i =0; i < 10; i ++) {
			for(int j =0; j < 10; j ++) {
				System.out.print("(i, j) => ("+i+", "+j+")");
				System.out.println();
			}
		}
		
		System.out.println();
		
		/**
		 * Nested if statement
		 */
		for(int i =0; i < 10; i ++) {
			if ( i == 3) {
				System.out.println("i equals 3");
			}
		}
		
		System.out.println();
		
		/**
		 * break statements
		 */
		for(int i =0; i < 10; i ++) {
			System.out.print(i+ " ");
			if ( i == 3) {
				break;
			}
		}
		
		System.out.println();
		System.out.println();
		
		/**
		 * break statements with nested for loop
		 */
		for(int i =0; i < 10; i ++) {
			for(int j =0; j < 10; j++) {
				System.out.println("(i, j) => ("+i+", "+j+")");
				if (j == 4) {
					break;
				}
			}
			if (i == 3) {
				break;
			}
		}
	}

}
