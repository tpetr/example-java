package com.semgrep;

import com.semgrep.Bar;

class Foo {
  public static int VALUE = 42;

  public void testMethod() {
    // bla
  }

  public static void main(String... args) {
    System.out.println("Foo value: " + Foo.VALUE);
    System.out.println("Var value: " + Bar.VALUE_PLUS_ONE);
  }
}
