import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Document doc = Jsoup.connect("http://jsoup.org/cookbook/extracting-data/attributes-text-html").get();
		String title = doc.title();
		System.out.println("Title: "+title+"\n");
	
		Elements urls = doc.select("a");
		
		for(Element url : urls){
			
			System.out.println(url.text());
		}
		
		
		

	}

}
