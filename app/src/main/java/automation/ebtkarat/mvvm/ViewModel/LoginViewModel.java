package automation.ebtkarat.mvvm.ViewModel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import automation.ebtkarat.mvvm.Model.User;

/**
 * Created by Antnna on 08-Feb-19.
 */

public class LoginViewModel extends BaseObservable {
    private User _user;
    private String successMessage="Login was successfully"
            ,errorMessage="Email or password not valid";
    @Bindable
    public String toastMessage=null;

    public String getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
    }

    public LoginViewModel() {
        this._user = new User("","");
    }
    public void afterEmailTextChange(CharSequence s){
        this._user.setEmail(s.toString());
    }
    public void afterPasswordChange(CharSequence s){
        this._user.setPassword(s.toString());
    }
    public void onLoginClick(){
        if(_user.isDataValid()){
            setToastMessage(errorMessage);
        }else
            setToastMessage(successMessage);
    }
}
