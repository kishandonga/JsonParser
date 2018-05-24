# JsonParser
JsonParser is simple JSON parsing library, you can parse JSONObject or JSONArray using path and key. Simply you just need to pass the name of the object or object key and index number of the array item in your path.  

## Installation

This JsonParser JAR add in the `lib` folder then after set in build path. Download JAR form this link [JsonParser_DLab_1.1.jar](Release/JsonParser_DLab_1.1.jar&raw=true). For, the more information refer this [`JsonParser`](src/main/) sample project.  

## Path
Path is combination of the object key and index number of the array item.  

`Dpath=[menu/items/12/label]`    

here, `menu`  `items` `label` is your object key and 12 is array item index number now, the question arises how to parse using this path so let's little talk on it. When you give path to the library, it is converted path to token then after, first check is JSONObject or JSONArray if object then token must have key value(if not found then it is throwing exception and process break) then after this process recursively doing till your path's all token finished, once token finished then process break and return the result in the Object format.  

> Note : Array index is starting from the 1 so, your array first item index is 1.

### Example:

You can refer more example [here](src/main/JsonParserTest.java), 

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

## Key
Key is a unique element of the object so, duplication of the key is not allowed in the object but whole JSONObject or JSONArray may be have same name key.

`Dkey=[value]`    

here, `value` is your key and more then one time if it exists in the whole object then during this recursively process, if key found then notify the user on `onValueFound(String key, Object value)`.

### Example:

You can refer more example [here](src/main/JsonParserTest.java), 

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
		System.out.println(String.valueOf("Find By Key : " + value));
	}
	
}).inFind(GetJson.strJson_4, "Dkey=[value]");

// Output :- 
// Find By Key : New
// Find By Key : Open
// Find By Key : Close
```

***

### End User

* QA Engineer, Developer and who not like to do manually parsing of the JSONObject and JSONArray.
* How I get the idea to develope this type of library, when I am helping to the one of the my QA friend in his automation process that time, I observed that he man facing trouble on the parsing of the JSONObject then I decided to develop this type of library, which have structure as like selenium Xpath.


### Current issues

* Integer key value of object's is not supported
* Only JSONObject or JSONArray as string passing in the arguments
* multiple path is not supported
* array of key or array or path not supported as arguments
* always need listener as a notifier

### Contributing

Contributions are welcome! If you find a bug please report it and if you want add new feature then please suggest to me. If you want to contribute code please file an issue and create a branch off of the current dev branch and file a pull request.

### About me

Kishan Donga ([@ikishan92](https://twitter.com/ikishan92))  

### License

`JsonParser` is released under the [Apache License 2.0](LICENSE).