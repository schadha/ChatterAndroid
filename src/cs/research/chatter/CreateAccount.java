package cs.research.chatter;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapEditText;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class CreateAccount extends Activity {
	
	private BootstrapEditText emailAddress1;
	private BootstrapEditText emailAddress2;
	private BootstrapEditText passwordBox1;
	private BootstrapEditText passwordBox2;
	private BootstrapButton createAccountButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_account);
		
		emailAddress1 = (BootstrapEditText) findViewById(R.id.emailAddress1);
		emailAddress2 = (BootstrapEditText) findViewById(R.id.emailAddress2);
		passwordBox1 = (BootstrapEditText) findViewById(R.id.password1);
		passwordBox2 = (BootstrapEditText) findViewById(R.id.password2);
		createAccountButton = (BootstrapButton) findViewById(R.id.createAccountButton1);
		
		createAccountButton.setOnClickListener(createAccount);
	}
	
	private OnClickListener createAccount = new OnClickListener() {
		
		public void onClick(View v)
		{
			System.out.println(emailAddress1.getText().toString());
			System.out.println(emailAddress2.getText().toString());
			System.out.println(passwordBox1.getText().toString());
			System.out.println(passwordBox2.getText().toString());
			finish();
		}
		
	};
}
