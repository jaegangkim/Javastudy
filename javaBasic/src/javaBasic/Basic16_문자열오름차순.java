package javaBasic;

import java.util.Arrays;

public class Basic16_문자열오름차순 {

	public static void main(String[] args) {
		
		String s = "사과#바나나#오렌지#포도#귤";
		//#을 기준으로 문자열을 분리한 후 오름차순 정렬
		String[] sp = s.split("#");
		//선택정렬
		for(int i=0;i<sp.length-1;i++) {
			for(int j=i+1;j<sp.length;j++) {
				if(sp[i].compareTo(sp[j])>0) {
					String temp = sp[i];
					sp[i]=sp[j];
					sp[j]=temp;
				}
			}System.out.println(sp[i]);
		}
		System.out.println(sp[sp.length-1]);

	}

}
