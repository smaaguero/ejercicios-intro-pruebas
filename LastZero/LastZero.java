public class LastZero
{

  /**
   * Find LAST index of zero
   *
   * @param x array to search
   * @return index of last 0 in x; -1 if absent
   * @throws NullPointerException if x is null
   */
   public static int lastZero (int[] x)
   {
      int posicion = -1;
      for (int i = 0; i < x.length; i++)
      {
         if (x[i] == 0)
         {
            posicion = i;
         }
      }
      return posicion;
   }
   
   public static void main (String []argv)
   {  // Driver method for lastZero
      // Read an array from standard input, call lastZero()
      int []inArr = new int [argv.length];
      if (argv.length == 0)
      {
         System.out.println ("Usage: java LastZero v1 [v2] [v3] ... ");
         return;
      }
   
      for (int i = 0; i< argv.length; i++)
      {
         try
         {
            inArr [i] = Integer.parseInt (argv[i]);
         }
         catch (NumberFormatException e)
         {
            System.out.println ("Entry must be a integer, using 1.");
            inArr [i] = 1;
         }
      }
   
      System.out.println ("The last index of zero is: " + lastZero (inArr));
   }
}
