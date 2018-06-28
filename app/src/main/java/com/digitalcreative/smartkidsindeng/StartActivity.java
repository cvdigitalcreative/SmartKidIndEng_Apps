package com.digitalcreative.smartkidsindeng;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.digitalcreative.smartkidsindeng.Fragment.MenuFragment;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button btn_mulai = findViewById(R.id.btn_mulai);
        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = new MenuFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.animator.fade_in, R.animator.fade_out);
                fragmentTransaction.add(R.id.container, fragment);
                fragmentTransaction.commit();
            }
        });
    }
}
