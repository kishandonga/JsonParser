package main;

import dlab.JsonParser;
import dlab.JsonParser.OnValueObserver;

/**
 * Created by Kishan Donga on 18-05-18
 */

public class JsonParserTest {

	public static void main(String[] args) {
		
		new JsonParser().addObserver(new OnValueObserver() {
			@Override
			public void onValueFound(String key, Object value) {
				System.out.println(String.valueOf("Find By Path : " + value));
			}
			
		}).inFind(GetJson.strJson_2, "Dpath=[cars/car1]"); 
		
		new JsonParser().addObserver(new OnValueObserver() {
			@Override
			public void onValueFound(String key, Object value) {
				System.out.println(String.valueOf("Find By Path : " + value));
			}
			
		}).inFind(GetJson.strJson_1, "Dpath=[problems/0/Diabetes/0/medications/0/medicationsClasses/0/className/0/associatedDrug/0/name]"); 
		
		new JsonParser().addObserver(new OnValueObserver() {
			@Override
			public void onValueFound(String key, Object value) {
				System.out.println(String.valueOf("Find By Key : " + value));
			}
			
		}).inFind(GetJson.strJson_1, "Dkey=[name]");
	}
}
