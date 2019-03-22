package aws;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AmazonS3Exception;

public class CreateBucket {
    public static void main(String[] args) {
        final AmazonS3 s3 = AwsClient.getClient();
        String bucket = AwsUtil.BUCKET_NAME;
        try{
        s3.createBucket(bucket);
        }catch(AmazonS3Exception ex){
                    ex.printStackTrace();
        }
        System.out.println("\n\nBucket "+bucket+" Created successfully");
    }    
}
