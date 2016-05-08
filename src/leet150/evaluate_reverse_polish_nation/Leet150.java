package leet150.evaluate_reverse_polish_nation;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/5/8.
 */
public class Leet150 {

    public static void main(String[] args) {
        Leet150 l = new Leet150();

        String[] tokens = {"0", "3", "/"};
        int result = l.evalRPN(tokens);

        System.out.println(result);


    }


    public int evalRPN(String[] tokens) {
        if (tokens == null) return 0;
        LinkedList<Integer> stack = new LinkedList<>();
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    num1 = stack.removeLast();
                    num2 = stack.removeLast();
                    stack.add(num2 + num1);
                    break;
                case "-":
                    num1 = stack.removeLast();
                    num2 = stack.removeLast();
                    stack.add(num2 - num1);
                    break;
                case "*":
                    num1 = stack.removeLast();
                    num2 = stack.removeLast();
                    stack.add(num2 * num1);
                    break;
                case "/":
                    num1 = stack.removeLast();
                    num2 = stack.removeLast();
                    stack.add(num2 / num1);
                    break;
                default:
                    stack.add(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        return stack.removeFirst();
    }
}
