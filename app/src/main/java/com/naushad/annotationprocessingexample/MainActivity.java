package com.naushad.annotationprocessingexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.naushad.binder.Binding;
import com.naushad.binder_annotation.BindView;
import com.naushad.binder_annotation.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.content)
    AppCompatTextView contentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding.bind(this);
    }

    @OnClick(R.id.button_one)
    public void incrementCount(View view) {
        contentTextView.setText("Heyaaa");
    }
}
