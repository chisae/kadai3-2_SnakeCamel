package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void testcamelToSnakecase() {
		SnakeCamelUtil util = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = util.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
	@Test
	public void testSnakeToCamelcase() {
		SnakeCamelUtil util = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = util.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, is(expected));
	}
}