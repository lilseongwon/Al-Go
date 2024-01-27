import java.util.*;
class SNum implements Comparable<SNum> {
    String val;

    public SNum(String val) {
        this.val = val;
    }

    @Override
    public int compareTo(SNum o) {
        if(val.length() != o.val.length()) return o.val.length() - val.length();
        else if(getNumSum() != o.getNumSum()) return o.getNumSum() - getNumSum();
        else {
            for(int i = 0; i < val.length(); i++) {
                if(val.charAt(i) != o.val.charAt(i)) return o.val.charAt(i) - val.charAt(i);
            }
        }
        return 0;
    }

    public int getNumSum() {
        int sum = 0;
        for(char v : val.toCharArray()) {
            if(Character.isDigit(v)) sum+=Character.getNumericValue(v);
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        SNum[] sNums = new SNum[n];
        for(int i = 0; i < n; i++) {
            sNums[i] = new SNum(kb.next());
        }
        Arrays.sort(sNums, Comparator.reverseOrder());
        for(int i = 0; i < n; i++) {
            System.out.println(sNums[i].val);
        }
    }
}