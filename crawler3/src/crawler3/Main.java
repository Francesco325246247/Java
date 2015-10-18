package crawler3;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Main {
	
    private static Scanner sc;

	private static void print(String msg, Object... args)  {
    
        System.out.println(String.format(msg, args));
        
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else
            return s;
    }

	public static void main(String[] args) throws IOException  {
		
		
		sc = new Scanner(System.in);
		System.out.println("Please type ther url to parse including http://\n");
		String url = sc.nextLine();
		
		 Document doc = Jsoup.connect(url).get();
		 
	        Elements links = doc.select("a[href]");
	        Elements media = doc.select("[src]");
	        Elements imports = doc.select("link[href]");
	        
	        print("\nLinks: (%d)", links.size());
	        for (Element link : links) {
	            print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
	        }
	        
	        
	            print("\nMedia: (%d)", media.size());
	            for (Element src : media) {
	                if (src.tagName().equals("img[src~=(?i)\\.(png|jpe?g|gif)]"))
	                    print(" * %s: <%s> %sx%s (%s)",
	                            src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
	                            trim(src.attr("alt"), 20));
	                
	                
	                else
	                    print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
	            }

	            
	            		print("\nImports: (%d)", imports.size());
	            		for (Element imports1 : imports) {
	            					print(" * %s <%s> (%s)", imports1.tagName(),imports1.attr("abs:href"), imports1.attr("rel"));
	            		}

	            
	         
	      
	   
	}
}



