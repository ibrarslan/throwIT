package de.fh_dortmund.throwit.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import de.fh_dortmund.throwit.R;
import de.fh_dortmund.throwit.menu.Menu;

/**
 * @author Bijan Riesenberg
 */
public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText username = (EditText) findViewById(R.id.edit_username);
        final EditText password = (EditText) findViewById(R.id.edit_password);
        final Button bLogin = (Button) findViewById(R.id.btn_login);
        final Button registerLink = (Button) findViewById(R.id.btn_register);


        registerLink.setOnClickListener(new View.OnClickListener(){ // Creating a listener which leads you from the start page to the register page
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(Login.this, RegisterActivity.class);
                Login.this.startActivity(registerIntent);
            }
        });


        bLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                //final String user = username.getText().toString();
                //  final String pass = password.getText().toString();
                launchMenu();


                /*  Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            //TODO REMOVE LATER
                            success = true;
                            if(success){
                                // send to main activity


                                // Intent intent = new Intent(Login.this, // Klasse einfügen);

                                // Login.this.startActivity(intent);
                            }
                            else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                                builder.setMessage("Login failded")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }; */

                // LoginRequest loginRequest = new LoginRequest(user, pass, responseListener);
            }
        });
    }


    /**
     * Send Intent to Start Menu Activity.
     */
    private void launchMenu() {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

}