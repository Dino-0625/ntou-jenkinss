/**/

package gradeconverterr;

/**Some  javadoc.
*/
public class App {
  /**Something javadoc.
   */
  public static void main(String[] args) {
    System.out.println("Hello world");
    GradeConverter g = new GradeConverter();
    for (int i = 0; i < 102; i++) {
        System.out.println(g.convert(i));
    }
  }
}
