/*
    自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
*/
import java.util.Scanner;

public class ArrayDilTest {
	
	public static void main(String[] args) {
		
		// 1.声明一个int数组，并提示用户输入数组长度并用变量记录
		System.out.println("请输入要声明的数组长度：");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean full = false;  //标记数组是否存满
		int i = 0;  //标识数组存了几个
		while(!full) {
			// 2.在数组中存储元素并判断已经使用的数组容量
			do {
				System.out.println("请输入您要存的数据：");
				arr[i] = sc.nextInt();
				i++;
			} while(i < arr.length*0.8);
			// 3.扩容
			System.out.println("您已经使用了80%数组容量，是否扩容（y/n）？");
			String flag = sc.next();
			boolean stop = (flag.equals("n")) ? false:true;
			if(!stop) {
				// 【第30行会被重复打印（有待改进）】
				System.out.println("系统检测到您不打算扩容，所以当数组元素存储满时自动退出数据录入程序！" + i);
				if(i == arr.length) {
					full = true;
				}
				continue;
			} else {
				System.out.println("已存储量达到了数组容量的80%, 已扩容至1.5倍");
					// 增加数组容量为原来的1.5倍
					int[] arr2 = new int[arr.length*3/2];
					//将原来数组的元素复制到扩容后的数组中
					for(int j = 0; j<arr.length; j++) {
						arr2[j] = arr[j];
					}
					arr = arr2; //将arr指向扩容后的数组
					System.out.println("数组容量：" + arr.length + " (已存储：" + i + "个元素)");
					System.out.println("------------------------------------------");
			}
		}
	}
}