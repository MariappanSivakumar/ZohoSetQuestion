
package set2;

public class ExpressionValidate {
    
    public boolean isOperator(char c){
        return c=='+' || c=='*' || c=='-' || c=='/';
    }
    
    public boolean isAlpha(char c){
        return c>='a' && c<='z' || c>='A' && c<'Z';
    }
    
    public boolean isValid(String expression){
        
        int brace = 0;
        
        for(int i=0;i<expression.length();i++){
            
            char c = expression.charAt(i);
            
            brace = c=='(' ? brace+1 : ( c==')' ? brace-1 : brace );
            
            if(isOperator(c)){
                if(!isAlpha(expression.charAt(i-1)) || !isAlpha(expression.charAt(i+1))){
                    return false;
                } 
            } 
        }
        
        return brace==0;
    }
    public void init(){
        String expression[] = {"(a+b)(a*b)","(ab)(ab)","((a+b)"};
        
        for( String snipet : expression ){
            System.out.println(isValid(snipet));
        }
    }
    public static void main(String art[]){
        new ExpressionValidate().init();
    }
}
