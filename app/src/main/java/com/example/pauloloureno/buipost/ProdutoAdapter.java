package com.example.pauloloureno.buipost;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Paf on 20/07/2016.
 */
public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoAdapter.MyViewHolder>{

    private List<Produto> produtoList;
    private Context ctx;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagem;
        public TextView nome, supermercado, precoAnterior, precoAtual;

        public MyViewHolder(View view) {
            super(view);
            nome = (TextView) view.findViewById(R.id.nome);
            precoAnterior = (TextView) view.findViewById(R.id.preco_anterior);
            precoAtual = (TextView) view.findViewById(R.id.precoatual);
            supermercado = (TextView) view.findViewById(R.id.supermercado);
            imagem = (ImageView) view.findViewById(R.id.imagem_produto);
            ctx = view.getContext();
        }
    }

    public ProdutoAdapter(List<Produto> listaProdutos) {
        this.produtoList = listaProdutos;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_produto, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Produto produto = produtoList.get(position);
        holder.nome.setText(produto.getNome());
        holder.supermercado.setText(produto.getSupermercado());
        holder.precoAnterior.setText(Float.toString(produto.getPrecoAntigo()));
        holder.precoAtual.setText(Float.toString(produto.getPrecoAtual()));

        Picasso.with(ctx).load(produto.getLinkImagem()).into(holder.imagem);
    }

    @Override
    public int getItemCount() {
        return produtoList.size();
    }

}

