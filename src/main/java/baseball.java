import java.util.*;

public class baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean answer = true;
		while(answer) {
			answer = playGame();
		}
		System.out.println("������ �����մϴ�.");
	}
	
	public static boolean playGame() {
		System.out.println("���ڸ� �Է����ּ��� : ");
		
		System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
		System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		int ansInt = sc.nextInt();
		boolean answer = ansInt == 2 ? false : true;
		
		return answer;
	}

}
