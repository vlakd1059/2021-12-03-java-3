import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String[] idarr = new String[3]; // id ���� �� �迭
		int[] pwarr = new int[3]; // pwd ���� �� �迭
		int member2 = 0;
		int member = 0; // ȸ���� ��
		// "ȸ�������� �����մϴ�!" ������ ���!
		// ȸ�������� ���ּ���. �ݺ� ~> id, pw�迭�� ������ �Է�
		// ��, 3�� �ʰ��� ȸ�������� �Ѵٸ�
		// ����!
		while (true) {
			// 1���� �������� �����ϰ� ������.
			System.out.print("��.ȸ������ ��.�α��� ��.���� ");
			int menu = sc.nextInt();
			if (menu == 1) {
				if (member < 3) {
					System.out.println(" ===ȸ������=== ");
					System.out.print("ID ���� : ");
					idarr[member] = sc.next();
					System.out.print("PASSWARD ���� : ");
					pwarr[member] = sc.nextInt();
					member++;
					System.out.println("���� ����.");
				} else {
					System.out.println("����.");
					break;
				}
			} else if (menu == 2) {
				System.out.println("==�α���==");

				System.out.print("ID �Է�: ");
				String inputId = sc.next();
				System.out.print("PassWord �Է�: ");
				int inputPW = sc.nextInt();
				int cnt = 0; // cnt�� �α��μ����� �Ǻ��� ����
				for (int i = 0; i < idarr.length; i++) {
					if (inputId.equals(idarr[i]) && inputPW == pwarr[i]) {
						System.out.println("�α��� ����.");
						cnt++;  //���ο� ������ ������Ŵ~> �α��� ����

					}
				}
				if (cnt == 0) {  // cnt�� 0�϶� �α��� ����.
					System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٸ��ϴ�");
				}
//				if (inputId.equals(idarr[0]) && inputPW == pwarr[0]) {
//					System.out.println("�α��� ����.");
//				} else if (inputId.equals(idarr[1]) && inputPW == pwarr[1]) {
//					System.out.println("�α��� ����.");
//				} else if (inputId.equals(idarr[2]) && inputPW == pwarr[2]) {
//					System.out.println("�α��� ����.");
				// }

			} else if (menu == 3) {
				System.out.println("===����===");
				break;

			}
		}
	}
}
