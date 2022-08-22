public class KeyWords {


        public static void main(String[] args)
        {
            int[] i =new int[2];
            try
            {
                System.out.println("Element at index 3"+i[3]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown"+e);
            }
            finally
            {
                i[0]=20;
                System.out.println("Element is:"+i[0]);
            }

        }
    }

