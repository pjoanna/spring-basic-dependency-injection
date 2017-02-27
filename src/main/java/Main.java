/**
 * Created by pjoanna on 2017-02-20.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl();
        UsersRepository usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(logger);
        User user = usersRepository.createUser("Asia");

    }
}
