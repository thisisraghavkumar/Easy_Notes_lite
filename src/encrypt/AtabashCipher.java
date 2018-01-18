package encrypt;


public class AtabashCipher extends Encryption {
    
    @Override
    public String getCode(String inp) {
        String code="";
        char c,m;
        for(int i=0;i<inp.length();i++){
            m = inp.charAt(i);
            if(m>='A'&&m<='Z'){
                c = (char)('Z'-(char)(m-'A'));
            }else if(m>='a' && m<='z'){
                c = (char)('z'-(char)(m-'a'));
            }else{
                c = (char)(m-'/');
            }
            code+=c;
        }
        return code;
    }

    @Override
    public String getMessage(String code) {
        String message = "";
        char c,m;
        for(int i=0;i<code.length();i++){
            c = code.charAt(i);
            if(c>='A'&&c<='Z'){
                m = (char)('A'+(char)('Z'-c));
            }else if(c>='a' && c<='z'){
                m = (char)('a'+(char)('z'-c));
            }else{
                m = (char)(c+'/');
            }
            message+=m;
        }
        return message;
    }
        
}
