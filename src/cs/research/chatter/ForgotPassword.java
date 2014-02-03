package cs.research.chatter;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapEditText;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ForgotPassword extends Activity {
	
	private BootstrapEditText emailAddress;
	private BootstrapButton retrievePasswordButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forgot_password);
		
		emailAddress = (BootstrapEditText) findViewById(R.id.emailAddressRetrieval);
		retrievePasswordButton = (BootstrapButton) findViewById(R.id.retrievePassword);
		
		retrievePasswordButton.setOnClickListener(createAccount);
	}
	
	private OnClickListener createAccount = new OnClickListener() {
		
		public void onClick(View v)
		{
			System.out.println(emailAddress.getText().toString());
			finish();
		}
		
	};
}
