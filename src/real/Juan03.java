package real;

/**
 *
 现有字符串char[] text，实现函数char[] drawChar(char[] text)，找出text中重复出现最多的字符，然后将该字符移到text的最前端，
 生成一个新的字符串。 假设重复出现最多的字符只有一个。请充分考虑内存和性能效率。 举例： “abcaba”，转换后成为“aaabcb”。
 输入描述:
 输入原始的字符串，如 "abcaba"

 输出描述:
 输入处理后的字符串，如 "aaabcb"

 输入例子1:
 abcaba

 输出例子1:
 aaabcb
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class Juan03{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        char[] text = in.nextLine().toCharArray();
//        char[] text = "abcaba".toCharArray();
        if (text.length <= 1){
            System.out.println(text);
            return;
        }
        int[] time = new int[256];
        for (int i=0; i<text.length; i++){
            time[text[i]] += 1;
        }

        Map map = new HashMap();
        for (int i=0; i<time.length; i++){
            if (time[i] != 0){
                map.put(time[i],i);
            }
        }

        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);
        Object maxkey = keys[keys.length-1];
        Object index = map.get(maxkey);

        StringBuffer sb = new StringBuffer();
        if ((int)maxkey != 1){
            char maxvalue = (char)(int)index;

            for (int i=0; i<(int)maxkey ;i++){
                sb.append(maxvalue);
            }
            for (int i=0; i<text.length; i++){
                if (maxvalue != text[i]){
                    sb.append(text[i]);
                }
            }
        } else {
            for (int i=0; i<text.length; i++){
                sb.append(text[i]);
            }
        }

        System.out.println(sb.toString());
    }
}
