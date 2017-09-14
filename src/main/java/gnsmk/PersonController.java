package gnsmk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.ArrayList;

@Controller
@SpringBootApplication

public class PersonController {
	public static void main(String[] args) {
		SpringApplication.run(PersonController.class, args);
	}

	@RequestMapping("/")
	public String Hello() {
		return "personX.jsp";
	}

	@RequestMapping("/list")
	public @ResponseBody List<Person> getList(){
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("manoj", 99));
		li.add(new Person("kosu", 199));
		li.add(new Person("kausi", 299));
		return li;
	}
}