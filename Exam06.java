import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// ���� ���� �� ����
		String cmp = "�ָ�";
		System.out.print("��� ���ǰ���?? ");
		Scanner sc = new Scanner(System.in);
		String user = sc.next(); // ����ڰ� �Է��� ��.

		if (user.equals("��")) { // ���ڿ� �񱳴� ���ذ�.equals("�񱳰�")���.
			System.out.println("�̰���");
		} else if (user.equals("�ָ�")) {
			System.out.println("�����.");
		} else if (user.equals("����")) {
			System.out.println("����.");
		}

	}

}
