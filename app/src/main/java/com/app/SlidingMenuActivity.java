package com.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.adapters.SlidingMenuListAdapter;
import com.example.krishna.expensetracker.R;
import com.models.SlidingMenuModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna on 8/26/2015.
 */
public class SlidingMenuActivity extends AppCompatActivity{
    List<SlidingMenuModel> list= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sliding_menu_screen);
        SlidingMenuModel model= new SlidingMenuModel();
        model.setImageId(R.drawable.add_icon);
        model.setMenuName("Expense");
        list= new ArrayList<SlidingMenuModel>();
        list.add(model);

        SlidingMenuListAdapter adapter= new SlidingMenuListAdapter(this,list);
        ListView lv= (ListView) findViewById(R.id.list_slidermenu);
        lv.setAdapter(adapter);

    }
}
