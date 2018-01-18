package encrypt;
public class CeaserShiftCipher extends Encryption {

    public CeaserShiftCipher(char K){
       super.setKey(String.valueOf(K));
    }
    @Override
    public String getCode(String inp) {
        String code="";
        char c,m;
        for(int i=0;i<inp.length();i++){
            m = inp.charAt(i);
            c = (char)(m-super.getKey().charAt(0));
            code+=c;
        }
        return code;
    }

    @Override
    public String getMessage(String code) {
        char c,m;
        String message = "";
        for(int i=0;i<code.length();i++){
            c = code.charAt(i);
            m = (char)(c+super.getKey().charAt(0));
            message+=m;
        }
        return message;
    }
    
}
