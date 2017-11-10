package com.botelho.diego.itaocara.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by diego on 15/09/17.
 */

@IgnoreExtraProperties
public class Farmacia {

    public String nome;
    public String telefone;
    public String endereco;

    public Farmacia() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Farmacia(String nome, String telefone, String endereco) {
        this.nome     = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

}