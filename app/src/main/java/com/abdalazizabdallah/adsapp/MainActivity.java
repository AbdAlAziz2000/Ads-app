package com.abdalazizabdallah.adsapp;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    FloatingActionButton floatingActionButton;
    List<Ads> adsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String languageToLoad = "ar"; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        DataBindingUtil.setContentView(this, R.layout.unregister_profile_fragment);
//        Ads ads = new Ads(getString(R.string.time_text), getString(R.string.ads_headline_text),
//                String.valueOf(R.drawable.ipad2), getString(R.string.price_text_with_suffix, 300.001));
//        adsList = new ArrayList<>();
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//        adsList.add(ads);
//
//
//        RecyclerView recyclerView = findViewById(R.id.main_fragment_recycleView);
//        recyclerView.setAdapter(new AdsListRecycleViewAdapter(adsList));

//
//
//        bottomNavigationView = findViewById(R.id.bottomNavigationView);
//       bottomNavigationView.setBackground(null);


//        ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT,ItemTouchHelper.RIGHT) {
//            @Override
//            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
//                return false;
//            }
//
//            @Override
//            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
//
//            }
//        }
    }
}
