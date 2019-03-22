package aws;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

public class AwsClient {

   private static final String ACC_KEY = "AKIAJ6S3RMUHLONYPMAA";
    private static final String SEC_KEY = "YjB8OkwNs/wbLtKLZS0m8LUzdRoDdezziK4tV+W9";

    public static AmazonS3 getClient() {
        AWSCredentials credentials = new BasicAWSCredentials(ACC_KEY, SEC_KEY);

        System.out.println(credentials);

        AmazonS3 s3client = new AmazonS3Client(credentials);
        return s3client;
    }
}
