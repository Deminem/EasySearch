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
package engine.easy.search;

public class Result {

	Integer id; // the lucene's internal id
	String docId;
	double score; // BM25 score
	String higlightedText;	//document text;
	
	public Result(Integer id, String docId, double score, String text) {
		super();
		this.id = id;
		this.docId = docId;
		this.score = score;
		this.higlightedText = text;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", docId=" + docId + ", score=" + score
				+ ", higlightedText=" + higlightedText + "]";
	}


}
