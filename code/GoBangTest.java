/*
    使用二维数组和循环实现五子棋游戏棋盘的绘制
*/
public class GoBangTest {
	
	public static void main(String[] args) {
		
		//1.声明一个具有17行17列，元素类型为String类型的二维数组
		String[][] arr = new String[17][17];
		
		//2.声明一个一维数组并初始化，然后将值分别赋给二维数组的第一行和第一列
		String[] arr1 =  {"  ","0 ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","a ","b ","c ","d ","e ","f "};
		for(int j = 0; j < arr[0].length; j++) {
			arr[0][j] = arr1[j];
		}
		for(int i = 1; i < arr[0].length; i++) {
			arr[i][0] = arr1[i];
		}
		
		//3.将二维数组的其余行列赋值为"+"
		//使用外层for循环控制赋值的行数
		String s = "+ ";
		for(int i = 1; i < arr.length; i++) {
			//使用内层for循环控制赋值的列数
			for(int j = 1; j < arr[i].length; j++) {
				arr[i][j] = s;
			}
		}
		
		//4.打印二维数组
		//使用外层for循环控制打印的行数
		for(int i = 0; i < arr.length; i++) {
			//使用内层for循环控制打印的列数
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}