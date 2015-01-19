package com.jeryalthaf.snapchat;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class SignupActivity extends Activity {

	protected EditText mUsername;
	protected EditText mPassword;
	protected EditText mSignUpButton;
	protected EditText mEmail;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		
		mUsername = (EditText)findViewById(R.id.userNameField);
		mEmail = (EditText)findViewById(R.id.emailField);
		mPassword = (EditText)findViewById(R.id.passwordField);
		mSignUpButton = (EditText)findViewById(R.id.signup);
		
		mSignUpButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String username = mUsername.getText().toString();
				String password = mPassword.getText().toString();
				String email = mEmail.getText().toString();
				
				username = username.trim();
				password = password.trim();
				email = email.trim();
				
				if(username.isEmpty()|| password.isEmpty() || email.isEmpty()){
					AlertDialog.Builder builder = new AlertDialog.Builder(SignupActivity.this);
					builder.setMessage(R.string.signup_error_message)
					.setTitle(R.string.signup_error_title)
					.setPositiveButton(android.R.string.ok,null);
					
					AlertDialog dialog = builder.create();
					dialog.show();
				}
				else {
					
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.signup, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
