package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * <h1> This class allows to downlaod all Sprites from external web server. </h1>
 * @since jre1.8.0_131
 * @author Léo Thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @see model.dao
 */
public class downLoadImage {

	/**
	 * Search all file from server and load them into new local files.
	 * Input file is covered entirely, to create all files.
	 * @throws FileNotFoundException 
	 * @return int
	 */
       public String downloadSprites(String imageUrlServerBasic) throws FileNotFoundException {
    	   
    		/**
    		 * Url to access .png folder on server.
    		 */
    		imageUrlServerBasic = "http://vandeiheim.ovh/images/";
    		
    		/**
    		 * String for basic location of image files.
    		 */
    		String basicLocationLocal = "C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\";
    		
    		/**
    		 * String to access to local .txt file where .png are referenced.
    		 */
    		String txtFile = "C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\listSprites.txt";
    		
    		/**
    		 * The current String reading.
    		 */
    		String currentLine;

    		
            /**
             * Input and Output.
             */
    	    InputStream inputStream = null;
            OutputStream outputStream = null;
    		InputStream flux=new FileInputStream(txtFile);
    		InputStreamReader lecture=new InputStreamReader(flux);
    		
    		/**
    		 * The buffer.
    		 */
    		BufferedReader buff=new BufferedReader(lecture);
    		
    	    try {
    	    	
        		/**
        		 * Read all lines in txt file.
        		 */
        		while((currentLine = buff.readLine()) !=null) {

    	    	URL url = new URL(imageUrlServerBasic + currentLine);
    	        inputStream = url.openStream();
    	        outputStream = new FileOutputStream(basicLocationLocal + currentLine);

    	        byte[] buffer = new byte[2048];
    	        int length;

           while ((length = inputStream.read(buffer)) != -1) {
               outputStream.write(buffer, 0, length);
           }
       	}
       } catch (MalformedURLException e) {
           System.out.println("MalformedURLException :- " + e.getMessage());

       } catch (FileNotFoundException e) {
           System.out.println("FileNotFoundException :- " + e.getMessage());

       } catch (IOException e) {
           System.out.println("IOException :- " + e.getMessage());

       } 
       finally {
           try {

        	   /**
        	    * Close input and output Streams.
        	    */
              inputStream.close();
              outputStream.close();

           } catch (IOException e) {
               System.out.println("Finally IOException :- " + e.getMessage());
           }
       }
       
    	    /*
    	     * Return Url's server.
    	     */
		return imageUrlServerBasic;

   }
}

