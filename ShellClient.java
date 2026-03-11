public class ShellClient
{
    public static void main(String[] args)
    {
        String[] a = {
            "S", "H", "E", "L", "L", "S", "O", "R", "T", "R", "O", "C", "K", "S"
        };

        System.out.println("Before sorting:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        Shell.sort(a);

        System.out.println("After sorting:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        System.out.println("isSorted = " + Shell.isSorted(a));
    }
}
