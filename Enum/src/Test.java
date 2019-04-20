import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by run on 2017/8/19.
 */
public class Test {

    public static void main(String[] args) {
        String[] arr = {"ab", "ba", "bb", "ac"};
        Map map = jointStr(arr);
        System.out.println(map);

    }

    private static Map jointStr (String[] arr) {
        Map map = new HashMap();
        Set<String> set = new HashSet<String>();

        // 数组的首字母放入Set集合中， 去重复首字母
        for (String element : arr) {
            set.add(element.charAt(0) + "");
        }
        /*
        遍历集合中的每个首字母， 去和数组中的每个元素的首字母进行比较
        相同，加入集合中
         */
        for (String s : set) {
            String jointStr = "";
            for (String e : arr) {
                if (e.startsWith(s)) {
                    map.put(s, jointStr += e);
                }
            }
        }
        return map;
    }
}
