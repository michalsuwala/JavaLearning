import java.lang.Math;
public class StringSplit {
    public static String[] solution(String s) {
        System.out.println(s);
        int len = (int)Math.ceil((float)s.length() / 2);
        String[] res = new String[len];
        for(int i = 0, j = 0; i < 2 * len; i += 2, j++){
            String temp = "";
            temp += s.charAt(i);
            if(i == s.length() - 1){
                temp += '_';
            }
            else{
                temp += s.charAt(i + 1);
            }
            res[j] = temp;
        }
        return res;
    }
}