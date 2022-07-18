package javaBasic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Basic26_Jsoup_html_예외처리 {

	public static void main(String[] args) {
		// Jsoup API (HTML parser) 
		String url ="https://sum.su.or.kr:8888/bible/today";
		
		// 잘못된 링크인 경우의 예외처리 해야 됨
		try {
			Document doc = Jsoup.connect(url).get();
			// System.out.println(doc.toString());
			Element bt= doc.select(".bible_text").first();
			System.out.println(bt.text());
			Element bb= doc.select(".bibleinfo_box").first();
			System.out.println(bb.text());
			
			Elements liList = doc.select(".body_list > li");
			for(Element li:liList) {
				String num=li.select(".num").first().text();
				String info=li.select(".info").first().text();
				System.out.println(num+" : "+info);
			}
		}catch(Exception e) {
			e.printStackTrace();  // 예외 메세지 출력
		}
		
	}

	
	
}
