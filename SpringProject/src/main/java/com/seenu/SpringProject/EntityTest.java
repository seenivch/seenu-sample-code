package com.seenu.SpringProject;

import java.util.ArrayList;
import java.util.List;

public class EntityTest {
public static void main(String[] args) {
	DaoTestEntity doTest = new DaoTestEntity();
	
	doTest = testEntityReslt(doTest);
	int a = 0;
	String b = "seenu";
	testVariableEntity(a,b);
	List<String> list = new ArrayList<String>();
	list.add("1");
	testList(list);
	System.out.println(doTest.getA());
	System.out.println(doTest.getB());
	System.out.println(a);
	System.out.println(b);
	System.out.println(list);
}

private static void testList(List<String> list) {
list.add("2");
}

private static void testVariableEntity(int a, String b) {
	a=1;
	b="chandran";
}

private static DaoTestEntity testEntityReslt(DaoTestEntity doTest) {
	
	doTest.setA("testEntity");
	doTest.setB("testEntity1");
	
	return doTest;
}

}
