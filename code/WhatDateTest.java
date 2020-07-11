/*
    编程实现提示用户输入年月日信息，判断这一天是这一年中的第几天并打印
*/
import java.util.Scanner;

public class WhatDateTest {
	
	public static void main(String[] args) {
		
		int[] leapYear= {0,31,60,91,121,152,182,213,244,274,305,335,366};  //闰年每个月累加的天数
		int[] commonYear= {0,31,59,90,120,151,181,212,243,273,304,334,365};  //平年每个月累加的天数
		// 1.提示用户输入年月日信息并用变量记录
		System.out.println("请按顺序输入三个整数，分别表示年月日：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int sumDays=0;
		// 2.判断这一天是这一年中的第几天
		// 判断是否为闰年【能被400整除即为闰年】
		if((year%4==0&&year%100!=0)||year%400==0) {
			// 闰年的语句块
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				if(day<1||day>31) {
						System.out.println("请输入正确的天数!");
				}else {
					sumDays=leapYear[month-1]+day;
				}
			} else if(month == 2) {
				if(day<1||day>28) {
					System.out.println("请输入正确的天数!");
				} else {
					sumDays=leapYear[month-1]+day;
				}
			} else if(month==4||month==6||month==9||month==11) {
				if(day<1||day>30) {
					System.out.println("请输入正确的天数!");
				} else {
					sumDays=leapYear[month-1]+day;
				}		
			} else {
				System.out.println("请输入正确的月份!");
			}
		} else {
			// 平年的语句块
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				//判断天数是否在31天之内
				if(day<1||day>31) {
					System.out.println("请输入正确的天数!");
				} else {
					sumDays=commonYear[month-1]+day;
				}
			} else if(month==2) {
				//判断天数是否在29天之内
				if(day<1||day>29) {
					System.out.println("请输入正确的天数!");
				}else {
					sumDays=commonYear[month-1]+day;
				}
			} else if(month==4||month==6||month==9||month==11) {
				if(day<1||day>30) {
					System.out.println("请输入正确的天数!");
				} else {
					sumDays=commonYear[month-1]+day;
				}
			} else {
				System.out.println("请输入正确的月份!");
			}
		}
		// 3.打印结果
		System.out.println("这一天为一年中的第" + sumDays + "天!");
	}
}