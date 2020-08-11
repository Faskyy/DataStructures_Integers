public class Whitelist {
   public static void main(String[] args) {
      // read the whitelist into an int array
     //In in = new In("tinyW.txt");

      // uncomment line 8 and comment out line 4 when you
      // are ready to read the large whitelist (1 million ints)
       In in = new In("https://gist.githubusercontent.com/david-dobor/a97af6e62ddd2a3af6104989721553d5/raw/fea635101c2d19ee9f219503555e6371c1ca4b2c/largeW.txt");

      int[] a = in.readAllInts();

      SetOfInts set = new SetOfInts(a); // <- make use of SetOfInts

      // read also the data that needs to be filtered
      //in = new In("tinyT.txt");

      // uncomment line 19 and comment out line 15 when you
      // are ready to read the large largeT.txt (1.5 million ints)
      in = new In("https://gist.githubusercontent.com/david-dobor/577146096ce1c9e087bb27f329e95f8c/raw/32bc6ce6cd6bae9965b83869a81c79e588486e0d/largeT.txt");

      int[] t = in.readAllInts();

      // finally, whitelisting is done by relying on SetOfInts ADT
      for (int key : t) {
         if (!set.contains(key))
            System.out.println(key);
      }
   }
}
