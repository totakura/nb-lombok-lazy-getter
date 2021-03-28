/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package nb.lombok.lazy.getter;

import lombok.Getter;

public class App {

  @Getter(lazy = true)
  private final String greeting = initGreeting();

  public String initGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}