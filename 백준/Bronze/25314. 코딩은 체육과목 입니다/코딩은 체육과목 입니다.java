import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int num = N/4;
        StringBuffer sb = new StringBuffer("");
        
        
        for(int i = 0; i < num ; i++ ){
            sb.append("long ");
        }

        sb.append("int");
        
        System.out.println(sb);
    }
}