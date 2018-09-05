public class P006_Convert{
    public String convert(String s, int numRows) {
        if(s.length() <= 0 || numRows <= 1 )     return s;
        int m = numRows + numRows - 2;
        int n = (s.length() % m == 0 ) ? s.length() / m : s.length() / m  + 1;
        String[] retArr = new String[numRows];
        for (int i = 0; i < numRows; i++){
            retArr[i] = "";
        }
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int currIndex = i * m  + j;
                if (currIndex >= s.length() ) break;
                if (j < numRows)    retArr[j] += s.charAt(currIndex);
                else                retArr[numRows + numRows - j - 2] += s.charAt(currIndex);
            }
        }
        String ret = "";
        for(int i = 0; i < numRows; i++){
            ret += retArr[i];
        }
        return ret;    
    }
}