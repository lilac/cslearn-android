package org.ivyweb.android.cslearn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        
        Button btn = (Button) findViewById(R.id.btn_signup);
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				EditText etMail = (EditText) findViewById(R.id.et_email);
				EditText etPasswd = (EditText) findViewById(R.id.et_passwd);
				String mail = etMail.getText().toString();
				String passwd = etPasswd.getText().toString();
				newUser(mail, passwd);
			}
		});
	}
	
	private void newUser(String mail, String passwd) {
		//TODO:
	}
	
}
