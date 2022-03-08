package com.base64;

import java.io.File;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.apache.tomcat.util.http.fileupload.FileUtils;

@SuppressWarnings("unused")
@Entity
public class EntityClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Lob
	private String fileContentBase64;
	
	private String fileName;
	
	
	private byte[] fileContent;
	
	public byte[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	
	@Override
	public String toString() {
		return "EntityClass [fileContentBase64=" + fileContentBase64 + ", fileName=" + fileName + ", fileContent="
				+ Arrays.toString(fileContent) + "]";
	}
	public String getFileContentBase64() {
		return fileContentBase64;
	}

	public void setFileContentBase64(String fileContentBase64) {
		this.fileContentBase64 = fileContentBase64;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		
	}

}