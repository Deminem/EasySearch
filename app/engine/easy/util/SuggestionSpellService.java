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

import org.apache.lucene.search.spell.PlainTextDictionary;
import org.apache.lucene.search.spell.SpellChecker;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.RAMDirectory;

public class SuggestionSpellService {

	public static String[] suggestionTerms (String query) {
	
		
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		
		File dir = new File(AppConstants.DICTIONARY_INDEX_PATH);
		
		Directory directory = FSDirectory.open(dir);
		
		SpellChecker spellChecker = new SpellChecker(new RAMDirectory());
		
		spellChecker.indexDictionary(new PlainTextDictionary(new File(AppConstants.DICTIONARY_PATH)));
		
		String wordForSuggestions = "hee";
		
		int suggestionsNumber = 3;

		String[] suggestions = spellChecker.suggestSimilar(wordForSuggestions, suggestionsNumber);

		if (suggestions!=null && suggestions.length>0) {
			for (String word : suggestions) {
				System.out.println("Did you mean:" + word);
			}
		}
		else {
			System.out.println("No suggestions found for word:"+wordForSuggestions);
		}
	}
}
