package me.cikai;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by cikai on 2018/3/7.
 */

public class ListViewDemoActivity extends AppCompatActivity {

  private String[] fruits = {"Apple", "Banana", "Pear", "Strawberry"};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.listview_demo);
    // 隐藏自带标题栏
    ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
      actionBar.hide();
    }

    // ListView 示例
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
        ListViewDemoActivity.this, android.R.layout.simple_list_item_1, fruits);
    ListView listView = (ListView) findViewById(R.id.list_view);
    listView.setAdapter(arrayAdapter);
    // ListView 响应item点击事件
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String fruit = fruits[position];
        Toast.makeText(ListViewDemoActivity.this, fruit, Toast.LENGTH_SHORT).show();
      }
    });
  }
}
