package com.example.user.menu2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private adapter adaptermenu;

    public static ArrayList<model> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView) findViewById(R.id.recyclerView);
        adaptermenu = new adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<model> menuisi() {
        ArrayList<model> isi = new ArrayList<>();
        isi.add(new model("Mie Goreng Spesial",15000,R.drawable.hik_mie_goreng_spesial,"Mie Goreng dengan tambahan telur dan sayuran"));
        isi.add(new model("Mie Kuah Spesial",25000,R.drawable.hik_mie_kuah_spesial,"Mie Kuah dengan tambahan telur dan sayuran"));
        isi.add(new model("Miu Kuah Upnormal",10000,R.drawable.hik_mie_kuah_upnormal,"Mie Kuah dengan sambal menggelegar"));
        isi.add(new model("Nasi Goreng",10000,R.drawable.hik_nasi_goreng,"Nasi Goreng biasa saja"));
        isi.add(new model("Nasi Goreng Bawang",15000,R.drawable.hik_nasi_goreng_bawang,"Nasi Goreng dengan tambahan bawang"));
        isi.add(new model("Nasi Wagyu",20000,R.drawable.hik_nasi_wagyu,"Nasi dengan tambahan telur dan daging yang dibalut saus kacang"));
        isi.add(new model("Sate Madura",15000,R.drawable.hik_sate_madura,"Sate panggang Madura"));
        return  isi;
    }
}
