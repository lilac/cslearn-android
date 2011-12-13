package org.ivyweb.android.cslearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        Button btn = (Button) findViewById(R.id.btn_login);
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText etMail = (EditText) findViewById(R.id.et_email);
				EditText etPasswd = (EditText) findViewById(R.id.et_passwd);
				String mail = etMail.getText().toString();
				String passwd = etPasswd.getText().toString();
				boolean res = validate(mail, passwd);
				if (res) login();
				else {
					Toast.makeText(v.getContext(), "email or passwd wrong", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
	
	private Boolean validate(String email, String passwd) {
		if (email.equals("admin") && passwd.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}
	
	private void login() {
		//TODO
		Intent intent = new Intent(this, HomeActivity.class);
		startActivity(intent);
	}
}
