
    class Hi extends Thread
    {
        public void run()
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Hi");

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }}

    }

    class Hello extends Thread
    {
        public void run()
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Hello");

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }}

    }

    public class Threading {

        public static void main(String[] args) {

            Hi h=new Hi();
            Hello h1=new Hello();
            h.start();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            h1.start();
        }

    }


