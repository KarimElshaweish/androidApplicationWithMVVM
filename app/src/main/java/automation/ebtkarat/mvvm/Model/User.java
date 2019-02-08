package automation.ebtkarat.mvvm.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

/**
 * Created by Antnna on 08-Feb-19.
 */

public class User {
    private String email,password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public Boolean isDataValid(){
        return !TextUtils.isEmpty(getEmail())
                && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
                &&getPassword().length()>6;
    }
}
