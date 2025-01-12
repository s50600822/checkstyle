/*
NoLineWrap
tokens = CLASS_DEF, METHOD_DEF, CTOR_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace.nolinewrap;

// xdoc section -- start
import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import static java.math.BigInteger.ZERO;

class // violation 'should not be line-wrapped'
  Example5 {

  public Example5() {
  }

  public static void // violation 'should not be line-wrapped'
    doSomething() {
  }

  class Bar {

    public // violation 'should not be line-wrapped'
      Bar() {
    }

    public void fun() {
    }
  }
}
// xdoc section -- end
