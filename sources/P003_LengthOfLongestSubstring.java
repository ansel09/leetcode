public class P003_LengthOfLongestSubstring{
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        HashMap<String, Integer> m = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            String curr = String.valueOf(s.charAt(i));
            Integer oldIndex = m.put(curr, i);
            if (oldIndex != null && oldIndex != i) {
                for (int j = i - m.size(); j < oldIndex; j++) { // 重复时，从HashMap中清除oldIndex所示位置之前的value
                    String del = String.valueOf(s.charAt(j));
                    m.remove(del, j); 
                }
            }
            if (m.size() > maxLen) maxLen = m.size(); // 更新所保持的最大长度值
        }
        return maxLen;        
    }    
}