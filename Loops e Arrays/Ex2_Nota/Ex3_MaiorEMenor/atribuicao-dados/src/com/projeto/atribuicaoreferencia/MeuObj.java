package com.projeto.atribuicaoreferencia;

public class MeuObj {

    Integer num;

    public MeuObj(Integer num) { // construtor do objeto
        this.num = num;
    }

    public void setNum(Integer num) { // atribuição de valor
        this.num = num;
    }

    @Override
    public String toString() { // converte para String
        return this.num.toString();
    }
}