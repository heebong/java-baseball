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
		int answer = makeAnswer();
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		System.out.println();
		
		System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
		System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		int resInt = sc.nextInt();
		boolean res = resInt == 2 ? false : true;
		
		return res;
	}
	
	public static int makeAnswer() {
		int num[] = new int[3];
		int number = 0;
		Random rand = new Random();
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = rand.nextInt(9) + 1;
			number += num[i]*Math.pow(10, i);
		}
		//System.out.println(number);
		
		return number;
	}

}
