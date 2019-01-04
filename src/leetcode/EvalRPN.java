/**
 *
 Evaluate the value of an arithmetic expression in Reverse Polish Notation.

 Valid operators are+,-,*,/. Each operand may be an integer or another expression.

 Some examples:

 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
package leetcode;

import java.util.Stack;

public class EvalRPN {

    public int evalRPN(String[] tokens) {
        int i = 0;
        for (i=0; i<tokens.length; i++){
            if(tokens[i] == "+"){
                int num2=i-1;
                int num1=i-2;
                while (tokens[num1]==""){
                    num1--;
                }
                tokens[i] = String.valueOf(Integer.valueOf(tokens[num1])+Integer.valueOf(tokens[num2]));
                tokens[num1] = "";
                tokens[num2] = "";
            }
            if(tokens[i] == "-"){
                int num2=i-1;
                int num1=i-2;
                while (tokens[num1]==""){
                    num1--;
                }
                tokens[i] = String.valueOf(Integer.valueOf(tokens[num1])-Integer.valueOf(tokens[num2]));
                tokens[num1] = "";
                tokens[num2] = "";
            }
            if(tokens[i] == "*"){
                int num2=i-1;
                int num1=i-2;
                while (tokens[num1]==""){
                    num1--;
                }
                tokens[i] = String.valueOf(Integer.valueOf(tokens[num1])*Integer.valueOf(tokens[num2]));
                tokens[num1] = "";
                tokens[num2] = "";
            }
            if(tokens[i] == "/"){
                int num2=i-1;
                int num1=i-2;
                while (tokens[num1]==""){
                    num1--;
                }
                tokens[i] = String.valueOf(Integer.valueOf(tokens[num1])/Integer.valueOf(tokens[num2]));
                tokens[num1] = "";
                tokens[num2] = "";
            }
        }

        return Integer.valueOf(tokens[i-1]);
    }

    public int evalRPN2(String[] tokens){
        Stack<Integer > number = new Stack<Integer>();
        for (String str:tokens) {
            if (str.equals("+")){
                int num2 = Integer.valueOf(number.pop());
                int num1 = Integer.valueOf(number.pop());
                number.push(num1 + num2);
            } else if (str.equals("-")){
                int num2 = Integer.valueOf(number.pop());
                int num1 = Integer.valueOf(number.pop());
                number.push(num1 - num2);
            } else if (str.equals("*")){
                int num2 = Integer.valueOf(number.pop());
                int num1 = Integer.valueOf(number.pop());
                number.push(num1 * num2);
            } else if (str.equals("/")){
                int num2 = Integer.valueOf(number.pop());
                int num1 = Integer.valueOf(number.pop());
                number.push(num1 / num2);
            } else {
                number.push(Integer.valueOf(str));
            }
        }
        return number.pop();
    }

    public static void main(String[] args) {
        String[] str = {"2", "1", "+", "3", "*"};
        String[] str2 = {"4", "13", "5", "/", "+"};
        String[] str3 = {"0","3","/"};
        System.out.println(new EvalRPN().evalRPN2(str3));
    }
}
