import java.util.*;


public class cc{
	public static void main(String[] args){
		System.out.println(Accounttype.FIXD);
		
	}
	/*魔法币问题。
	机器1：投入x个返回2x+1个
	机器2：投入x个返回2x+2个
	要得到n个的投法。
	***思路：机器1只能产生奇数，机器2只能产生偶数，从n按奇偶倒退
	*/
	/*
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
         //System.out.println(1);
		 StringBuffer result = new StringBuffer();//结果字符串
		  int n=key.nextInt();
            while(n>0){               
                //coin(n);					
					if(n%2==0){
						result.append(2);
						n=(n-2)/2;
					}
					else{
						result.append(1);
						n=(n-1)/2;
					}
					}           
			System.out.print(result.reverse().toString());
    }*/

	/*字符串碎片长度问题。
	将相同小写字母看成一个碎片，输入s="aaabbaaac"，碎片平均长度为（3+2+3+1）/4=2.25
	***思路：每个碎片的长度其实不用计算最后相加的和还是字符串的长度，所以只要在比较相同字母时，对连续字母的碎片个数计数。
	*/
	/*
	public static void main(String[] args){
			Scanner key = new Scanner(System.in);
			StringBuffer str=new StringBuffer();
			 String s=key.next();
			 char[] ch=s.toCharArray();//转存到字符数组
			//开始比较匹配
			int p=0;//数组下标
			int count=1;//碎片个数
			double len=(double)ch.length;//数组长度即字符串长度
			for(;p<ch.length-1;p++){
				if(ch[p]==ch[p+1]){		
					continue;
					}
				else{				
					count++;
				}
			}
				double re=len/count;
			System.out.printf("%.2f",re);		
		}
	*/
	
	/*二叉树的深度问题。
	***给出一个二叉树求深度
	*/

	/*
	public static void main(String[] args){
	class TreeNode
		{
			int val;
			TreeNode left;
			TreeNode right;
			TreeNode(int i){ val = i; }
		}
		TreeNode t=new TreeNode(5);
		TreeNode r;
		r=new TreeNode(4);
		t.left=r;
		r=new TreeNode(7);
		r.left=r;
		System.out.println(maxDepth(t));

	}
	public static int maxDepth(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        else {
			return 1+Math.max(maxDepth(root.left),maxDepth(root.right));//遍历左子树和右子树
		}
	}
	*/

	/*变态跳台阶问题
	一只青蛙可以一次跳上一级、二级.....n级台阶，问跳上n级台阶有多少种跳法。
	***思路：F(n)=f(n-1)+...+f(2)+f(1)=2*f(n-1)=2^(n-1)
	*//*
	public static void main(String[] agrs){
		Date date=new Date();
		long t1,t2;
		Scanner key=new Scanner(System.in);
		int n=key.nextInt();
		t1=date.getTime();
		System.out.println(JumpFloorII(n));
		t2=date.getTime();
		System.out.println("用时："+(t2-t1)+"ms");
	}
	public static int JumpFloorII(int n){
		return (int)Math.pow(2,n-1);
		//return 1<<--n;???
	}
	*/

	/*数组复制问题。
	给定一个数组a[n],数组B[i]=a[0]*a[1]*...*a[i-1]*a[i+1]*a[n-1];不能使用除法。
	思路：每次计算B[i]时，先把a[i]和b[i]赋值为1即可。
	*//*
	public static int[] multiply(int A[]){
		int length=A.length;
		int[] b=new int[length];
        for(int i=0;i<length;i++){
			int t1=A[i];
			A[i]=b[i]=1;
			for(int j=0;j<length;j++){
				b[i]*=A[j];             
        }
//		System.out.print(b[i]+",");
		A[i]=t1;
        }
		return b;
	}
	*/

	
	/*累加问题。
	求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
	思路：
	*/
	/*
	public static int Sum_Solution(int n){
				int t=n;
				int a=1000;
			boolean  value=	(t!=0)&&(a==(t+=Sum_Solution(n-1)));
			return t;
	}
	*/


	/*用两个栈模拟队列
	思路：当栈1为空时直接进栈1，当栈1不为空时，先将栈1的元素移到栈2（从第一个元素开始执行，就可保证先出栈的元素比后出栈的先入栈）
	栈1为空后node入栈，再把栈2元素返回到栈1.
	*/
	/*
	Stack<Integer>stack1 = new Stack<Integer>
	Stack<Integer>stack2 = new Stack<Integer>
    public static void push(int node){
		if(!stack.empty()){
			do{
			  int temp=stack1.pop();
			  stack2.push(temp);
			}
			while(!stack1.empty());
			stack1.push(node);
		 do{
			 int temp=stack2.pop();
			 stack1.push(temp);
			}
		while(!stack2.empty());
		else
			stack1.push(node);
	  

		}
	public static int pop(){
		return stack1.pop();
	}
	*/

	/*一个整数的二进制数有多少个1
	思路：1.左移1，计数末尾几个1；2.n与n-1且运算，把末尾的1去掉（可跳过中间无用的零）去掉几次就有几个1.
	*//*
	public static int NumberOf1(int n) {

		int count=0;
			while(n!=0){
				 n=n&(n-1);
				count++;     
        }
        return count; 


		}
    */



	/*整数区间有多少个1的问题
	思路：
	*//*
	public static int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
       int i=1;
        for(i=1;i<=n;i*=10){
            int a = n/i;
            int b = n % i;
            count = count +(a+8)/10*i;
				if(a%10==1)
				count+=(b+1);
        }
        return count;
    }
	*/
	



}

enum Accounttype{//枚举类
	SAVING,FIXD,ARR;//每个静态变量都要初始化
	private Accounttype(){
		System.out.println("its a accounttype");
	}
}
	