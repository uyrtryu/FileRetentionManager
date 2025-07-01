package ru.sitronics.cup.file_retention_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sitronics.cup.media.files.api.rest.MediaFilesApi;
import ru.sitronics.cup.media.files.api.rest.dto.DownloadFilesRequestApi;

@SpringBootApplication
public class FileRetentionManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileRetentionManagerApplication.class, args);


	}

}
