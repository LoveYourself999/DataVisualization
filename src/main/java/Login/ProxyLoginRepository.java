package Login;

public class ProxyLoginRepository implements LoginRepository {
    private RealLoginRepository realLoginRepository;

    private static ProxyLoginRepository instance;

    public static ProxyLoginRepository getInstance() {
        if (instance == null) {
            instance = new ProxyLoginRepository();
        }
        return instance;
    }


    @Override
    public boolean check(String username, String pw) {
        if(realLoginRepository == null){
            realLoginRepository =  RealLoginRepository.getInstance();
        }
        return realLoginRepository.check(username,pw);
    }
}
