/*
 * baseball
 * 
 * 1.0
 * 
 * 2019.03.25
 * 
 * heebg2
 * 
 * */

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
	
	/*
	 * ���� ����
	 * param : 
	 * return : res
	 * ������ �������, �׸� ���� ����.
	 * */
	public static boolean playGame() {
		int answer = makeAnswer();
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		
		System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
		System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		int resInt = sc.nextInt();
		boolean res = resInt == 2 ? false : true;
		
		return res;
	}
	
	/*
	 * ��ǻ�� ���� ����
	 * param :
	 * return : number
	 * 3�ڸ� ���� ����(1~9 / �ߺ� �ȵ�)
	 * */
	public static int makeAnswer() {
		int num[] = new int[3];
		int number = 0;
		Random rand = new Random();
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = rand.nextInt(9) + 1;
			i = deDupl(i,num);
		}
		
		for(int i = 0 ; i < num.length ; i++) {
			number += num[i]*Math.pow(10, i);
		}
//		System.out.println(number);
		
		return number;
	}
	
	/*
	 * �ߺ� �� ����
	 * param : i, num
	 * return : i
	 * 3�ڸ� ���� ���� �� �ߺ��� ���� ������ i���� ����.
	 * */
	public static int deDupl(int i, int[] num) {
		for(int j = 0 ; j < i ; j++) {
			if(num[j] == num[i]) {
				i--;
				break;
			}
		}
		
		return i;
	}

}
