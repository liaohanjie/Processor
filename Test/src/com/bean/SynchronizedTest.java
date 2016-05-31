package com.bean;
public class SynchronizedTest {

    public volatile static boolean flag = true;


    public static void main(String[] args) throws Exception{

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(flag) {
//                	Object object = new Object();
//                	synchronized (object) {
//                		try {
//							object.wait(1000);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
                }
                System.out.println("子线程执行结束================");
            }
        }).start();

        Thread.sleep(1000);

        flag = false; // 关闭线程输出
        System.out.println("flag已被修改为false");
    }

}