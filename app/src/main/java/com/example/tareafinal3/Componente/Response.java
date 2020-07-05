package com.example.tareafinal3.Componente;

import com.example.tareafinal3.Usuarios;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {
    @SerializedName("Usuarios")
    @Expose
    private List<Usuarios>Usuarios;
}

