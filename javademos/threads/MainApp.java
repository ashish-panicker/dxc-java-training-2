package javademos.threads;

public class MainApp {

    public static void main(String[] args) throws InterruptedException {
        // CODE TO SEND SMS NOTIFICATION
        // System.out.println("Sending SMS Notification"); // output 1 takes 2 mins to execute
        // CODE TO SEND EMAIL NOTIFICATION
        // System.out.println("Sending Email Notification"); // output 2 1 min
        // CODE TO SEND WHATSAPP NOTIFICATION
        // System.out.println("Sending WhatsApp Notification"); // output 3 30 seconds
        SMSNotification smsNotification = new SMSNotification();
        EmailNotification emailNotification = new EmailNotification();
        WhatsAppNotification whatsAppNotification = new WhatsAppNotification();

        Thread smsThread = new Thread(smsNotification);
        smsThread.setName("SMS Thread");

        Thread emailThread = new Thread(emailNotification);
        emailThread.setName("Email Thread");
        emailThread.setPriority(Thread.MAX_PRIORITY); // 1 - 10

        Thread whatsAppThread = new Thread(whatsAppNotification);
        
        System.out.format("Starting: %s Current State: %s %n" , smsThread.getName(), smsThread.getState().name());
        smsThread.start();
        // smsThread.join();
        
        emailThread.start();
        // emailThread.join();

        whatsAppThread.start();
        // whatsAppThread.join();

        Thread smsThread2 = new Thread(smsNotification);
        smsThread2.setName("SMS Thread 2");
        smsThread2.start();

    }
}


class SMSNotification implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(0);
            System.err.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState().name());
            System.out.println("Sending SMS Notification");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


class EmailNotification implements Runnable {

    @Override
    public void run() {
        System.out.println("Sending Email Notification");
    }

}


class WhatsAppNotification implements Runnable {

    @Override
    public void run() {
        System.out.println("Sending WhatsApp Notification");
    }

}
