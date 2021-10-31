

import java.util.ArrayList;
import java.util.Iterator;

public class collect {

	public static void main(String[] args) {
		collect wordcomboObject= new collect();
		wordcomboObject.printAllWords();
		
	}
	//Method is used to read the word letter by letter to find the words and also
	//reverse the words to find the different combinations etc.
	public void printAllWords() {
		String strWord = "WORKING" ;
		
		ArrayList<String> list= new ArrayList<String> ();
		ArrayList<String> words= new ArrayList<String> ();
		ArrayList<String> reversewords= new ArrayList<String> ();
		words.add("WORK");
		words.add("KING");
		words.add("KIN");
	    words.add("NIK");
		words.add("ROW");
		for(int i =0;i<strWord.length();i++) {
			for (int j=i+1;j<=strWord.length();j++) {
				list.add(strWord.substring(i, j));
				StringBuilder sb= new StringBuilder(strWord.substring(i, j));
				String reverseWord = (sb.reverse()).toString();
				reversewords.add(reverseWord);
			}
 		}
         checkWords(words,list);
         checkWords(words,reversewords);
		
	}
	//method is used to find the given word in the generated words. 
	public void checkWords(ArrayList<String> words,ArrayList<String> list) {

		Iterator<String> it= list.iterator();
		while(it.hasNext()) {
			String obj = it.next();
			if(words.contains(obj)) {
		       System.out.println("list of words from a given string ***  "+obj);
			}
		}
	}
}
	
 