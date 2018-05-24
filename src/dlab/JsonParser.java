package dlab;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * Created by Kishan Donga on 18-05-18
 */

public class JsonParser {
	
	private OnValueObserver listener;
	private String path;
	
	public void inFind(String jsonString, String dElements) {
		try
		{
			if(dElements != null && !dElements.isEmpty()){
				if(dElements.contains("Dpath")){
					path = dElements.substring(7, dElements.length() - 1);
					String token[] = path.split("/");
					inFindByPath(jsonString, token);
				
				} else if(dElements.contains("Dkey")) {
					String key = dElements.substring(6, dElements.length() - 1);
					Object tokener = getJSONTokener(jsonString);
					
					if(isJSONObject(tokener)){
						inFind(new JSONObject(jsonString), key);
					}
					
					if(isJSONArray(tokener)) {
						inFind(new JSONArray(jsonString), key);
					}
				} else {
					throw new Exception("Invalid Key or Path");
				}
			} else {
				throw new Exception("Key or Path can't null or empty!");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void inFindByPath(String jsonString, String[] token) throws JSONException{
		Object object = null;
		
		Object tokener = getJSONTokener(jsonString);
		
		if(isJSONObject(tokener)){
			object = new JSONObject(jsonString);
		}
		
		if(isJSONArray(tokener)) {
			object = new JSONArray(jsonString);
		}
		
		for(String vt : token){
			if(isInt(vt)){
				object = inFindByPath((JSONArray)object, (Integer.parseInt(vt) - 1));
			}else{
				object = inFindByPath((JSONObject)object, vt);
			}
		}
		
		listener.onValueFound(path, object);
	}
	
	private Object inFindByPath(JSONObject object, String value) throws JSONException{
		return object.get(value);
	}
	
	private Object inFindByPath(JSONArray array, int value) throws JSONException{
		return array.get(value);
	}
	
	@SuppressWarnings("rawtypes")
	private void inFind(JSONObject object, String key) throws JSONException {
		Iterator iterator = getObjectKeys(object);
		while (iterator.hasNext()) {
			String k = (String) iterator.next();
            if(key.equals(k)){
            	listener.onValueFound(key, object.get(k));
            } else {
            	Object type = object.get(k);
            	if(type instanceof JSONObject){
            		inFind((JSONObject)type, key);
            	}
            	else if(type instanceof JSONArray){
            		inFind((JSONArray)type, key);
            	}
            }
        }
	}
	
	public boolean isInt(String value){
		try{
			Integer.parseInt(value);
			return true;
		} catch(Exception e){
			return false;
		}
	}
	
    public void inFind(JSONArray array, String key) throws JSONException {
		int count = array.length();
		for(int i = 0; i < count; i++){
			Object type = array.get(i);
			if(type instanceof JSONObject){
        		inFind((JSONObject)type, key);
        	}
        	else if(type instanceof JSONArray){
        		inFind((JSONArray)type, key);
        	}
		}
	}
	
	public JsonParser addObserver(OnValueObserver lst){
		this.listener = lst;
		return this;
	}

	@SuppressWarnings("rawtypes")
	public Iterator getObjectKeys(JSONObject data) throws JSONException{
		return data.keys();
	}
	
	public boolean isJSONObject(String data) throws JSONException {
		Object json = new JSONTokener(data).nextValue();
		if (json instanceof JSONObject){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isJSONArray(String data) throws JSONException {
		Object json = new JSONTokener(data).nextValue(); 
		if (json instanceof JSONArray){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isJSONObject(Object object) throws JSONException {
		if (object instanceof JSONObject){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isJSONArray(Object object) throws JSONException {
		if (object instanceof JSONArray){
			return true;
		}else{
			return false;
		}
	}
	
	public Object getJSONTokener(String data) throws JSONException {
		return new JSONTokener(data).nextValue();
	}
	
	public interface OnValueObserver {
		void onValueFound(String key, Object object);
	}
}
