package org.ivyweb.android.cslearn;

import java.util.List;

import org.ivyweb.android.cslearn.models.User;

import com.j256.ormlite.dao.RuntimeExceptionDao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends DatabaseActivity {
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
        
        Button btnRoot = (Button) findViewById(R.id.btn_login_root);
        btnRoot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				login();
			}
		});
	}
	
	private Boolean validate(String email, String passwd) {
		RuntimeExceptionDao<User, Integer> userDao = getHelper().getUserREDao();
		List<User> match = userDao.queryForMatching(new User(email, passwd));
		if (!match.isEmpty()) {
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
