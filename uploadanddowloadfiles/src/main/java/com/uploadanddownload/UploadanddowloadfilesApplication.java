package com.uploadanddownload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.uploadanddownload.model.FileStoragePojo;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStoragePojo.class
})
public class UploadanddowloadfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadanddowloadfilesApplication.class, args);
	}

}
