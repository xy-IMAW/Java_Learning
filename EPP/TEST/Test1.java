import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("������ɼ����ö��Ÿ�����");
		try{
		//����ɼ��ַ�����
		String input=keyboard.next();
		//�����ŷָ�				
		String[] arr=input.split(",");
		double[] scores=new double[arr.length];
		double sum=0;
		int[] level=new int[5];
		//ת�浽����
		for(int i=0;i<arr.length;i++) {
			scores[i]=Double.parseDouble(arr[i]);
			if (scores[i]>=90) {
				level[0]++;
			}
			else if (scores[i]>=80&&scores[i]<90) {
				level[1]++;
			}
			else if (scores[i]>=70&&scores[i]<80) {
				level[2]++;
			}
			else if (scores[i]>=60&&scores[i]<70) {
				level[3]++;
			}
			else  {
				level[4]++;
			}
		}
		//�����ܷ�
		for(double x:scores) {
			sum+=x;
		}
		//������ֵ,�Ӵ�С����
		for(int i=scores.length-1;i>=0;i--) {
			double flag;
			for(int j=0;j<i;j++) {
				if (scores[j]<scores[i]) {
					flag=scores[i];
					scores[i]=scores[j];
					scores[j]=flag;
				}
				else {
					continue;
				}
			}
		}
		
//		for(int i=0;i<scores.length;i++) {//����������
//			System.out.println(scores[i]);
//		}
		
		//ƽ����
		System.out.println("ƽ����Ϊ��"+(sum/scores.length));
		//��ֵ
		System.out.println("��߷�Ϊ��"+scores[0]+"\t"+"��ͷ�Ϊ��"+scores[scores.length-1]);
		//�����ּ�
		System.out.println("�ܿ�������Ϊ��"+scores.length+"\n�ȼ�Ϊ�ţ�"+level[0]+"��\tռ�ȣ�"+(double)level[0]/scores.length*100+
			"% \n����"+level[1]+"��\tռ�ȣ�"+(double)level[1]/scores.length*100+"% \n��:"+
			level[2]+"��\tռ�ȣ�"+(double)level[2]/scores.length*100+"% \n����"+
			level[3]+"��\tռ�ȣ�"+(double)level[3]/scores.length*100+"% \n������"+
			level[4]+"��ռ�ȣ�"+(double)level[4]/scores.length*100+"% \n");
	}
	catch(Exception e){
		System.out.print("�������Զ��Ÿ����ĳɼ���");
	}

	
	}
}


 




