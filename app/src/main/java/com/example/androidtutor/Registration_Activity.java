package com.example.androidtutor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registration_Activity extends AppCompatActivity {
    private EditText username, useremail, userpassword, userAge;
    private TextView already_Signed;
    private Button register_button;
    private ImageView userProfilepic;

    private FirebaseAuth firebaseAuth;
    String email, name, password, age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_);


        userAge = (EditText)findViewById(R.id.etAge);

        setupUIview();

        firebaseAuth = FirebaseAuth.getInstance();

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    //Upload the data to the database
                    String user_email = useremail.getText().toString().trim();
                    String user_password = userpassword.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(user_email, user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                sendEmailVerification();
                                Toast.makeText(Registration_Activity.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Registration_Activity.this, Signin_Activity.class));


                                sendUserData();
                                Toast.makeText(Registration_Activity.this, "Successfully Registered, Upload Complete",Toast.LENGTH_SHORT).show();
                                firebaseAuth.signOut();
                                finish();
                            }
                            else {
                                Toast.makeText(Registration_Activity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

        already_Signed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registration_Activity.this, Signin_Activity.class));
            }
        });


    }


    private void setupUIview(){
        username = (EditText)findViewById(R.id.etname);
        useremail = (EditText)findViewById(R.id.etemail);
        userpassword = (EditText)findViewById(R.id.etpassword);
        already_Signed = (TextView)findViewById(R.id.tvAlready);
        register_button = (Button)findViewById(R.id.bregister);


    }

    private Boolean validate()
    {
        Boolean result = false;
        name = username.getText().toString();
        email = useremail.getText().toString();
        password = userpassword.getText().toString();
        age = userAge.getText().toString();

        if(name.isEmpty() || email.isEmpty() || password.isEmpty() || age.isEmpty())
        {
            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show();
        }
        else
        {
            return true;
        }
        return result;
    }


    private void sendEmailVerification()
    {
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if(firebaseUser!=null)
        {
            firebaseUser.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(task.isSuccessful())
                    {
                        startActivity(new Intent(Registration_Activity.this, Signin_Activity.class));

                    }
                    else
                    {
                        Toast.makeText(Registration_Activity.this, "Verification Email hasn't sent!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void sendUserData()
    {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference myRef = firebaseDatabase.getReference(firebaseAuth.getUid());
        UserProfile userProfile = new UserProfile(age, email, name);
        myRef.setValue(userProfile);
    }
}
