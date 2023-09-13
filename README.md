# JsonParser
JsonParser is a simple JSON parsing library, that parses JSONObject or JSONArray using path and key. Simply you just need to pass the key of the object and if it is an array then index number in your path.  

## Installation

Add JsonParser JAR in the `lib` folder then set in the build path. Download JAR from this link [JsonParser_DLab_1.1.jar](Release/JsonParser_DLab_1.1.jar). For, more information refer to this [`JsonParser`](src/main/) sample project.  

## Path
The path is a combination of the object key and index number of the array item.  

`Dpath=[menu/items/12/label]`    

here, `menu`  `items` `label` is your object key and 12 is the array item index number, When you give a path to the library, it is converted path to a token then after, first check is JSONObject or JSONArray if object then token must have key value(if not found then it is throwing exception and process break) then after this process recursively doing till your path's all token finished, once token finished then process break and return the result in the Object format.  

> Note: Here, the array index starts from 1 so, in the above example 12 is the 12<sup>th</sup> element of the array.

### Example:

Please refer this example [here](src/main/JsonParserTest.java), 

```json
{"menu": {
    "header": "SVG Viewer",
    "items": [
        {"id": "Open"},
        {"id": "OpenNew", "label": "Open New"},
        null,
        {"id": "ZoomIn", "label": "Zoom In"},
        {"id": "ZoomOut", "label": "Zoom Out"},
        {"id": "OriginalView", "label": "Original View"},
        null,
        {"id": "Quality"},
        {"id": "Pause"},
        {"id": "Mute"},
        null,
        {"id": "Find", "label": "Find..."}
    ]
}}
```

```java
new JsonParser().addObserver(new OnValueObserver() {
	@Override
	public void onValueFound(String key, Object value) {
		System.out.println(String.valueOf("Find By Path: " + value.toString()));
	}
	
}).inFind(GetJson.strJson_3, "Dpath=[menu/items/12/label]"); 

// Output:- Find By Path: Find...
```

## Key
The key is a unique element of the object so, duplication of the key is not allowed in the object but the whole JSONObject or JSONArray may have the same name key more than one time.

`Dkey=[value]`    

here, `value` is your key, and more than once if it exists in the whole object then during this recursive process notify the user on `onValueFound(String key, Object value)` method.

### Example:

Please this example [here](src/main/JsonParserTest.java), 

```json
{"menu": {
  "id": "file",
  "value": "File",
  "popup": {
    "menuitem": [
      {"value": "New", "onclick": "CreateNewDoc()"},
      {"value": "Open", "onclick": "OpenDoc()"},
      {"value": "Close", "onclick": "CloseDoc()"}
    ]
  }
}}
```

```java
new JsonParser().addObserver(new OnValueObserver() {
	@Override
	public void onValueFound(String key, Object value) {
		System.out.println(String.valueOf("Find By Key: " + value));
	}
	
}).inFind(GetJson.strJson_4, "Dkey=[value]");

// Output :- 
// Find By Key: New
// Find By Key: Open
// Find By Key: Close
```

***

### End User

* QA Engineer, developer, who does not like manual parsing of the JSONObject and JSONArray.
* How did I get the idea to develop this type of library? When I was helping one of my QA friends in his automation process at that time, I observed that he was facing trouble in parsing, and I decided to develop this type of library, which has a structure like selenium Xpath.


### Current issues

* The integer key value of objects is not supported
* Only JSONObject or JSONArray as string passing in the arguments
* Multiple path is not supported
* array of key or array or path not supported as arguments
* Always need listener as a notifier

### Change Log

Refer to this file for the library version information [here](ChangeLog),

### Contributing

Contributions are welcome! If you find any bug please report it if you want to contribute code please raise PR.

### About me

I'm Kishan Donga! Connect with me via the below handles, I am a developer and I love to create innovations.

LinkedIn [@ikd96](https://www.linkedin.com/in/ikd96/) 
Email [kishandonga.92@gmail.com](mailto:kishandonga.92@gmail.com)
Twitter [@ikishan96](https://twitter.com/ikishan96) 
Instagram [@ikishan96](https://www.instagram.com/ikishan96/)  

### License

`JsonParser` is released under the [Apache License 2.0](LICENSE).
