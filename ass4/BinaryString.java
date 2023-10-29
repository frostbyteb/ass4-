public class BinaryString {
    public String binStr ="0";
    BinaryString(String binStr){
        setValue(binStr);
    }
    public void setValue(String binStr) {
        boolean is01 = true;
        for (int i=0;i<binStr.length();i++){
            if (binStr.charAt(i) != '0' && binStr.charAt(i) != '1') {
                is01 = false;
                break;
            }
        }
        if(is01)
            this.binStr = binStr;
        else {
            System.out.println("Wrong format!!!");
        }
    }
}
