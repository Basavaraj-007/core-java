package com.xworkz.novel;

import com.xworkz.novel.dto.NovelDTO;

public class NovelTester {
public static void main(String[] args){
		
		NovelDTO novel = new NovelDTO();
		
		novel.setNovelName("Yaana");
		novel.setPrice(200.00);
		novel.setAuthor("S L Bhairappa");
		novel.setPages(218);
		novel.setPublisher("Sahitya Bhandar");
		System.out.println(novel.getNovelName()+" "+novel.getPrice()+" "+novel.getAuthor()+" "+novel.getPages()+" "+novel.getPublisher());
		
	}

}
