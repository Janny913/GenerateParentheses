import java.util.LinkedList;
import java.util.List;


/**
 * Created by jianiyang on 16/7/11.
 */
public class GenerateParentheses {
    public static List<String> generateParentheses(int n) {
        List<String> res = new LinkedList<String>();
        if (n <= 0)
            return res;
        helper(n, n, new String(), res);
        return res;
    }

    public static void helper(int l, int r, String str , List<String> res){
        if(r < l) return;
        if(l == 0 && r == 0) res.add(str);
        if(l > 0) helper(l-1, r, str + '(', res);
        if(r > 0) helper(l, r-1, str + ')', res);
    }

    public static void main(String[] args){
        List<String> result = generateParentheses(3);
        for(String res : result){
            System.out.println(res);
        }

    }
}
