/* 
  This demonstrates a variable. 
  Call this file Example2.java
 */
class Example2 {
  public static void main(String args[]) {
    int var1; // this declares a variable of type integer
    int var2; // this declares another integer variable
    /* the two variables could be also declared in one line like this: 
     * int var1, var2;
     */
    var1 = 1025;
    System.out.println("var1 contains " + var1);

    var2 = var1 / 2;

    System.out.print("var 2 contains var1 / 2: ");
    System.out.println(var2);
  }
}
