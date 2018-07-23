package com.coco.listviewleftswipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Person> PersonList = new ArrayList<>();
    private boolean weatherMove;

    private MyListview mListView;
    private ArrayAdapter<String> mAdapter;
    private List<String> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.list_view);
        mDatas = new ArrayList<String>(Arrays.asList("HelloWorld", "Welcome", "Java", "Android", "Servlet", "Struts",
                "Hibernate", "Spring", "HTML5", "Javascript", "Lucene"));
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mDatas);
        mListView.setAdapter(mAdapter);
        mListView.setDelButtonClickListener(new MyListview.DelButtonClickListener() {
            @Override
            public void clickHappend(final int position) {
                Toast.makeText(MainActivity.this, position + " : " + mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                // TODO: 18-7-23 删除会话的操作
                mAdapter.remove(mAdapter.getItem(position));
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, position + " : " + mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });


//        initPerson();
//        PersonAdapter adapter = new PersonAdapter(MainActivity.this, R.layout.activity_item, PersonList, this);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
//        listView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        break;
//                    case MotionEvent.ACTION_MOVE:
//                        // 如果滑动，这里把变量进行改变
//                        weatherMove = true;
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        // 在抬起的时候进行事件的处理
//                        if (!weatherMove) {
//                            // 没有侧滑，进行点击事件的处理，跳转界面或者其他的
//                            Toast.makeText(MainActivity.this, "item", Toast.LENGTH_SHORT).show();
//                        }
//                        // 处理完以后，把设置的变量还原回去
//                        weatherMove = false;
//
//                        break;
//                    default:
//                        break;
//                }
//                return false;
//            }
//        });
//    }
//
//    private void initPerson() {
//        for (int i = 0; i < 2; i++) {
//            Person person = new Person("Alex", R.mipmap.ic_launcher);
//            PersonList.add(person);
//            person = new Person("Brandon", R.mipmap.ic_launcher);
//            PersonList.add(person);
//            person = new Person("Charles", R.mipmap.ic_launcher);
//            PersonList.add(person);
//            person = new Person("Davie", R.mipmap.ic_launcher);
//            PersonList.add(person);
//            person = new Person("Eric", R.mipmap.ic_launcher);
//            PersonList.add(person);
//            person = new Person("Fanny", R.mipmap.ic_launcher);
//            PersonList.add(person);
//            person = new Person("Grace", R.mipmap.ic_launcher);
//            PersonList.add(person);
//            person = new Person("Helen", R.mipmap.ic_launcher);
//        }
//    }
//
//    @Override
//    public void click(View view) {
//        Toast.makeText(this, "button", Toast.LENGTH_SHORT).show();
    }
}
