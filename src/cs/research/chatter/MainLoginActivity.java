package cs.research.chatter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View; 
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapEditText;

public class MainLoginActivity extends Activity {

	private BootstrapEditText emailAddress;
	private BootstrapEditText passwordBox;
	private BootstrapButton loginButton;
	private BootstrapButton createAccountButton;
	private BootstrapButton forgotPasswordButton;
	
	private String userName;
	private String passWord;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_login);
		
		emailAddress = (BootstrapEditText) findViewById(R.id.emailAddress);
		passwordBox = (BootstrapEditText) findViewById(R.id.password);
		loginButton = (BootstrapButton) findViewById(R.id.loginButton);
		createAccountButton = (BootstrapButton) findViewById(R.id.createAccountButton);
		forgotPasswordButton = (BootstrapButton) findViewById(R.id.forgotPasswordButton);
		
		loginButton.setOnClickListener(login);
		createAccountButton.setOnClickListener(createAccount);
		forgotPasswordButton.setOnClickListener(forgotPassword);
	}
	
	private OnClickListener login = new OnClickListener() {
		
		public void onClick(View v)
		{
			userName = emailAddress.getText().toString();
			passWord = passwordBox.getText().toString();
			
			System.out.println(userName);
			System.out.println(passWord);
			
			InputMethodManager inputManager = (InputMethodManager)
	                getSystemService(Context.INPUT_METHOD_SERVICE); 

			inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
	                   InputMethodManager.HIDE_NOT_ALWAYS);
		}
	};
	
	private OnClickListener createAccount = new OnClickListener() {
		
		public void onClick(View v)
		{
			Intent accountIntent = new Intent(MainLoginActivity.this,
					CreateAccount.class);
			startActivity(accountIntent);
		}
	};
	
private OnClickListener forgotPassword = new OnClickListener() {
		
		public void onClick(View v)
		{
			Intent forgotPwdIntent = new Intent(MainLoginActivity.this,
					ForgotPassword.class);
			startActivity(forgotPwdIntent);
		}
	};
}
