package sqrt;
import java.lang.Math;

class sqrt
{
    static int nSqrt(int x)
    {
        if(x <= 1)
            return x;
        return (int)Math.floor(Math.sqrt(x));
    }
    public static void main(String args[])
    {
        int x = 9;
        System.out.println(nSqrt(x));
    }
}