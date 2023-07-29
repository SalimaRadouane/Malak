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

public class MainActivity2 extends AppCompatActivity {
    private List<String> videoIds = Arrays.asList("HEoe5ggGznU", "botSKnVS6Ao", "uVfrV9X2zwY","lZXQObwJtno");
    private YouTubePlayerView youTubePlayerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("حرف الألف(أ)");
        arrayList.add("حرف الباء(ب) ");
        arrayList.add(" حرف التاء(ت)");
        arrayList.add("حرف الثاء (ث)");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
        youTubePlayerView = new YouTubePlayerView(this);
        getLifecycle().addObserver(youTubePlayerView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String videoId = videoIds.get(position);
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("videoId", videoId);
                startActivity(intent);
            }
        });
    }
}