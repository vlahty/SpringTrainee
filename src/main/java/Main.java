import database.User;
import jakarta.servlet.http.HttpServlet;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.CompanyRepository;
import repository.Repository;
import service.UserService;

public class Main {

    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("application.xml")) {

            UserService userService  = context.getBean(UserService.class);
            var companyRepository = context.getBean("CompanyRepositoryBean", Repository.class);

            userService.printAll();
            companyRepository.findById(1);

        }

    }
}
