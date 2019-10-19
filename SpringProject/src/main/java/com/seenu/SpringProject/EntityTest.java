package com.seenu.SpringProject;

public class EntityTest {
public static void main(String[] args) {
	DaoTestEntity doTest = new DaoTestEntity();
	
	doTest = testEntityReslt(doTest);
	System.out.println(doTest.getA());
	System.out.println(doTest.getB());
}

private static DaoTestEntity testEntityReslt(DaoTestEntity doTest) {
	
	doTest.setA("testEntity");
	doTest.setB("testEntity1");
	
	return doTest;
}

}
