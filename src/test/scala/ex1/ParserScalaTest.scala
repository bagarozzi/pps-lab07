package ex1

import org.scalatest.matchers.should.Matchers.*

class ParserScalaTest extends org.scalatest.funsuite.AnyFunSuite:

  test("Testing the basic parser"):
    def parser = new BasicParser(Set('a', 'b', 'c'))
    parser.parseAll("aabc".toList) shouldBe true
    parser.parseAll("aabcdc".toList) shouldBe false
    parser.parseAll("".toList) shouldBe true

    def emptyParser = new NonEmptyParser(Set('0', '1'))
    emptyParser.parseAll("0101".toList) shouldBe true
    emptyParser.parseAll("0123".toList) shouldBe true
    emptyParser.parseAll(List()) shouldBe true
