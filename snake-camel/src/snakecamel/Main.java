package snakecamel;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class Main {
	public static void main(String[] args) {	 
		
		SnakeCamelUtil util = new SnakeCamelUtil();
		
		//capitalize()
		String actual1 = util.capitalize("");
		System.out.println("��" + actual1 + "(expected:)");	
		String actual2 = util.capitalize("a");
		System.out.println("a��" + actual2 + "(expected:A)");		
		String actual3 = util.capitalize("xyz");
		System.out.println("xyz��" + actual3 + "(expected:Xyz)");
		
		//uncapitalize()
		String actual4 = util.uncapitalize("");
		System.out.println("��" + actual4 + "(expected:)");		
		String actual5 = util.uncapitalize("A");
		System.out.println("A��" + actual5 + "(expected:a)");		
		String actual6 = util.uncapitalize("Xyz");
		System.out.println("Xyz��" + actual6 + "(expected:xyz)");
		
		//snakeToCamelcase()
		String actual7 = util.snakeToCamelcase("abc");
		System.out.println("abc��" + actual7 + "(expected:Abc)");	
		String actual8 = util.snakeToCamelcase("abc_def");
		System.out.println("abc_def��" + actual8 + "(expected:AbcDef)");	
		String actual9 = util.snakeToCamelcase("abc_def_gh");
		System.out.println("abc_def_gh��" + actual9 + "(expected:AbcDefGh)");	
		String actual10 = util.snakeToCamelcase("abc__def__gh");
		System.out.println("abc__def__gh��" + actual10 + "(expected:AbcDefGh)");		
		String actual11 = util.snakeToCamelcase("_abc_def__");
		System.out.println("_abc_def__��" + actual11 + "(expected:AbcDef)");
		
		//camelToSnakecase()
		String actual12 = util.camelToSnakecase("Abc");
		System.out.println("Abc��" + actual12 + "(expected:abc)");	
		String actual13 = util.camelToSnakecase("AbcDef");
		System.out.println("AbcDef��" + actual13 + "(expected:abc_def)");		
		String actual14 = util.camelToSnakecase("AbcDefGh");
		System.out.println("AbcDefGh��" + actual14 + "(expected:abc_def_gh)");
	}	
}		
