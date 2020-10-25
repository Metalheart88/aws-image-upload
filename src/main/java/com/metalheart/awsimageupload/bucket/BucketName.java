package com.metalheart.awsimageupload.bucket;

public enum BucketName {
  // Replace with your bucket name
  PROFILE_IMAGE("metalheart-image-upload-2020");

  private final String bucketName;

  BucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public String getBucketName() {
    return bucketName;
  }
}
