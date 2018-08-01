package com.digitalcreative.smartkidsindeng.Boundary;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.digitalcreative.smartkidsindeng.Boundary.MenuFragment;
import com.digitalcreative.smartkidsindeng.R;

public class StartActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.zzbacksound);
        mediaPlayer.setLooping(true);

        Button btn_mulai = findViewById(R.id.btn_mulai);
        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer.start();

                Fragment fragment = new MenuFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.animator.fade_in, R.animator.fade_out);
                fragmentTransaction.add(R.id.container, fragment);
                fragmentTransaction.commit();
            }
        });
    }
}
