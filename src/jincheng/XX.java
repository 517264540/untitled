package jincheng;

import java.util.*;

public class XX {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> syncList = Collections.synchronizedList(list);

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> synMap = Collections.synchronizedMap(map);
    }
}
