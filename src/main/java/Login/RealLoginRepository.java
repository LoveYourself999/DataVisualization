package Login;

import java.util.ArrayList;
import java.util.List;

public class RealLoginRepository implements LoginContainer,LoginRepository {
    private static final String info_address = "src/main/resources/Login_info.xml";

    private static List<User> userList = new ArrayList<>();
    private static RealLoginRepository instance;

    public static RealLoginRepository getInstance() {
        if (instance == null) {
            instance = new RealLoginRepository();
            GetUserFile getUserFile = GetUserFile.getInstance();
            userList = getUserFile.getUserList();
            loading();
        }
        return instance;
    }



    @Override
    public LoginIterator getIterator() {
        return new RealLoginRepository.NameIterator();
    }

    @Override
    public boolean check(String username, String pw)
    {
        boolean User_Found = false;
        for (LoginIterator iter = this.getIterator(); iter.hasNext(); ) {
            User usr = (User) iter.next();
            if (pw.equals(usr.getPw()) && username.equals(usr.getUsername())) {
                User_Found = true;
                System.out.println("Find match!");
                break;
            }
        }
        if(!User_Found) {
            System.out.println("Not find match!");
        }
        return User_Found;
    }

    private static void loading(){
        System.out.println("Loading.....");
    }

    private class NameIterator implements LoginIterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < userList.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return userList.get(index++);
            }
            return null;
        }
    }
}

