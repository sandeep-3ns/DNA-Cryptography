package aws;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListFiles {

    public static Vector<String> getAllFiles(){
        AmazonS3 s3 = AwsClient.getClient();
        String bucket = AwsUtil.BUCKET_NAME;
        ObjectListing ol = s3.listObjects(bucket);
        List<S3ObjectSummary> list = ol.getObjectSummaries();
        Vector<String> files = new Vector<String>();
        System.out.println("Bucket " + bucket + " Files");
        for (S3ObjectSummary os : list) {
            System.out.println("--> " + os.getKey());
            files.add(os.getKey().toString());
        }
        return files;
    }
}
