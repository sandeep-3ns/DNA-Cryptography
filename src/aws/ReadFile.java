package aws;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {
    public static String getText(String keyName){
         final AmazonS3 s3 = AwsClient.getClient();
         String fileText = "";
         S3Object obj = s3.getObject(new GetObjectRequest(AwsUtil.BUCKET_NAME, keyName));
        InputStream in = obj.getObjectContent();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(obj.getObjectContent()));
            String line = "";
            System.out.println("\n**File Content**");
            while ((line = br.readLine()) != null) {
                fileText=fileText+line+"\n";
            }
            in.close();
             }catch(IOException e){
            e.printStackTrace();
        }
        return fileText;
    }
}
