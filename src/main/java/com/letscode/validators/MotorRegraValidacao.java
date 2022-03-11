package com.letscode.validators;

public class MotorRegraValidacao<E> {
    private final RegraValidacao<E>[] regras;

    public MotorRegraValidacao(RegraValidacao<E>[] regras) {
        this.regras = regras;
    }

    public boolean executa(E algumaCoisa) {
        boolean estaValido = true;
        for (RegraValidacao regra : regras) {
            estaValido = regra.validar(algumaCoisa);
            if(!estaValido){
                break;
            }
        }
        return estaValido;
    }
}