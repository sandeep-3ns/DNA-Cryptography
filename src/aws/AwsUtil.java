package aws;


import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import java.io.File;
import java.util.Vector;

public class AwsUtil {
    
    public static final String BUCKET_NAME = "naveensandeep";

    public static boolean saveFile(String path){
       return UploadFile.saveFile(path);
    }
    
    public static String getText(String keyName){
        return ReadFile.getText(keyName);
    }
    
      public static Vector<String> getAllFiles(){
          return ListFiles.getAllFiles();
      }
}
