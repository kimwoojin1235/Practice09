package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         List<Goods> gList = new ArrayList<Goods>();
         int sum = 0;
         
  	   System.out.println("상품을 입력해주세요(종료 q)");
         while(true){
      	   String input = sc.nextLine();
      	   if(input.equals("q")) {
      		   System.out.println("[입력완료]");
      		   System.out.println("=========================");
      		   break;
      	   }
      	   
      	   String[] inputs = input.split(",");
      	   Goods g = new Goods(inputs[0], Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
      	   gList.add(g);
      	   
         }
         for(int i=0; i<gList.size(); i++) {
      	   gList.get(i).info();
      	   sum += gList.get(i).getCount(); 
         }
         System.out.println("모든 상품의 갯수는" +sum+ "개입니다.");
         
         sc.close();
       
    }

}
