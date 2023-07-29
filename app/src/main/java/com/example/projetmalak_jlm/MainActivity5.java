package com.example.projetmalak_jlm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {
    private List<String> videoIds = Arrays.asList("NI54n29s04s", "jOLGyrA51m0", "u90UuBQ3OyM","Ds2fhxqj71U");
    private YouTubePlayerView youTubePlayerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main5);
        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("سورة الفاتحة 1");
        arrayList.add("سورة الفاتحة 2");
        arrayList.add("سورة الفاتحة 3");
        arrayList.add("سورة الإخلاص");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
        youTubePlayerView = new YouTubePlayerView(this);
        getLifecycle().addObserver(youTubePlayerView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String videoId = videoIds.get(position);
                Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
                intent.putExtra("videoId", videoId);
                startActivity(intent);
            }
        });
    }
}