//{ Driver Code Starts
import java.util.*;

class TwoStack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			twoStacks g = new twoStacks();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a);
					else if(stack_no ==2)
					 g.push2(a);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1()+" ");
					else if(stack_no==2)
					System.out.print(g.pop2()+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}


// } Driver Code Ends



class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    Stack<Integer>st;
    Stack<Integer>st2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
        st=new Stack<>();
        st2=new Stack<>();
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
     st.push(x);
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       st2.push(x);
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        int ans=-1;
        if(st.size()>0){
            ans=st.peek();
            st.pop();
        }
        return ans;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        int ans=-1;
        if(st2.size()>0){
            ans=st2.peek();
            st2.pop();
        }
        return ans;
    }
}

