
package encrypt;


abstract public class Encryption {
    private String key;
    final public String getKey(){
        return key;
    }
    final public void setKey(String k){
        key = k;
    }
    abstract public String getCode(String inp);
    abstract public String getMessage(String code);
}
