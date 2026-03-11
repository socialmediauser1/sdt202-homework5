import java.util.ArrayList;
import java.util.Scanner;

public class Shell
{
    private static final int[] increments = { 1093, 364, 121, 40, 13, 4, 1 };

    public static void sort(Comparable[] a)
    {
        int N = a.length;

        for (int k = 0; k < increments.length; k++)
        {
            int h = increments[k];

            if (h >= N) continue;

            for (int i = h; i < N; i++)
            {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
                    exch(a, j, j-h);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w)
    {  return v.compareTo(w) < 0;  }

    private static void exch(Comparable[] a, int i, int j)
    {  Comparable t = a[i]; a[i] = a[j]; a[j] = t;  }

    private static void show(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        while (scanner.hasNext())
            values.add(scanner.next());
        String[] a = values.toArray(new String[0]);
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
