package set7;

import java.util.LinkedList;

public class EvaluvateExpression {

    public boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c=='%';
    }

    public int sum(int n1, int n2, char oper) {
        switch (oper) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
        }
        return 0;
    }

    public void init() {
        
        String expression = "1000*20+23+100*100/23+8764/238%";

        LinkedList<Character> oper = new LinkedList();
        LinkedList<Integer> value = new LinkedList();

        String temp = "";
        for (int i = 0; i < expression.length(); i++) {
            if (isOperator(expression.charAt(i))) {
                oper.add(expression.charAt(i));
                value.add(Integer.parseInt(temp));
                temp = "";
            } else {
                temp += expression.charAt(i);
            }
        }

        char operator[] = {'/', '*', '+', '-'};
        for (char c : operator) {
            while(oper.contains(c)) {
                for(int i=0;i<oper.size();i++){
                    if(oper.get(i) == c){
                        int n1 = value.remove(i);
                        int n2 = value.remove(i);
                        value.add(i, sum(n1,n2,c));
                        oper.remove(i);
                        break;
                    }
                }
                if(oper.size()==1)break;
            }
        }
        
        System.out.println("ANSWER : "+value);
    }

    public static void main(String art[]) {
        new EvaluvateExpression().init();
    }
}
