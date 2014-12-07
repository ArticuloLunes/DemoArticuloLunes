/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoarticulolunes.Negocio;

/**
 *
 * @author Lidia
 */
public class NumeroNatural {

    int numero;

    public NumeroNatural(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public NumeroNatural() {

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean Primo() {
        if (numero == 1) {
            return false;
        } else {
            for (int i = 2; i <= numero; i++) {
                if (numero % i == 0) {
                    if (numero == i) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public Boolean Par() {
        return numero % 2 == 0;
    }

    public int InvertirNumero() {
        int numeroInvertido = 0, copia = this.getNumero(), resto;
        while (copia != 0) {
            resto = copia % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            copia = copia / 10;
        }
        return numeroInvertido;
    }

    public boolean EsCapicua() {
        return this.getNumero() == InvertirNumero();
    }

    public int ContadorDeDigitos() {
        int copia = this.getNumero(), contador = 0;
        while (copia != 0) {
            copia = copia / 10;
            contador++;
        }
        return contador;
    }

}
