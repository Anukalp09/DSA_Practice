public class Main
{
    static int[] stack=new int[5];
    static int top=-1;
     static void push(int ele)
     {
         if(isFull()){
         System.out.println("stack is overFlow ");
         return ;
         }
     
     top++;
     stack[top]=ele;
     System.out.println("ele = "+ele);
     
     }
     static void pop()
     {
         if(isEmpty())
         {
             System.out.println("stack is underflow");
             return ;
         }
         
         int val=stack[top];
         top--;
         System.out.println("deleted element is "+val);
     }
     static boolean isEmpty()
     {
         return top==-1;
     }
     static boolean isFull()
     {
         return top==stack.length-1;
     }
     
     static void peek()
     {
         
         if(top==-1)
         {
             System.out.println("stack is underflow");
             return ;
         }
         System.out.println("peek element is "+ stack[top]);
     }

     // ---------- NEW METHOD ----------
     static void display()
     {
         if(isEmpty())
         {
             System.out.println("stack is empty");
             return ;
         }

         System.out.println("Stack elements (top to bottom):");
         for(int i=top;i>=0;i--)
         {
             System.out.println(stack[i]);
         }
     }
     // --------------------------------
     
     
	public static void main(String[] args) {
	    push(1);
	    push(2);
	    push(3);
	    peek();
	    display();          // shows 3 2 1
	    push(4);
	    push(5);
	    System.out.println(isFull());
	    push(6);
	    display();          // shows 5 4 3 2 1
	    pop();
	    pop();
	    pop();
	    pop();
	    peek();
	    display();          // shows 1
	    
		System.out.println(isFull());
	}
}
