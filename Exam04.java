import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int[] ans = { 1, 4, 3, 2, 1 };
		int total = 0;

		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��Ͻÿ�.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "�� �� >> ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ans[i]) {
				total += 20;
				System.out.print("O" + " ");
			} else {
				System.out.print("X" + " ");
			}

		}
		System.out.println("       ���� : " + total);

	}

}
