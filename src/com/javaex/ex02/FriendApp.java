package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	List<Friend> rList =new ArrayList<Friend>();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요");
    	for (int i = 0; i <3; i++) {
               String frd = sc.nextLine();
    		
    		
    		String[] fArray = frd.split(" ");
    		
    		//문자열 배열의 방 순서대로 Friend형의 frd변수에 값 할당
    		Friend frd1 = new Friend(fArray[0], fArray[1], fArray[2]);
    		
    		//리스트에 추가
    		rList.add(frd1);
			
		}

    	for (int i = 0; i < rList.size(); i++) {
			rList.get(i).info();
		}
    	
    }

}
