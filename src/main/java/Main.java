import dao.UserDAO;
import dao.UserDAOImpl;
import models.User;
import service.UserService;
import service.UserServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        userDAO.getUserById(2);
    }
}
