package com.lsx.film.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import android.os.Bundle;
import com.lsx.film.R;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.category_recycler)
    RecyclerView categoryRV;
    private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
