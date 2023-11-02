package co.edu.utp.isc.gia.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@SpringBootApplication
@RestController
@RequestMapping("hello")
public class HelloApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	@GetMapping("/{firstName}/{lastName}")
	public String sayHello(
			@PathVariable ("firstName") String firstName,
			@PathVariable ("lastName") String lastName) {
		return String.format("<h1>Hello %s %s</h1>" , firstName, lastName);
	}
	@GetMapping()
	public String helloWorld(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName) {
		return "Hello" + " " + firstName + " " + lastName;
	}
}