package com.example.project;

public class Fibonacci {
  // instance variable
  private int[] sequence;


  public Fibonacci(int seqLen) {
      sequence = new int[seqLen];
      sequence[0] = 0;
      sequence[1] = 1;


      for (int i = 2; i < seqLen; i++) {
          sequence[i] = sequence[i - 1] + sequence[i - 2];
      }
  }


  public int[] getSequence() {
      return sequence;
  }


  /** Returns the index in the array where a particular value, searchVal, is
      located in sequence; if not found, returns -1.  If searchVal == 1, return
      first index where 1 is found (since this value appears twice in Fibonacci
      sequences longer than 2 numbers)
   */
  public int getIndexOf(int searchVal) {
      for (int i = 0; i < sequence.length; i++) {
          if (sequence[i] == searchVal) {
              return i;
          }
      }
      return -1;
  }


  /** Assigns sequence to a new array that extends the current sequence by
      howManyMore numbers of the Fibonacci sequence
*/
  public void extendBy(int howManyMore) {
      int currentLength = sequence.length;
      int[] newSequence = new int[currentLength + howManyMore];
     
      for (int i = 0; i < currentLength; i++) {
          newSequence[i] = sequence[i];
      }


      for (int i = currentLength; i < newSequence.length; i++) {
          newSequence[i] = newSequence[i - 1] + newSequence[i - 2];
      }


      sequence = newSequence;
  }


  /** Returns a string that represents the sequence array nicely formatted, for
   *  example, if sequence == [2, 3, 7], this method should return the String
   *  "[2, 3, 7]"
   *  USE THE ARRAYPRINTER UTILITY CLASS IN YOUR SOLUTION TO THIS METHOD
   */
  public String fibonacciString() {
      return ArrayPrinter.printableString(sequence);
  }
}


