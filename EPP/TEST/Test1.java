import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("请输入成绩，用逗号隔开：");
		try{
		//输入成绩字符串，
		String input=keyboard.next();
		//按逗号分隔				
		String[] arr=input.split(",");
		double[] scores=new double[arr.length];
		double sum=0;
		int[] level=new int[5];
		//转存到数组
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
		//计算总分
		for(double x:scores) {
			sum+=x;
		}
		//计算最值,从大到小排序
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
		
//		for(int i=0;i<scores.length;i++) {//测试排序结果
//			System.out.println(scores[i]);
//		}
		
		//平均分
		System.out.println("平均分为："+(sum/scores.length));
		//最值
		System.out.println("最高分为："+scores[0]+"\t"+"最低分为："+scores[scores.length-1]);
		//分数分级
		System.out.println("总考试人数为："+scores.length+"\n等级为优："+level[0]+"人\t占比："+(double)level[0]/scores.length*100+
			"% \n良："+level[1]+"人\t占比："+(double)level[1]/scores.length*100+"% \n中:"+
			level[2]+"人\t占比："+(double)level[2]/scores.length*100+"% \n及格："+
			level[3]+"人\t占比："+(double)level[3]/scores.length*100+"% \n不及格："+
			level[4]+"人占比："+(double)level[4]/scores.length*100+"% \n");
	}
	catch(Exception e){
		System.out.print("请输入以逗号隔开的成绩！");
	}

	
	}
}


 




