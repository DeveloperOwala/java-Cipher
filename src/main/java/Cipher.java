public class Cipher {
    private String statement;
    private int key;

    public Cipher(String statement, int key) {
        this.statement = statement;
        this.key = key;
    }

    public String getStatement() {
        return this.statement;
    }

    public int getKey() {
        return this.key;
    }

    public String isEncrypted() {
        statement = "b";
        return statement;
    }

    public static  String encrypt( Cipher cipher) {
        if (cipher.key> 26) {
            cipher.key = cipher.key % 26;
        }
        else if(cipher.key < 0) {
            cipher.key = (cipher.key % 26) + 26;
        }

        String outputString = "";
        int length = cipher.statement.length();
        for (int i = 0; i < length ; i++) {
            char cc = cipher.statement.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char) (cc + cipher.key);
                    if(c<'a'){
                        outputString += (char)(cc + (26-cipher.key));
                    }
                    else {
                        outputString += c;
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc+cipher.key);
                    if(c<'A'){
                        outputString += (char)(cc + (26-cipher.key));
                    }
                    else {
                        outputString += c;
                    }
                }
            }
            else{
                outputString += cc;
            }
        }
        return outputString;
    }
    public static  String decrypt (Cipher cipher){
        if(cipher.key >26) {
            cipher.key = cipher.key % 26;
        }
        else if(cipher.key < 0){
            cipher.key = (cipher.key % 26) + 26;

        }
        String outputString = "";
        int length = cipher.statement.length();
        for (int i = 0; i < length; i++){
            char cc = cipher.statement.charAt(i);
            if (Character.isLetter(cc)){
                if (Character.isLowerCase(cc)){
                    char c = (char)(cc - cipher.key);
                    if (c>'z'){
                        outputString += (char)(cc + (26-cipher.key));
                    }

                    else {
                        outputString += c;

                    }
                }

                else if (Character.isUpperCase(cc)){
                    char c = (char)(cc - cipher.key);
                    if (c>'Z'){
                        outputString += (char)(cc + (26-cipher.key));
                    }

                    else {
                        outputString += c;

                    }
                }


            }
            else {
                outputString += cc;
            }
        }
        return outputString;

    }
}
