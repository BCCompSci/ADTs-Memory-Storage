// file: Static.java
// author: Bob Muller
//
// CSCI 1102 Computer Science 2
//
// Code demonstrating how the attribute static and the variable this work in Java.
//
public class Static {
  
 int i;
 
 public Static(int i) {
   this.i = i;
 }
 
 public int f() { return this.i; }

  // The following function causes a compile error because
  // it has the static attribute, it cannot refer to this.
  //
  public static int g() { return this.i; }
 
 public static void main(String[] args) {
  
   Static s = new Static(343);
   
   System.out.format("We got %d!\n", s.f());
 }
}
