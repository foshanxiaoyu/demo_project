package demo_project;

import java.util.Scanner;

/**
 * DAYONETRY
 */
public class DAYONETRY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高是：" );
        int height1 = sc.nextInt();
        System.out.println("第一个和尚的身高是：" + height1);
        System.out.println("请输入第二个和尚的身高是：" );
        int height2 = sc.nextInt();
        System.out.println("第二个和尚的身高是：" + height2);
        System.out.println("请输入第三个和尚的身高是：");
        int height3 = sc.nextInt();
        System.out.println("第三个和尚的身高是：" + height3);
        int heightTemp = height1 > height2 ? height1 : height2;
        int maxHeight = heightTemp > height3 ? heightTemp : height3;
        System.out.println("最高的是：" + maxHeight);
        // int secenMod = sc.nextInt();
        System.out.println("请输入了一个整数：");
        int fristMod = sc.nextInt();
        if(fristMod%2==0){
            System.out.println("输入了一个O数！");
        }else{
            System.out.println("输入了一个J数！");
        }
        String[] name = {"Tom","jereny","jenly","hack"};
        int j=0;
        for(int i=0; i< name.length; i++ ) {
            System.out.println("name is:"+name[i]);
        }

    }
}