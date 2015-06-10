/**
 * This is expected to generate a runtime error because A.methodTwo(Integer) doesn't
 * exist when B.methodShouldBeMissing() tries to call it. We should be able to detect that.
 */
public class LibraryInvokesRemovedMethod {

  public static void main(String[] args) {
    MethodWillBeRemoved methodWillBeRemoved = new MethodWillBeRemoved();
    methodWillBeRemoved.butIWillStay();

    B.doThings(methodWillBeRemoved);
  }
}
