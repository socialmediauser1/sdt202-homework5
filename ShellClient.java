public class ShellClient
{
    public static void main(String[] args)
    {
        String[] a = {
            "S", "H", "E", "L", "L", "S", "O", "R", "T", "R", "O", "C", "K", "S"
        };

        StdOut.println("Before sorting:");
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();

        Shell.sort(a);

        StdOut.println("After sorting:");
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();

        StdOut.println("isSorted = " + Shell.isSorted(a));
    }
}