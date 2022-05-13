package gradeconverterr;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Nothing
 */


public class GradeConverterTest {

  /**Nothing
   */
  private GradeConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new GradeConverter();
  }

  @Test
  public void testConvert1() {
    String expected = "A";
    String actual = converter.convert(100);
    assertEquals(expected, actual);
  }

  @Test
  public void testConvert2() {
    String expected = "A";
    String actual = converter.convert(90);
    assertEquals(expected, actual);
  }
}