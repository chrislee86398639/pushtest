import java.io.*;

public class test {

    public static void main(String[] args) throws IOException {
        System.out.println("今天天气真好，适合去逛街，也适合晒太阳。");
        File file = new File("src/file.txt");
        BufferedReader f1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String s = new String();
        String s1 = "";
        while ((s = f1.readLine()) != null) {
            s1 += s;
        }
        System.out.println(s1);
        System.out.println("successful");

    }
}