/* This file is generated by TestGenerator, any edits will be overwritten by the next generation. */
package org.antlr.v4.test.runtime.javascript.node;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class TestParseTrees extends BaseTest {

	/* This file and method are generated by TestGenerator, any edits will be overwritten by the next generation. */
	@Test
	public void testRuleRef() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(145);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@init {\n");
		grammarBuilder.append("this.buildParseTrees = true;\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("console.log($r.ctx.toStringTree(null, this));\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : b 'x'\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("b : 'y' \n");
		grammarBuilder.append("  ;");
		String grammar = grammarBuilder.toString();
		String input ="yx";
		String found = execParser("T.g4", grammar, "TParser", "TLexer",
		                          "TListener", "TVisitor",
		                          "s", input, false);
		assertEquals("(a (b y) x)\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* This file and method are generated by TestGenerator, any edits will be overwritten by the next generation. */
	@Test
	public void testSync() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(152);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@init {\n");
		grammarBuilder.append("this.buildParseTrees = true;\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("console.log($r.ctx.toStringTree(null, this));\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : 'x' 'y'* '!'\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("Z : 'z' \n");
		grammarBuilder.append("  ;");
		String grammar = grammarBuilder.toString();
		String input ="xzyy!";
		String found = execParser("T.g4", grammar, "TParser", "TLexer",
		                          "TListener", "TVisitor",
		                          "s", input, false);
		assertEquals("(a x z y y !)\n", found);

		assertEquals("line 1:1 extraneous input 'z' expecting {'y', '!'}\n", this.stderrDuringParse);

	}
	/* This file and method are generated by TestGenerator, any edits will be overwritten by the next generation. */
	@Test
	public void test2Alts() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(136);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@init {\n");
		grammarBuilder.append("this.buildParseTrees = true;\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("console.log($r.ctx.toStringTree(null, this));\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : 'x' | 'y'\n");
		grammarBuilder.append("  ;");
		String grammar = grammarBuilder.toString();
		String input ="y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer",
		                          "TListener", "TVisitor",
		                          "s", input, false);
		assertEquals("(a y)\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* This file and method are generated by TestGenerator, any edits will be overwritten by the next generation. */
	@Test
	public void testToken2() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(134);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@init {\n");
		grammarBuilder.append("this.buildParseTrees = true;\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("console.log($r.ctx.toStringTree(null, this));\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : 'x' 'y'\n");
		grammarBuilder.append("  ;");
		String grammar = grammarBuilder.toString();
		String input ="xy";
		String found = execParser("T.g4", grammar, "TParser", "TLexer",
		                          "TListener", "TVisitor",
		                          "s", input, false);
		assertEquals("(a x y)\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* This file and method are generated by TestGenerator, any edits will be overwritten by the next generation. */
	@Test
	public void testNoViableAlt() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(151);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@init {\n");
		grammarBuilder.append("this.buildParseTrees = true;\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("console.log($r.ctx.toStringTree(null, this));\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : 'x' | 'y'\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("Z : 'z' \n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append(" ");
		String grammar = grammarBuilder.toString();
		String input ="z";
		String found = execParser("T.g4", grammar, "TParser", "TLexer",
		                          "TListener", "TVisitor",
		                          "s", input, false);
		assertEquals("(a z)\n", found);

		assertEquals("line 1:0 mismatched input 'z' expecting {'x', 'y'}\n", this.stderrDuringParse);

	}
	/* This file and method are generated by TestGenerator, any edits will be overwritten by the next generation. */
	@Test
	public void testTokenAndRuleContextString() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(205);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@init {\n");
		grammarBuilder.append("this.buildParseTrees = true;\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("console.log($r.ctx.toStringTree(null, this));\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : 'x' { \n");
		grammarBuilder.append("console.log(antlr4.Utils.arrayToString(this.getRuleInvocationStack()));\n");
		grammarBuilder.append("} ;");
		String grammar = grammarBuilder.toString();
		String input ="x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer",
		                          "TListener", "TVisitor",
		                          "s", input, false);
		assertEquals(
			"[a, s]\n" +
			"(a x)\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* This file and method are generated by TestGenerator, any edits will be overwritten by the next generation. */
	@Test
	public void testExtraToken() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(149);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@init {\n");
		grammarBuilder.append("this.buildParseTrees = true;\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("console.log($r.ctx.toStringTree(null, this));\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : 'x' 'y'\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("Z : 'z' \n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append(" ");
		String grammar = grammarBuilder.toString();
		String input ="xzy";
		String found = execParser("T.g4", grammar, "TParser", "TLexer",
		                          "TListener", "TVisitor",
		                          "s", input, false);
		assertEquals("(a x z y)\n", found);

		assertEquals("line 1:1 extraneous input 'z' expecting 'y'\n", this.stderrDuringParse);

	}
	/* This file and method are generated by TestGenerator, any edits will be overwritten by the next generation. */
	@Test
	public void test2AltLoop() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(143);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@init {\n");
		grammarBuilder.append("this.buildParseTrees = true;\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("console.log($r.ctx.toStringTree(null, this));\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : ('x' | 'y')* 'z'\n");
		grammarBuilder.append("  ;");
		String grammar = grammarBuilder.toString();
		String input ="xyyxyxz";
		String found = execParser("T.g4", grammar, "TParser", "TLexer",
		                          "TListener", "TVisitor",
		                          "s", input, false);
		assertEquals("(a x y y x y x z)\n", found);
		assertNull(this.stderrDuringParse);

	}

}