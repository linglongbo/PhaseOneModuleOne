/*
    ���ʵ����ʾ�û�������������Ϣ���ж���һ������һ���еĵڼ��첢��ӡ
*/
import java.util.Scanner;

public class WhatDateTest {
	
	public static void main(String[] args) {
		
		int[] leapYear= {0,31,60,91,121,152,182,213,244,274,305,335,366};  //����ÿ�����ۼӵ�����
		int[] commonYear= {0,31,59,90,120,151,181,212,243,273,304,334,365};  //ƽ��ÿ�����ۼӵ�����
		// 1.��ʾ�û�������������Ϣ���ñ�����¼
		System.out.println("�밴˳�����������������ֱ��ʾ�����գ�");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int sumDays=0;
		// 2.�ж���һ������һ���еĵڼ���
		// �ж��Ƿ�Ϊ���꡾�ܱ�400������Ϊ���꡿
		if((year%4==0&&year%100!=0)||year%400==0) {
			// ���������
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				if(day<1||day>31) {
						System.out.println("��������ȷ������!");
				}else {
					sumDays=leapYear[month-1]+day;
				}
			} else if(month == 2) {
				if(day<1||day>28) {
					System.out.println("��������ȷ������!");
				} else {
					sumDays=leapYear[month-1]+day;
				}
			} else if(month==4||month==6||month==9||month==11) {
				if(day<1||day>30) {
					System.out.println("��������ȷ������!");
				} else {
					sumDays=leapYear[month-1]+day;
				}		
			} else {
				System.out.println("��������ȷ���·�!");
			}
		} else {
			// ƽ�������
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				//�ж������Ƿ���31��֮��
				if(day<1||day>31) {
					System.out.println("��������ȷ������!");
				} else {
					sumDays=commonYear[month-1]+day;
				}
			} else if(month==2) {
				//�ж������Ƿ���29��֮��
				if(day<1||day>29) {
					System.out.println("��������ȷ������!");
				}else {
					sumDays=commonYear[month-1]+day;
				}
			} else if(month==4||month==6||month==9||month==11) {
				if(day<1||day>30) {
					System.out.println("��������ȷ������!");
				} else {
					sumDays=commonYear[month-1]+day;
				}
			} else {
				System.out.println("��������ȷ���·�!");
			}
		}
		// 3.��ӡ���
		System.out.println("��һ��Ϊһ���еĵ�" + sumDays + "��!");
	}
}