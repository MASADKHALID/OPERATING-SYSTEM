package operatingSystem;

public class multiThreadUse {

    public static void main(String[] args) {

        multiThread thread1 = new multiThread(1);
        thread1.start();

        multiThread thread2 = new multiThread(2);
        thread2.start();

        multiThread thread3 = new multiThread(3);
        thread3.start();
    }
}

class multiThread extends Thread {
    private int threadNumber;

    public multiThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        if (threadNumber == 1) {
            System.out.println("Thread no=>" + threadNumber + "==============1=================");
            System.out.println("Thread no=>" + threadNumber + "==============2=================");
            System.out.println("Thread no=>" + threadNumber + "==============3=================");
            System.out.println("Thread no=>" + threadNumber + "==============4=================");
        } else if (threadNumber == 2) {
            System.out.println("Thread no=>" + threadNumber + "==============1=================");
            System.out.println("Thread no=>" + threadNumber + "==============2=================");
            System.out.println("Thread no=>" + threadNumber + "==============3=================");
            System.out.println("Thread no=>" + threadNumber + "==============4=================");
            System.out.println("Thread no=>" + threadNumber + "==============5=================");
            System.out.println("Thread no=>" + threadNumber + "==============6=================");
        } else {
            System.out.println("Thread no=>" + threadNumber + "==============1=================");
            System.out.println("Thread no=>" + threadNumber + "==============2=================");
            System.out.println("Thread no=>" + threadNumber + "==============3=================");
            System.out.println("Thread no=>" + threadNumber + "==============4=================");
            System.out.println("Thread no=>" + threadNumber + "==============5=================");
            System.out.println("Thread no=>" + threadNumber + "==============6=================");
            System.out.println("Thread no=>" + threadNumber + "==============7=================");
            System.out.println("Thread no=>" + threadNumber + "==============8=================");
        }
    }
}
