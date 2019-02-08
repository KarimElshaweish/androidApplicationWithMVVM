package automation.ebtkarat.mvvm.View;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import automation.ebtkarat.mvvm.R;
import automation.ebtkarat.mvvm.ViewModel.LoginViewModel;
import automation.ebtkarat.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setViewModel(new LoginViewModel());
        activityMainBinding.executePendingBindings();
    }
}
