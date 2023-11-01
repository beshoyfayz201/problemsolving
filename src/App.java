// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// public class App {
//     public static void main(String[] args)throws IOException {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
//     System.out.println(2* Integer.parseInt(br.readLine())+
//     (3* Integer.parseInt(br.readLine())+Integer.parseInt(br.readLine())));
//     }
// }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class App {
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    PrintWriter out = new PrintWriter(System.out);  
    int x=Integer.parseInt(br.readLine());
    int n=Integer.parseInt(br.readLine());
    int t=Integer.parseInt(br.readLine()); 
    out.println((x*(-n+t))) ;
        out.flush();
    out.close();
    }
}