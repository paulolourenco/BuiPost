package com.example.pauloloureno.buipost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paf on 20/07/2016.
 */
public class CardAmigos extends Fragment {

    private List<Produto> produtoList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProdutoAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.card_amigos, null);
    }

    @Override
    public void onActivityCreated (Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        recyclerView = (RecyclerView) getActivity().findViewById(R.id.recycler_view);

        mAdapter = new ProdutoAdapter(produtoList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareDadosProdutos();
    }

    private void prepareDadosProdutos(){
        Produto produto = new Produto("Feijão", "Tatico", -42,-43,11,7,"http://images.negociol.com/244203_w640_h640_feijaocristalcariocasite.jpg");
        produtoList.add(produto);

        Produto produto1 = new Produto("Arroz", "Carrefour", -42,-43,22,15,"http://www.sacosplasticosflexiveis.com.br/imagens/embalagens/saco-de-arroz-vila-caicara.jpg");
        produtoList.add(produto1);
        mAdapter.notifyDataSetChanged();
    }
}
