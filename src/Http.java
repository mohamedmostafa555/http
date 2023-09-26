import java.io.*;
import java.net.*;
public class Http {

    public static void main(String[] args) {
        /*set path of file to transfer*/
        String path=new String("");
        DataInputStream is= null;

        try {
            /*from path creat url*/
            URL url= new URL(path);

            /*open an input stream from the url*/
            is= new DataInputStream(new BufferedInputStream(url.openStream()));

            /*read line by line and print them*/
            String s;

            while ((s=is.readLine()) != null)
            {
                System.out.println(s);
            }

        }   catch (Exception e) {
            System.out.println(" An exceotin occured");
            e.printStackTrace();
            System.exit(1);
        }
        finally {
            /*close the input stream*/
            try {
                is.close();
            }catch (IOException ioe){
               System.out.println("IoException occurred");
               ioe.printStackTrace();
               System.exit(1);

            }
        }
    }

}
