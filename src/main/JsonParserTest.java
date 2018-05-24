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
				System.out.println(String.valueOf("Find By Key : " + value));
			}
			
		}).inFind(GetJson.strJson_4, "Dkey=[value]");
		
		// Output :- 
		// Find By Key : New
		// Find By Key : Open
		// Find By Key : Close
		
		new JsonParser().addObserver(new OnValueObserver() {
			@Override
			public void onValueFound(String key, Object value) {
				System.out.println(String.valueOf("Find By Path : " + value.toString()));
			}
			
		}).inFind(GetJson.strJson_3, "Dpath=[menu/items/12/label]"); 
		
		// Output :- Find By Path : Find...
			
		new JsonParser().addObserver(new OnValueObserver() {
			@Override
			public void onValueFound(String key, Object value) {
				System.out.println(String.valueOf("Find By Path : " + value.toString()));
			}
			
		}).inFind(GetJson.strJson_2, "Dpath=[No/1]"); 
		
		// Output :- Find By Path : 1
		
		new JsonParser().addObserver(new OnValueObserver() {
			@Override
			public void onValueFound(String key, Object value) {
				
				new JsonParser().addObserver(new OnValueObserver() {
					@Override
					public void onValueFound(String key, Object value) {
						System.out.println(String.valueOf("Find By Path : " + value.toString()));
					}
					
				}).inFind(value.toString(), "Dpath=[medicationsClasses/1/className/1/associatedDrug/1/name]"); 
			}
			
		}).inFind(GetJson.strJson_1, "Dpath=[problems/1/Diabetes/1/medications/1/]"); 
		
		// Output :- Find By Path : asprin
		
		new JsonParser().addObserver(new OnValueObserver() {
			@Override
			public void onValueFound(String key, Object value) {
				System.out.println(String.valueOf("Find By Key : " + value));
			}
			
		}).inFind(GetJson.strJson_1, "Dkey=[name]");
		
		// Output :- 
		// Find By Key : asprin
		// Find By Key : somethingElse
		// Find By Key : asprin
		// Find By Key : somethingElse
	}
}
