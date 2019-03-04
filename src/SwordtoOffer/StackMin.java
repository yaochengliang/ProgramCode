package SwordtoOffer;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */

public class StackMin {
    Stack stack = new Stack();
    Stack stackmin = new Stack();


    public void push(int node) {
        stack.push(node);
        if (this.stackmin.size() > 0){
            stackmin.push(Math.min((int)stackmin.peek(),node));
        } else {
            stackmin.push(node);
        }
    }

    public void pop() {
        if (this.stack.size() > 0){
            int data = (int)this.stack.pop();
            int stackmin_pop = (int)this.stackmin.pop();
        }
    }

    public int top() {
        if (this.stack.size() > 0){
            return (int)this.stack.peek();
        }
        return 0;
    }

    public int min() {
        if (this.stack.size() > 0){
            return (int)this.stackmin.peek();
        }

        return 0;
    }

    public static void main(String[] args) {
        StackMin s = new StackMin();
        s.push(19);
        s.push(21);
        s.push(5);
        s.push(-1);

        System.out.println(s.min());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.min());
    }
}
