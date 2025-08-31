import java.io.*;
import java.util.*;

public class Main {
    static boolean exists(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) >>> 1;
            if (arr[m] == x) return true;
            if (arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            // 입력이 한 줄에 다 안 올 수도 있으니 보강
            while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            out.append(exists(A, x) ? '1' : '0').append('\n');
        }

        System.out.print(out);
    }
}
