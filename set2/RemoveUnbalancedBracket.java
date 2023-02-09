package set2;

public class RemoveUnbalancedBracket {

    public boolean isNotBrace(char c) {
        return c != '(' && c != ')';
    }

    public void init() {
        char expression[] = "ab))))))()()()()()(".toCharArray();

        for (int i = 0; i < expression.length; i++) {

            if (expression[i] == '(') {
                int freq = 1;
                for (int j = i + 1; j < expression.length; j++) {
                    if (isNotBrace(expression[j])) {
                        continue;
                    }
                    freq = expression[j] == '(' ? freq + 1 : (expression[j] == ')' ? freq - 1 : freq);
                    if (freq == 0) {
                        i = j;
                        break;
                    }
                }
                expression[i] = freq != 0 ? ' ' : expression[i];
            }
        }

        for (int i = expression.length - 1; i >= 0; i--) {
            if (expression[i] == ')') {
                int freq = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (isNotBrace(expression[j])) {
                        continue;
                    }
                    freq = expression[j] == ')' ? freq + 1 : (expression[j] == '(' ? freq - 1 : freq);
                    if (freq == 0) {
                        i = j;
                        break;
                    }
                }
                expression[i] = freq != 0 ? ' ' : expression[i];
            }
        }

        System.out.println(new String(expression));
    }

    public static void main(String art[]) {
        new RemoveUnbalancedBracket().init();
    }
}
