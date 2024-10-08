import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ExpressionEvaluator {

	public static int evaluateExpression(String expression){
	    
	    // BEZ KORISTENJE NA STACK
// 		 int res = 0;

//         String [] add = expression.split("\\+");

//         for (String s : add) {
//             String[] mult = s.split("\\*");
//             int m = 1;

//             for (String string : mult) {
//                 m *= Integer.parseInt(string);
//             }

//             res += m;
//         }

//         return res;


//SO KORISTENJE NA STACK
int res = 0;
        Stack<Integer> stack = new Stack<>();

        String [] add = expression.split("\\+");

        for (String s : add) {
            String[] mult = s.split("\\*");
            int m = 1;

            for (String string : mult) {
                m *= Integer.parseInt(string);
            }

            stack.add(m);
        }

        while(!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;

	}
	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(evaluateExpression(input.readLine()));
	}

}