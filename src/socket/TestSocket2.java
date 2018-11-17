package socket;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class TestSocket2 {
 
    public static void main(String[] args) throws IOException {
 
        Process p = Runtime.getRuntime().exec("ping " + "7.0.151.149");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
                sb.append(line + "\r\n");
        }
       
        System.out.println("本次指令返回的消息是：");
        String ss=sb.toString();
        
        System.out.println(ss);
        
    }
 
}