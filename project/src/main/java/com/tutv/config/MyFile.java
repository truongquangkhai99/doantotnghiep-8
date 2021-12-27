/**
 * @package com.tutv.config
 * @date Dec 27, 2021
 * @author trinh
 */
package com.tutv.config;

import java.io.Serializable;
import org.springframework.web.multipart.MultipartFile;

/**
 * MyFile
 */

public class MyFile implements Serializable {
	private static final long serialVersionUID = 1L;
	private MultipartFile multipartFile;
	private String description;

	
	public MyFile() {
		
	}

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}