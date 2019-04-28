package com.example.setmaxheightforrcycerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    MyAdapter myAdapter;
    List<String> contentList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initContentList();
        recyclerView=(RecyclerView)findViewById(R.id.rc);
        myAdapter=new MyAdapter(this,contentList);
        linearLayoutManager=new LinearLayoutManager(this);
        ViewGroup.LayoutParams lp = recyclerView.getLayoutParams();
        if (contentList.size() > 9) {
            lp.height = DensityUtil.dp2px(this,42 * 9);
        } else {
            lp.height = DensityUtil.dp2px(this,42 * contentList.size());
        }
        recyclerView.setLayoutParams(lp);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }

    private void initContentList() {
        if (contentList!=null)
            contentList.clear();
        for(int i=0;i<20;++i) {
            contentList.add("你哈哈哈哈哈哈哈哈");
        }
    }
}
