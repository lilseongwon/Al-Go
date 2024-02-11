import java.util.*;

class Time implements Comparable<Time> {
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end != o.end) {
            return this.end - o.end;
        } else {
            return this.start - o.start;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int answer = 0;
        Time[] times = new Time[n];
        for (int i = 0; i < n; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            times[i] = new Time(start, end);
        }
        Arrays.sort(times);
        int end = times[0].end;
        answer++;
        for (int i = 1; i < n; i++) {
            if (times[i].start >= end) {
                answer++;
                end = times[i].end;
            }
        }
        System.out.println(answer);
    }
}