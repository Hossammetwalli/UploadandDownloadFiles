package com.uploadanddownload.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
 * So in the above code prefix = “file” is used to find the properties
 *  which start with “file” which is present in the application.properties
 *   file and assigned that value to the uploadDir variable of FileStoragePojo. java class.
 */


@ConfigurationProperties(prefix = "file")
	public class FileStoragePojo {

		private String uploadDir;

	    public String getUploadDir() {
	        return uploadDir;
	    }

	    public void setUploadDir(String uploadDir) {
	        this.uploadDir = uploadDir;
	    }
	}
