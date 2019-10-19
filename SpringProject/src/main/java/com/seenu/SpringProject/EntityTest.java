package com.seenu.SpringProject;

public class EntityTest {
public static void main(String[] args) {
	DaoTestEntity doTest = new DaoTestEntity();
	
	doTest = testEntityReslt(doTest);
	int a = 0;
	String b = "seenu";
	testVariableEntity(a,b);
	System.out.println(doTest.getA());
	System.out.println(doTest.getB());
	System.out.println(a);
	System.out.println(b);
}

private static void testVariableEntity(int a, String b) {
	//variables not updated..  So that need to create entity
	a=1;
	b="chandran";
}

private static DaoTestEntity testEntityReslt(DaoTestEntity doTest) {
	
	doTest.setA("testEntity");
	doTest.setB("testEntity1");
	
	return doTest;
}

}
