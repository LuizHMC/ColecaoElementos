package colecaoelementos;
import java.util.Scanner;
import java.lang.Math;

public class listaPonto {
    private Ponto pontos[];
    private int validos;
    public listaPonto( int N ) {
        this.pontos = new Ponto[N];
        this.validos = 0;
    }

    public int getValidos() {
        return validos;
    }

    public Ponto[] getPontos() {
        return pontos;
    }

    public void adiciona_final(Ponto p){
        //implement
    }

    public void adiciona_posicao_especifica(Ponto p, int pos){
        //implement
    }

    public int busca_ponto(Ponto p){
        //implement
        return 0;
    }

    public void remove_ponto(int indice){
        //implement
    }

    public double calcula_distancia(){
        //implement
        return 1;
    }

    public listaPonto pontos_circunferencia(double raio, Ponto p){
        //implement
        return new listaPonto(1);
    }
}
