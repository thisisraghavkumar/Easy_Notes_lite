package encrypt;


public class BCipher extends Encryption {
    
    public String getCode(String inp){
        String code = "";
        char m,c;
        for(int i=0;i<inp.length();i++){
            m = inp.charAt(i);
            if((m>='A'&&m<'Z')||(m>='a'&&m<'z')){
                c = (char)(m+1);
            }else if(m=='Z'){
                c = 'A';
            }else if(m=='z'){
                c = 'a';
            }else{
                c = m;
            }
            code+=c;
        }
        return code;
    }
    public String getMessage(String code){
        char m,c;
        String message = "";
        for(int i=0;i<code.length();i++){
            c = code.charAt(i);
            if((c>'A'&&c<='Z')||(c>'a'&&c<='z')){
                m = (char)(c-1);
            }else if(c=='A'){
                m = 'Z';
            }else if(c=='a'){
                m = 'z';
            }else{
                m = c;
            }
            message+=m;
        }
        return message;
    }
}
