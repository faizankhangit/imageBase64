package com.base64;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/upload")
public class Image {
	
	@Autowired
	private Basererpo basererpo;

	@PostMapping(path = "/images")
	public void uploadFile(@RequestBody EntityClass entityClass ) throws IOException {
		
		FileInputStream img = new FileInputStream(entityClass.getFileName());
		byte[] fileContent = img.readAllBytes();
		String encodedString = Base64.getEncoder().encodeToString(fileContent);
		entityClass.setFileContentBase64(encodedString);
		basererpo.save(entityClass);
	}
}