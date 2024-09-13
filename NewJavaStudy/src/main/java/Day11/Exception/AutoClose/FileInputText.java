package Day11.Exception.AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputText {
    public static void main(String[] args) {

        FileInputStream fis = null;
        InputStreamReader isr = null;

        // test.txt 파일을 입력할 수 있도록 연결
        try {
            fis = new FileInputStream("test.txt");
            isr = new InputStreamReader(fis, "UTF-8"); // 한글 출력  // * UnsupportedEncodingException : 정해져 있는 인코딩타입에 맞춰 입력
            int read = 0;

            while((read = isr.read()) != -1) { // * IOException
                System.out.print((char) read);
            }
        }catch (FileNotFoundException e) {
            // FileNotFoundException : 파일이 존재하지 않았을 때 발생하는 예외
            e.printStackTrace();
            System.err.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            // IOException : 입력 및 출력 과정에서 발생하는 예외
            e.printStackTrace();
            System.err.println("입출력 관련 예외 발생.");
        }
        finally {
            if(fis != null) {
                try {
                    fis.close();            // close() : 메모리 해제
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
