import java.util.*;


public class cc{
	public static void main(String[] args){
		System.out.println(Accounttype.FIXD);
		
	}
	/*ħ�������⡣
	����1��Ͷ��x������2x+1��
	����2��Ͷ��x������2x+2��
	Ҫ�õ�n����Ͷ����
	***˼·������1ֻ�ܲ�������������2ֻ�ܲ���ż������n����ż����
	*/
	/*
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
         //System.out.println(1);
		 StringBuffer result = new StringBuffer();//����ַ���
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

	/*�ַ�����Ƭ�������⡣
	����ͬСд��ĸ����һ����Ƭ������s="aaabbaaac"����Ƭƽ������Ϊ��3+2+3+1��/4=2.25
	***˼·��ÿ����Ƭ�ĳ�����ʵ���ü��������ӵĺͻ����ַ����ĳ��ȣ�����ֻҪ�ڱȽ���ͬ��ĸʱ����������ĸ����Ƭ����������
	*/
	/*
	public static void main(String[] args){
			Scanner key = new Scanner(System.in);
			StringBuffer str=new StringBuffer();
			 String s=key.next();
			 char[] ch=s.toCharArray();//ת�浽�ַ�����
			//��ʼ�Ƚ�ƥ��
			int p=0;//�����±�
			int count=1;//��Ƭ����
			double len=(double)ch.length;//���鳤�ȼ��ַ�������
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
	
	/*��������������⡣
	***����һ�������������
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
			return 1+Math.max(maxDepth(root.left),maxDepth(root.right));//������������������
		}
	}
	*/

	/*��̬��̨������
	һֻ���ܿ���һ������һ��������.....n��̨�ף�������n��̨���ж�����������
	***˼·��F(n)=f(n-1)+...+f(2)+f(1)=2*f(n-1)=2^(n-1)
	*//*
	public static void main(String[] agrs){
		Date date=new Date();
		long t1,t2;
		Scanner key=new Scanner(System.in);
		int n=key.nextInt();
		t1=date.getTime();
		System.out.println(JumpFloorII(n));
		t2=date.getTime();
		System.out.println("��ʱ��"+(t2-t1)+"ms");
	}
	public static int JumpFloorII(int n){
		return (int)Math.pow(2,n-1);
		//return 1<<--n;???
	}
	*/

	/*���鸴�����⡣
	����һ������a[n],����B[i]=a[0]*a[1]*...*a[i-1]*a[i+1]*a[n-1];����ʹ�ó�����
	˼·��ÿ�μ���B[i]ʱ���Ȱ�a[i]��b[i]��ֵΪ1���ɡ�
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

	
	/*�ۼ����⡣
	��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
	˼·��
	*/
	/*
	public static int Sum_Solution(int n){
				int t=n;
				int a=1000;
			boolean  value=	(t!=0)&&(a==(t+=Sum_Solution(n-1)));
			return t;
	}
	*/


	/*������ջģ�����
	˼·����ջ1Ϊ��ʱֱ�ӽ�ջ1����ջ1��Ϊ��ʱ���Ƚ�ջ1��Ԫ���Ƶ�ջ2���ӵ�һ��Ԫ�ؿ�ʼִ�У��Ϳɱ�֤�ȳ�ջ��Ԫ�رȺ��ջ������ջ��
	ջ1Ϊ�պ�node��ջ���ٰ�ջ2Ԫ�ط��ص�ջ1.
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

	/*һ�������Ķ��������ж��ٸ�1
	˼·��1.����1������ĩβ����1��2.n��n-1�����㣬��ĩβ��1ȥ�����������м����õ��㣩ȥ�����ξ��м���1.
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



	/*���������ж��ٸ�1������
	˼·��
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

enum Accounttype{//ö����
	SAVING,FIXD,ARR;//ÿ����̬������Ҫ��ʼ��
	private Accounttype(){
		System.out.println("its a accounttype");
	}
}
	