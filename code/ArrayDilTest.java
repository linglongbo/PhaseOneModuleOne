/*
    �Զ����������ݹ��򣬵��Ѵ洢Ԫ�������ﵽ�������� 80%ʱ������ 1.5 ���� ���磬�������� 10��������� 8 ��Ԫ��ʱ������������ݣ������� 10 �� 15��
*/
import java.util.Scanner;

public class ArrayDilTest {
	
	public static void main(String[] args) {
		
		// 1.����һ��int���飬����ʾ�û��������鳤�Ȳ��ñ�����¼
		System.out.println("������Ҫ���������鳤�ȣ�");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean full = false;  //��������Ƿ����
		int i = 0;  //��ʶ������˼���
		while(!full) {
			// 2.�������д洢Ԫ�ز��ж��Ѿ�ʹ�õ���������
			do {
				System.out.println("��������Ҫ������ݣ�");
				arr[i] = sc.nextInt();
				i++;
			} while(i < arr.length*0.8);
			// 3.����
			System.out.println("���Ѿ�ʹ����80%�����������Ƿ����ݣ�y/n����");
			String flag = sc.next();
			boolean stop = (flag.equals("n")) ? false:true;
			if(!stop) {
				// ����30�лᱻ�ظ���ӡ���д��Ľ�����
				System.out.println("ϵͳ��⵽�����������ݣ����Ե�����Ԫ�ش洢��ʱ�Զ��˳�����¼�����" + i);
				if(i == arr.length) {
					full = true;
				}
				continue;
			} else {
				System.out.println("�Ѵ洢���ﵽ������������80%, ��������1.5��");
					// ������������Ϊԭ����1.5��
					int[] arr2 = new int[arr.length*3/2];
					//��ԭ�������Ԫ�ظ��Ƶ����ݺ��������
					for(int j = 0; j<arr.length; j++) {
						arr2[j] = arr[j];
					}
					arr = arr2; //��arrָ�����ݺ������
					System.out.println("����������" + arr.length + " (�Ѵ洢��" + i + "��Ԫ��)");
					System.out.println("------------------------------------------");
			}
		}
	}
}