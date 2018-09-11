public class P008_MyAtoi{
    public int myAtoi(String str) {
        String vaild = "";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                vaild += str.charAt(i);
            } else if (vaild.length() ==0  && str.charAt(i) == 32){
            } else if ((str.charAt(i) == '+' || str.charAt(i) == '-' ) && vaild.length() == 0){
                vaild += str.charAt(i);
            } else break;
        }
        long retVal = 0;
        int flag = 0;
        for(int i = 0; i < vaild.length(); i++){
            if (i == 0 && (vaild.charAt(0) == '+' || vaild.charAt(0) == '-')){
                if (vaild.charAt(0) == '-')  flag = 1;
            } else  retVal = retVal * 10 + (vaild.charAt(i) - '0');
            if (retVal > (long) Integer.MAX_VALUE + 1 )  break;
        }
        retVal = (flag == 0) ? retVal : 0 - retVal;
        if (retVal > 0x7fffffff )  return 0x7fffffff;
        if (retVal < - 0x80000000) return 0x80000000  ;
        return (int) retVal;
    }
}