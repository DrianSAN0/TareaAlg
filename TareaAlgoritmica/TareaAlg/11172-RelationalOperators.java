import java.util.Scanner;

class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(a < b ? "<" : a > b ? ">" : "=");
		}
	}
}