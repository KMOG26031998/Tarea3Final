package com.example.tareafinal3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tareafinal3.Componente.RecyclerViewAdaptador;
import com.example.tareafinal3.Componente.Servidor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdaptador recyclerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =(RecyclerView)findViewById(R.id.rvusuarios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
        gsonusuarios();
        

    }
    public List<Usuarios> obtenerusuario(){
        List<Usuarios> usuario = new ArrayList<>();
        
        Log.e("KR",""+usuario.size());
        return usuario;
    }
   private void gsonusuarios() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/KMOG26031998/jsonserver/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        Servidor svr = retrofit.create(Servidor.class);
        Call<List<Usuarios>> call = svr.getUsuarios();
        call.enqueue(new Callback<List<Usuarios>>() {
            @Override
            public void onResponse(Call<List<Usuarios>> call, Response<List<Usuarios>> response) {
                if (!response.isSuccessful()) {
                
                    return;
                }
                List<Usuarios> postUsuarios = response.body();
          
                recyclerViewAdapter = new RecyclerViewAdaptador(postUsuarios);
                recyclerView.setAdapter(recyclerViewAdapter);

            }
            @Override
            public void onFailure(Call<List<Usuarios>> call, Throwable t) {
                Log.e("KR","aqui");
            }
        });
    }

}
