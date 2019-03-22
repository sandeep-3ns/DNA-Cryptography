package aws;


import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import java.io.File;

public class UploadFile {

    public static boolean saveFile(String path) {
        AmazonS3 s3 = AwsClient.getClient();
        File file = new File(path);
        String keyName = file.getName(); //Key is file name
        boolean flag = false;
        try {
            s3.putObject(AwsUtil.BUCKET_NAME, keyName, file);
            flag = true;
        } catch (AmazonServiceException ex) {
            ex.printStackTrace();
        }
        return flag;
    }
    
    public static boolean saveFile(String filePath, String keyName, String bucketName) {
        AmazonS3 s3 = AwsClient.getClient();
        File file = new File(filePath);
        boolean flag = false;
        try {
            s3.putObject(bucketName, keyName, file);
            flag = true;
        } catch (AmazonServiceException ex) {
            ex.printStackTrace();
        }
        return flag;
    }
}
