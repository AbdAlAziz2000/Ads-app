package com.abdalazizabdallah.adsapp.view;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.abdalazizabdallah.adsapp.R;
import com.abdalazizabdallah.adsapp.model.Ads;
import com.abdalazizabdallah.adsapp.model.MyNotification;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    FloatingActionButton floatingActionButton;
    List<MyNotification> myNotificationList;

    AutoCompleteTextView autoCompleteTextView;
    private List<Ads> adsList;

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

        DataBindingUtil.setContentView(this, R.layout.fragment_advertiser_profile);
//
//        String [] listOption = {"Option 1", "Option 2", "Option 3", "Option 4"};
//        autoCompleteTextView = findViewById(R.id.post_ads_fragment_autoCompleteTextView);
//        autoCompleteTextView.setAdapter(new ArrayAdapter<>(this, R.layout.auto_item,listOption));

//        Ads ads = new Ads(getString(R.string.time_text), getString(R.string.ads_headline_text),
//                String.valueOf(R.drawable.house), getString(R.string.price_text_with_suffix, 300.001));
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
//        RecyclerView recyclerView = findViewById(R.id.my_ads_fragment_recycleView);
//        recyclerView.setAdapter(new MyAdsRecycleViewAdapter(getApplication(),adsList));

//
//
//

//        myNotificationList = new ArrayList<>();
//
//
//        MyNotification myNotification = new MyNotification(getString(R.string.title_item_notification), getString(R.string.body_item_notification));
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//        myNotificationList.add(myNotification);
//
//        RecyclerView recyclerView = findViewById(R.id.notification_fragment_recycleView);
//        recyclerView.setAdapter(new NotificationListRecycleViewAdapter(myNotificationList));

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
