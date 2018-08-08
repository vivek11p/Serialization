package com.javageeks;

import java.io.IOException;

public class InheritanceSerializationTest {

	public static void main(String[] args) {
		String fileName = "subclass.ser";
		
		SubClass subClass = new SubClass();
		subClass.setId(10);
		subClass.setValue("Data");
		subClass.setName("Vivek");
		
		try {
			SerializationUtil.serialize(subClass, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		try {
			SubClass subNew = (SubClass) SerializationUtil.deserialize(fileName);
			System.out.println("SubClass read = "+subNew);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}