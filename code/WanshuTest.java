/*
    编程找出 1000 以内的所有完数并打印出来。【完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3】 
*/
public class WanShuTest {
	
	public static void main(String[] args) {
		
		//1.找出1000以内所有的整数
		System.out.println("1000以内的完数有：");
		for(int i = 1; i < 1000; i++) {
			//2.找出除整数本身外的所有因子并求和
			int sum = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					sum += j;
				}	
			}
			//3.根据条件判断该整数是否是完数，如果是则打印
			if(i == sum) {
			System.out.print(i + " ");
			}
		}
	}
}