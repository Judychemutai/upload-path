package com.example.firebaseproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mProfileImage;
    private Button bt_chooseImage;
    private static final int PICK_IMAGE_REQUEST = 1;
    private Uri mUri;
    private TextView tvEnterName;
    private TextView tvEnterPhoneNumber;
    private TextView tvEnterEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProfileImage = (ImageView)findViewById(R.id.my_profileImage);
        tvEnterName = (TextView)findViewById(R.id.et_enter_name);
        tvEnterPhoneNumber = (TextView)findViewById(R.id.et_enter_phone_number);
        tvEnterEmail = (TextView)findViewById(R.id.et_enter_email);
        bt_chooseImage = (Button)findViewById(R.id.bt_chooseImage);
        bt_chooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPhoto();
            }
        });

    }

    private void selectPhoto() {

        Intent imageIntent = new Intent();
        imageIntent.setType("image/*");
        imageIntent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(imageIntent, PICK_IMAGE_REQUEST);



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST){
            if (resultCode == RESULT_OK){
                if (data != null){
                    if (data.getData()!= null){

                        mUri = data.getData();
                        mProfileImage.setImageURI(mUri);


                    }
                }
            }
        }else if (resultCode == RESULT_CANCELED){
            Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();
        }
    }
}
