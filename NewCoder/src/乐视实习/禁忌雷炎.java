package 乐视实习;

import java.util.Scanner;

public class 禁忌雷炎 {
    private static Scanner sc;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int s=sc.nextInt();
            double r=Math.sqrt(s);
            int count=0;
                for(int x=(int)r*(-1);x<=(int)r;x++) 
                    for(int y=(int)r*(-1);y<=(int)r;y++) 
                        if(x*x+y*y==r*r) 
                            count++;          
              System.out.println(count);  
        }
    }

}
