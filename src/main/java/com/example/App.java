package com.example;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class App {
  public static void main(String[] args) {
    AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
    System.out.println("S3 client created: " + s3);
  }
}
