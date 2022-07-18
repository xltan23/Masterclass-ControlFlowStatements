package cfs.pj;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3, 4, 2, 2));
        System.out.println(getBucketCount(3, 4, 2));
        System.out.println(getBucketCount(16, 3));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double totalArea = width*height;
        double reqBucket = Math.ceil(totalArea/areaPerBucket);
        int bucketCount = (int)reqBucket - extraBuckets;

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double totalArea = width*height;
        int reqBucket = (int)Math.ceil(totalArea/areaPerBucket);
        
        return reqBucket;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int reqBucket = (int)Math.ceil(area/areaPerBucket);
        
        return reqBucket;
    }
    
}
