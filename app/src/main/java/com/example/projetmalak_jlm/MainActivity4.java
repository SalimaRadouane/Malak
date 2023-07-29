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

public class MainActivity4 extends AppCompatActivity {
    private YouTubePlayerView youTubePlayerView;
    private List<String> videoIds = Arrays.asList("fT5tjfXPR3E", "s_TLN01O5Js", "y6kKyQ2Ce7E","kEfjy2Oo-Ac");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main4);
        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(" درس 1.جمع الحروف لتكوين كلمة");
        arrayList.add("درس 2:جمع الحروف لتكوين كلمة بسهولة ");
        arrayList.add("درس3.جمع الحروف وتكوين كلمات سهلة");
        arrayList.add("درس 4:جمع الحروف لتكوين كلمة");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
        youTubePlayerView = new YouTubePlayerView(this);
        getLifecycle().addObserver(youTubePlayerView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String videoId = videoIds.get(position);
                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                intent.putExtra("videoId", videoId);
                startActivity(intent);
            }
        });
    }
}