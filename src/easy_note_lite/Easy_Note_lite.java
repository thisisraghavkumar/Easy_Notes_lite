package easy_note_lite;
import java.io.*;
import encrypt.*;
public class Easy_Note_lite {

    
    public static void main(String[] args) {
        File f = new File("/F/password.txt");
        String password;
        try{
        if(!(f.exists())){
            f.createNewFile();
            FileWriter pipe = new FileWriter(f);
            password = "123456789";
            pipe.write(password);
            pipe.close();
        }else{
            BCipher enc = new BCipher();
            FileReader pipe = new FileReader(f);
            String s = "";
            int c = pipe.read();
            while(c!=-1){
                s = s+ (char)c;
                //System.out.println(s);
                c = pipe.read();
            }
            password = enc.getMessage(s);
            pipe.close();
        }
        }catch(Exception ex){
            System.out.println("Exception in class Easy_Note_lite");
            return;
        }
        //System.out.println("Starting gui:"+password);
        new Main(password);
    }
    
}
