/*
    ʹ�ö�ά�����ѭ��ʵ����������Ϸ���̵Ļ���
*/
public class GoBangTest {
	
	public static void main(String[] args) {
		
		//1.����һ������17��17�У�Ԫ������ΪString���͵Ķ�ά����
		String[][] arr = new String[17][17];
		
		//2.����һ��һά���鲢��ʼ����Ȼ��ֵ�ֱ𸳸���ά����ĵ�һ�к͵�һ��
		String[] arr1 =  {"  ","0 ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","a ","b ","c ","d ","e ","f "};
		for(int j = 0; j < arr[0].length; j++) {
			arr[0][j] = arr1[j];
		}
		for(int i = 1; i < arr[0].length; i++) {
			arr[i][0] = arr1[i];
		}
		
		//3.����ά������������и�ֵΪ"+"
		//ʹ�����forѭ�����Ƹ�ֵ������
		String s = "+ ";
		for(int i = 1; i < arr.length; i++) {
			//ʹ���ڲ�forѭ�����Ƹ�ֵ������
			for(int j = 1; j < arr[i].length; j++) {
				arr[i][j] = s;
			}
		}
		
		//4.��ӡ��ά����
		//ʹ�����forѭ�����ƴ�ӡ������
		for(int i = 0; i < arr.length; i++) {
			//ʹ���ڲ�forѭ�����ƴ�ӡ������
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}