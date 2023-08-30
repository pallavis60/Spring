package comxworkz.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.school.config.AppConfig;
import com.xworkz.school.dto.SchoolDto;
import com.xworkz.school.service.SchoolService;

public class Runner {
	
	@Autowired
	private static SchoolService service;

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SchoolDto dto = new SchoolDto(1, "Nikitha", 10, "Bhavya", 7878787878L);
		
	boolean save =service.save(dto);
	System.out.println(save);
	
	}

}
