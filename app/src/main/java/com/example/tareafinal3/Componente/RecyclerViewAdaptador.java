package com.example.tareafinal3.Componente;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ViewTarget;
import com.example.tareafinal3.R;
import com.example.tareafinal3.Usuarios;

import java.security.AccessController;
import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder>{
    public static class ViewHolder extends RecyclerView.ViewHolder{

       private TextView cedula,nombre,apellido,direccion,correo;
        ImageView imagenusuario;

        public ViewHolder(View itemView) {
            super(itemView);
            cedula =(TextView)itemView.findViewById(R.id.txtCedula);
            nombre =(TextView)itemView.findViewById(R.id.txtNombre);
            apellido =(TextView)itemView.findViewById(R.id.txtApellido);
            direccion =(TextView)itemView.findViewById(R.id.txtDireccion);
            correo =(TextView)itemView.findViewById(R.id.txtCorreo);
            imagenusuario = itemView.findViewById(R.id.ivusuario);
        }
    }
    public List<Usuarios> usuariosListist;
    RequestManager option;
    public RecyclerViewAdaptador(List<Usuarios> usuariosListist){
           this.usuariosListist = usuariosListist;
    }
    @Override
    public RecyclerViewAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario,parent,false);
        final RecyclerViewAdaptador.ViewHolder viewHolder = new RecyclerViewAdaptador.ViewHolder(view);
        option = Glide.with(viewHolder.imagenusuario.getContext());
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(RecyclerViewAdaptador.ViewHolder holder, int position) {
        holder.cedula.setText((usuariosListist.get(position).getCedula()));
        holder.nombre.setText((usuariosListist.get(position).getNombre()));
        holder.apellido.setText((usuariosListist.get(position).getApellido()));
        holder.direccion.setText((usuariosListist.get(position).getDireccion()));
        holder.correo.setText((usuariosListist.get(position).getCorreo()));
        option.load(usuariosListist.get(position).getImagen()).centerCrop().into(holder.imagenusuario);
    }
    @Override
    public int getItemCount() {
        return usuariosListist.size();
    }
}
