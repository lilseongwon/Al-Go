import java.util.*;

class Value implements Comparable<Value> {
    String str;
    int dis;

    @Override
    public int compareTo(Value o) {
        if(this.dis != o.dis) {
            return o.dis - this.dis;
        }
        else {
            for(int i = 0; i < str.length(); i++) {
                if(o.str.charAt(i) != this.str.charAt(i)) {
                    return o.str.charAt(i) - this.str.charAt(i);
                }
            }
        }
        return 1;
    }

    public Value(String str, int dis) {
        this.str = str;
        this.dis = dis;
    }
}

class ArrCount {
    int d1;
    int d2;

    public ArrCount(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

public class Main {
    static String d1 = "qwertyuiop";
    static String d2 = "asdfghjkl";
    static String d3 = "zxcvbnm";
    public static void main(String[] args) {
        HashMap<Character, ArrCount> map = new HashMap<>();
        for(int i = 0; i < d1.length(); i++) {
            map.put(d1.charAt(i), new ArrCount(0, i));
        }
        for(int i = 0; i < d2.length(); i++) {
            map.put(d2.charAt(i), new ArrCount(1, i));
        }
        for(int i = 0; i < d3.length(); i++) {
            map.put(d3.charAt(i), new ArrCount(2, i));
        }


        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        for(int i = 0; i < count; i++) {
            String val = kb.next();
            int loop = kb.nextInt();
            Value[] values = new Value[loop];
            for(int j = 0; j < loop; j++) {
                int result = 0;
                String comVal = kb.next();
                for(int k = 0; k < comVal.length(); k++) {
                    ArrCount valDis = map.get(val.charAt(k));
                    ArrCount comValDis = map.get(comVal.charAt(k));
                    result += Math.abs(valDis.d1 - comValDis.d1) + Math.abs(valDis.d2 - comValDis.d2);
                }
                values[j] = new Value(comVal, result);
            }
            Arrays.sort(values, Comparator.reverseOrder());
            for(Value v : values) {
                System.out.println(v.str + " " + v.dis);
            }
        }
    }
}