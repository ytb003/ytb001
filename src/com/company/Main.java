package com.company;

/**
 * @Description: 
 * @Author ytb007
 * @Date: 2020/10/16 18:59
 * @Version 1.0
 */

public class Main {
    //private static final Logger LOGGER= LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        
        System.out.println("程序开始了");

        String str = "你好呀，小明";
        boolean index = true;
        while (index) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println("程序运行中,......");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("程序出现问题，请求解决中。。。");
            }

            System.out.println("结束了，程序");
            //程序出口
            if (str.contains("你")) {
                index = false;
            }
            
        }
        //findOne(name);
        
    }
}
