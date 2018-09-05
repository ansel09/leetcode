public class P007_Reverse{
    public int reverse(int x) {
        long a = x, b = 0;
        while (a != 0){
            b = b * 10 + (a % 10);
            if (b > Integer.MAX_VALUE || b < Integer.MIN_VALUE) return 0;
            a /= 10;
        }
        return (int) b;        
    }
}