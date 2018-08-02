package flutur.org.terriblyminusculeuniversities.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;
import butterknife.OnClick;
import flutur.org.terriblyminusculeuniversities.R;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.facebookButton) View facebookButton;
    @BindView(R.id.googleButton) View googleButton;

    @OnClick(R.id.facebookButton)
    void triggerFacebook(){

    }

    @OnClick(R.id.googleButton)
    void triggerGoogle(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // if (sharedprefs.hasLoggedIn()) {finish(); return;}
        setContentView(R.layout.activity_login);
    }
}
