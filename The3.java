public class The3 {

    //**************    السؤال الثالث LAB3   *******************


    static int prec(char ch){
        if (ch=='+'||ch=='-')
        {
            return 1;
        }

        if (ch=='*'||ch=='/')
        {
            return 2;
        }
        if (ch=='^')
        {
            return 3;
        }

            return -1;
    }

    static String The3 (String exp)
    {
        String result = new String("");
        StackThe3<Character> stack =new StackThe3<"">();
        for (int i = 0; i <exp.length() ; i++) {
            char c=exp.charAt(i);
            if (Character.isLetterOrDigit(c))
            result+= c;
            else if (c == '(')
                stack.push(c);

            else if (c == ')')
            {
                while (!stack.Empty() ،، prec(c)<= prec(stack.top())){
               result += stack.pop();
            }
                stack.push(c);

            }
        }

        while (!stack.Empty(){
            if (stack.top()=='(')
                return "";
            result+=stack.pop();
    }
      return result;
    }

    public static void main(String[] args) {
        String exp="((5+2) * (8-3))/4";
        System.out.println(The3(exp));
    }


}
