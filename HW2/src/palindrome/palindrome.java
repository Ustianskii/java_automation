package palindrome;

import java.util.ArrayList;

public class palindrome {
    public static boolean palindrome(int x)
    {
        if (x < 0)
            x *= -1;

        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (x > 0) {
            digits.add(x % 10);
            x /= 10;
        }

        for (int i = 0, j = digits.size()-1; i < j; i++, j--) {
            if (digits.get(i) != digits.get(j))
                return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(palindrome(121));
        System.out.println(palindrome(102));
        System.out.println(palindrome(33233));
    }
}
