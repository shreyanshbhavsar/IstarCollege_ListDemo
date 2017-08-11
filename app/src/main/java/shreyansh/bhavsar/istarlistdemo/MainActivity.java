package shreyansh.bhavsar.istarlistdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView studentListView;
    String [] students;
    ArrayAdapter<String> studentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        studentListView = (ListView) findViewById(R.id.studentlistview);
        students = new String[]{"Dhara","Jignesh","Chirag","Meghavi","Jinal","Shreyansh","Dhoni"};

        studentAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,students);
        studentListView.setAdapter(studentAdapter);

        studentListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String name = students[position];

        Intent intent = new Intent(MainActivity.this,DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("namekey",name);
        intent.putExtras(bundle);

        startActivity(intent);

    }
}
