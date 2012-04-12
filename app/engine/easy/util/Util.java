/*Copyright 2011 Deminem Solutions

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under 
the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
either express or implied. See the License for the specific language governing permissions and limitations 
under the License.
*/
package engine.easy.util;

import java.io.File;

public class Util {

	public static String getPath(String path) {
		return null;
	}

	public static String getFileExtension(File file) {
		if (file != null && file.isFile()) {
			Filename fileName = new Util.Filename(file.getPath(), '/', '.');
			return fileName.extension();
		}
		
		return "";
	}
	
	static class Filename {
		private String fullPath;
		private char pathSeparator, extensionSeparator;

		public Filename(String str, char sep, char ext) {
			fullPath = str;
			pathSeparator = sep;
			extensionSeparator = ext;
		}

		public String extension() {
			int dot = fullPath.lastIndexOf(extensionSeparator);
			return fullPath.substring(dot + 1);
		}

		public String filename() { // gets filename without extension
			int dot = fullPath.lastIndexOf(extensionSeparator);
			int sep = fullPath.lastIndexOf(pathSeparator);
			return fullPath.substring(sep + 1, dot);
		}

		public String path() {
			int sep = fullPath.lastIndexOf(pathSeparator);
			return fullPath.substring(0, sep);
		}
	}
}
