package com.sheitqn.getserie;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends Activity {

    public final static String LOGIN = "com.sheitqn.getseries.LOGIN";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	public void loginSend(View view) {

	}
	
	public void goto_reg(View view) {
		Intent intent = new Intent(this, RegiActivity.class);
		EditText loginField = (EditText) findViewById(R.id.loginName);
		String login = loginField.getText().toString();
		intent.putExtra(LOGIN, login);

	    startActivity(intent);
	}
}
