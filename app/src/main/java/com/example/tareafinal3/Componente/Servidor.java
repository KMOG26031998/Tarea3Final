package com.example.tareafinal3.Componente;

import com.example.tareafinal3.Usuarios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface Servidor {
    @GET("Usuarios")
    Call<List<Usuarios>> getUsuarios();
}
