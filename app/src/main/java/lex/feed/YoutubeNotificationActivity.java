package lex.feed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.api.services.youtube.YouTube;

import java.util.Date;

public class YoutubeNotificationActivity extends AppCompatActivity {
    private static YouTube youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(new Date());
    }
}
