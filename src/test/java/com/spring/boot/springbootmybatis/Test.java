package com.spring.boot.springbootmybatis;


import org.json.JSONArray;
import org.json.JSONObject;

public class Test {

    public static void main(String[] args){


        int count=0;
        int num=0;
        int res=0;
        for(int j=0;j<176;j++){
            count++;
            if(176-count>=176%10){
                num++;
                if(count>0&&count%10==0){
                    res++;
                    num=0;
                }
            }else{
                num++;
                if(count==176){
                    System.out.println("end");
                    num=0;
                }
            }

        }
        System.out.println(res);
    }

}
