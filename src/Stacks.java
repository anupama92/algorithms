import java.util.NoSuchElementException;

/**
 * Created by arao10 on 1/23/18.
 */
public class Stacks {

        protected int array[];
        protected int top, size, len;
        /*  Constructor for arrayStack */

    public Stacks(int n)
        {
            size = n;
            len = 0;
            array = new int[size];
            top = -1;
        }
        /*  Function to check if stack is empty */
        public boolean isEmpty()
        {
            return top == -1;
        }
        /*  Function to check if stack is full */

        /*  Function to add an element to the stack */
        public void push(int i)
        {
            if(top + 1 >= size)
                throw new IndexOutOfBoundsException("Overflow Exception");
            if(top + 1 < size )
                array[++top] = i;
            len++ ;
        }
        /*  Function to delete an element from the stack */
        public int pop()
        {
            if( isEmpty() )
                throw new NoSuchElementException("Underflow Exception");
            len-- ;
            return array[top--];
        }
        /*  Function to display the status of the stack */
        public void print()
        {
            System.out.print("\nStack = ");
            if (len == 0)
            {
                System.out.print("Empty\n");
                return ;
            }
            for (int i = top; i >= 0; i--)
                System.out.print(array[i]+" ");
            System.out.println();
        }
    }
