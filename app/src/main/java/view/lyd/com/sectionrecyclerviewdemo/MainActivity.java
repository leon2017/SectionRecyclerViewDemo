package view.lyd.com.sectionrecyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.TreeSet;

import adapter.HotelEntityAdapter;
import adapter.SectionedSpanSizeLookup;
import entity.HotelEntity;
import utils.JsonUtils;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private HotelEntityAdapter mAdapter;
    private TreeSet<String> mSelectedSet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mSelectedSet = new TreeSet<>();
        mAdapter = new HotelEntityAdapter(this,mSelectedSet);
        GridLayoutManager manager = new GridLayoutManager(this,4);
        //设置header
        manager.setSpanSizeLookup(new SectionedSpanSizeLookup(mAdapter,manager));
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mAdapter);
        HotelEntity entity = JsonUtils.analysisJsonFile(this,"json2");
        mAdapter.setData(entity.allTagsList);
    }
}
