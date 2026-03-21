import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while(true){
            String line = br.readLine();
            if(line == null) break;
            
            st = new StringTokenizer(line);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            System.out.println(A+B);
                    }
        
        
    }
}