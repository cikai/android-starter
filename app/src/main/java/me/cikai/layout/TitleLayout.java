package me.cikai.layout;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import me.cikai.R;

/**
 * Created by cikai on 2018/3/7.
 */

public class TitleLayout extends LinearLayout {

  private EditText editText;

  public TitleLayout(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
    LayoutInflater.from(context).inflate(R.layout.title, this);
    editText = (EditText) findViewById(R.id.title_edit_text);
    Button button = (Button) findViewById(R.id.title_button);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        String inputText = editText.getText().toString();
        Toast.makeText(getContext(), inputText, Toast.LENGTH_SHORT).show();
      }
    });
  }
}
