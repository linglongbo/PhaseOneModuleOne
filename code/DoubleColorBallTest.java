/*
	编程实现双色球抽奖游戏中奖号码的生成，中奖号码由6个红球号码和1个蓝球号码组成。
	【其中红球号码要求随机生成6个1~33之间不重复的随机号码，蓝球号码要求随机生成1个1~16之间的随机号码。】
*/ 

import java.util.Random;
import java.util.Arrays;

public class DoubleColorBallTest {
	
	public static void main(String[] args) {
		Random ra = new Random();
		// 1.生成6个1~33之间不重复的随机红球号码，并打印
		// 由于红球号码不允许重复，所以声明并初始化了tempList数组用于确保号码仅出现过一次
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
		// 2.生成1个1~16之间的随机蓝球号码，并打印
		int blue = ra.nextInt(16);
		// 最终打印输出的内容为【红球号码分别为：[5, 27, 11, 18, 14, 24]蓝球号码为：4】
		System.out.print("红球号码分别为：" + Arrays.toString(redList) + "蓝球号码为：" + blue);
	}
}