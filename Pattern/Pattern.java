package com.pattern;

public class Triangle {

	public static void rightAngleTriangle(int n) {
		// outer
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void reverseRightAngleTriangle(int n) {

		for (int i = 1; i <= n; i++) {
			// space

			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	public static void acuteAngleTriangle(int n) {
		// outer loop
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void diamondPattern(int n) {
		// outer loop
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2nd half loop
		for (int i = n; i >= 1; i--) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void solidSquare(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				System.out.print("*");

			}
			System.out.println();
		}
	}

	public static void rombousSquare(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void tiledRombousSquare(int n) {
		// outer
		for (int i = 1; i <= n; i++) {

			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void damru(int n) {
		// upper
		for (int i = 1; i <= n; i++) {
			// Spaces
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			// star
			for (int j = 1; j <= 2 * (n - i) + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// lower
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void butterFly(int n) {
		// above
		for (int i = 1; i <= n; i++) {

			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Below

		for (int i = n - 1; i >= 1; i--) {

			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void hallowDialmond(int n) {

		// Below

		for (int i = n - 1; i >= 1; i--) {

			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// above
		for (int i = 1; i <= n; i++) {

			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Triangle.rightAngleTriangle(5);
		System.out.println("\n");

		Triangle.reverseRightAngleTriangle(5);
		System.out.println("\n");

		Triangle.acuteAngleTriangle(5);
		System.out.println("\n");

		Triangle.diamondPattern(5);
		System.out.println("\n");

		Triangle.solidSquare(5);
		System.out.println("\n");

		Triangle.rombousSquare(5);
		System.out.println("\n");

		Triangle.tiledRombousSquare(5);
		System.out.println("\n");

		Triangle.damru(5);
		System.out.println("\n");

		Triangle.butterFly(5);
		System.out.println("\n");

		Triangle.hallowDialmond(5);
		System.out.println("\n");

	}

}
