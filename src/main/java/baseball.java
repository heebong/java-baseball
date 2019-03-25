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
//		System.out.println(answer);				/* ���� Ȯ�ν� �ּ� ���� */
		
		int[] hint = new int[2];
		while(true) {
			hint = rightAnswer(answer);
			printHint(hint);
			if(hint[0] == 3) {
				break;
			}
		}
		
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
		
		return number;
	}
	
	/*
	 * �ߺ� �� ����
	 * param : i, num
	 * return : i
	 * ��ǻ�� ���� ���� �� 3�ڸ� ���� ���� �� �ߺ��� ���� ������ i���� ����.
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
	
	/*
	 * ���� �Է¹޾� ���߱�
	 * param : answer
	 * return : hint
	 * ���� �Է¹޾� ����(��Ʈ��) ����.
	 * */
	public static int[] rightAnswer(int answer) {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		
		int hint[] = getHint(answer, number);
		return hint;
	}
	
	/*
	 * ���(��Ʈ) ���
	 * param : hint
	 * return : 
	 * hint�� ���� ���� ��Ʈ����ũ or �� or ���� ���
	 * */
	public static void printHint(int[] hint) {
		String str = "";
		
		/* ��Ʈ����ũ ��� */
		if(hint[0] != 0) {
			str += hint[0] + " ��Ʈ����ũ ";
		}
		
		/* �� ��� */
		if(hint[1] != 0) {
			str += hint[1] + "��";
		}
		
		/* ���� ��� */
		if(hint[0] == 0 && hint[1] == 0) {
			str = "����";
		}
		
		System.out.println(str);
	}
	
	/*
	 * ���(��Ʈ) ��������
	 * param : answer, number
	 * return : hint[]
	 * hint�� ���� ��� ������ �����Ѵ�.
	 * */
	public static int[] getHint(int answer, int number) {
		int[] hint = new int[2];
		
		int ansarr[] = splitInt(answer);
		int numarr[] = splitInt(number);
		
		for(int i = 0 ; i < ansarr.length ; i++) {
			hint[0] += setHint(i,ansarr,numarr)[0];
			hint[1] += setHint(i,ansarr,numarr)[1];
		}
		return hint;
	}
	
	/*
	 * ���� �ڸ������ ������
	 * param : num
	 * return : number[]
	 * �ڸ����� �񱳸� ���� �ڸ������ ������
	 * */
	public static int[] splitInt(int num) {
		int[] number = new int[3];
		int divi = 100;
		for(int i = 0 ; i < number.length ; i++) {
			number[i] = num/divi;
			num = num%divi;
			divi = divi/10;
		}
		
		return number;
	}
	
	/*
	 * ���(��Ʈ) ����
	 * param : i, ansarr[], numarr[]
	 * return : hint[]
	 * ��Ʈ����ũ�� ���� Ȯ���� ��Ʈ������ ����.
	 * */
	public static int[] setHint(int i, int[] ansarr, int[] numarr) {
		int hint[] = new int[2];
		
		/* ��Ʈ����ũ ���� */
		if(ansarr[i] == numarr[i]) {
			hint[0] += 1;
		}
		
		/* �� ���� */
		for(int j = 0 ; j < ansarr.length ; j++) {
			if(i == j) {
				continue;
			}
			if(ansarr[i] == numarr[j]) {
				hint[1] += 1;
			}
		}
		
		return hint;
	}

}
