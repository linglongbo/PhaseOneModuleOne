/*
    ����ҳ� 1000 ���ڵ�������������ӡ����������������һ����ǡ�õ�����������֮�ͣ��磺6=1��2��3�� 
*/
public class WanShuTest {
	
	public static void main(String[] args) {
		
		//1.�ҳ�1000�������е�����
		System.out.println("1000���ڵ������У�");
		for(int i = 1; i < 1000; i++) {
			//2.�ҳ���������������������Ӳ����
			int sum = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					sum += j;
				}	
			}
			//3.���������жϸ������Ƿ�����������������ӡ
			if(i == sum) {
			System.out.print(i + " ");
			}
		}
	}
}