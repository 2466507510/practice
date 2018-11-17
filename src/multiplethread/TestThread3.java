package multiplethread;
      
    
import charactor.Hero2;
      
public class TestThread3 {
      
    public static void main(String[] args) {
    
        final Hero2 gareen = new Hero2();
        gareen.name = "盖伦";
        gareen.hp = 60;
             
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                       
                    //无需循环判断
//                    while(gareen.hp==1){
//                        continue;
//                    }
                       
                    gareen.hurt();
                     
                    try {
                        Thread.sleep(20000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
   
            }
        };
        t1.start();
   
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    gareen.recover();
   
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
   
            }
        };
        t2.start();
             
    }
          
}