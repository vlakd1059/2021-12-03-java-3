import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 가위 바위 보 게임
		String cmp = "주먹";
		System.out.print("어떤걸 낼건가요?? ");
		Scanner sc = new Scanner(System.in);
		String user = sc.next(); // 사용자가 입력한 값.

		if (user.equals("보")) { // 문자열 비교는 기준값.equals("비교값")사용.
			System.out.println("이겼음");
		} else if (user.equals("주먹")) {
			System.out.println("비겼음.");
		} else if (user.equals("가위")) {
			System.out.println("졌음.");
		}

	}

}
