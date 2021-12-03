import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String[] idarr = new String[3]; // id 저장 할 배열
		int[] pwarr = new int[3]; // pwd 저장 할 배열
		int member2 = 0;
		int member = 0; // 회원의 수
		// "회원가입을 시작합니다!" 문구를 출력!
		// 회원가입을 해주세요. 반복 ~> id, pw배열에 데이터 입력
		// 단, 3명 초과로 회원가입을 한다면
		// 종료!
		while (true) {
			// 1번이 눌렸을때 실행하게 만들자.
			System.out.print("①.회원가입 ②.로그인 ③.종료 ");
			int menu = sc.nextInt();
			if (menu == 1) {
				if (member < 3) {
					System.out.println(" ===회원가입=== ");
					System.out.print("ID 생성 : ");
					idarr[member] = sc.next();
					System.out.print("PASSWARD 생성 : ");
					pwarr[member] = sc.nextInt();
					member++;
					System.out.println("가입 성공.");
				} else {
					System.out.println("종료.");
					break;
				}
			} else if (menu == 2) {
				System.out.println("==로그인==");

				System.out.print("ID 입력: ");
				String inputId = sc.next();
				System.out.print("PassWord 입력: ");
				int inputPW = sc.nextInt();
				int cnt = 0; // cnt는 로그인성공을 판별할 변수
				for (int i = 0; i < idarr.length; i++) {
					if (inputId.equals(idarr[i]) && inputPW == pwarr[i]) {
						System.out.println("로그인 성공.");
						cnt++;  //새로운 변수를 증가시킴~> 로그인 성공

					}
				}
				if (cnt == 0) {  // cnt가 0일때 로그인 실패.
					System.out.println("아이디 또는 비밀번호가 다릅니다");
				}
//				if (inputId.equals(idarr[0]) && inputPW == pwarr[0]) {
//					System.out.println("로그인 성공.");
//				} else if (inputId.equals(idarr[1]) && inputPW == pwarr[1]) {
//					System.out.println("로그인 성공.");
//				} else if (inputId.equals(idarr[2]) && inputPW == pwarr[2]) {
//					System.out.println("로그인 성공.");
				// }

			} else if (menu == 3) {
				System.out.println("===종료===");
				break;

			}
		}
	}
}
