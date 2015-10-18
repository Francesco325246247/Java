package com.francesco.pagecollector;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PageCollector {

	public static void main(String[] args) {
		
		try {
			Document doc = Jsoup.connect("http://www.jsoup.org/").get();
			Elements links = doc.select("a");
			
			for(Element element: links){
				
				System.out.println(element.attr("abs:href"));
			}
			
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
