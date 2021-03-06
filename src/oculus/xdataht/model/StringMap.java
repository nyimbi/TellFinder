/**
Copyright 2016 Uncharted Software Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package oculus.xdataht.model;

import java.util.HashMap;

public class StringMap {
	private HashMap<String,String> map;
	
	public StringMap() { }
	public StringMap(HashMap<String,String> map) { 
		setmap(map);
	}
	
	public void setmap(HashMap<String,String> map) { this.map = map; }
	public HashMap<String,String> getmap() { return map; }
	
	public void put(String key, String value) {
		if (map == null) {
			map = new HashMap<String,String>();
		}
		map.put(key, value);
	}

	public String get(String key) {
		if (map == null) {
			return null;
		} else {
			return map.get(key);
		}
	}
}
