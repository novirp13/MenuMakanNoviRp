package com.example.user.menu2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
    }

    public abstract class Adapter<T> {
        public abstract adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

        public abstract void onBindViewHolder(adapter.ViewHolder holder, int position);

        public abstract int getItemCount();
    }

    public class ViewHolder {
        public View itemView;

        public ViewHolder(View itemView) {

        }
    }
}
