/*
	���ʵ��˫ɫ��齱��Ϸ�н���������ɣ��н�������6����������1�����������ɡ�
	�����к������Ҫ���������6��1~33֮�䲻�ظ���������룬�������Ҫ���������1��1~16֮���������롣��
*/ 

import java.util.Random;
import java.util.Arrays;

public class DoubleColorBallTest {
	
	public static void main(String[] args) {
		Random ra = new Random();
		// 1.����6��1~33֮�䲻�ظ������������룬����ӡ
		// ���ں�����벻�����ظ���������������ʼ����tempList��������ȷ����������ֹ�һ��
		boolean[] tempList = new boolean[33];
		int[] redList = new int[6];
		int temp = 0;
		for(int i =0; i < 6; i++) {
			do {
				temp = ra.nextInt(33);
			}while(tempList[temp]);
			tempList[temp] = true;
			redList[i] = temp;
		}
		// 2.����1��1~16֮������������룬����ӡ
		int blue = ra.nextInt(16);
		// ���մ�ӡ���������Ϊ���������ֱ�Ϊ��[5, 27, 11, 18, 14, 24]�������Ϊ��4��
		System.out.print("�������ֱ�Ϊ��" + Arrays.toString(redList) + "�������Ϊ��" + blue);
	}
}