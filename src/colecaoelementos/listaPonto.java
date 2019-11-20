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
        if (this.pontos[this.pontos.length - 1] == null){
         this.pontos[this.pontos.length -1] = p;
         this.validos ++;
        }
    }

    public void adiciona_posicao_especifica(Ponto p, int pos){
        //implement
    }

    public int busca_ponto(Ponto p){
        //implement
        return 0;
    }

    public void remove_ponto(int indice){
        for (int i = indice; i < this.pontos.length; i++){
            if (i + 1 == this.pontos.length){
                this.pontos[i] = null;
            }
            this.pontos[i] = this.pontos[i + 1];
        }
        this.validos --;
    }

    public double calcula_distancia(){
        double max_distancia = 0;
        for(int i = 0; i < this.pontos.length; i++) {
            for (int j = 0; j < this.pontos.length; j++) {
                double nova_distancia = this.pontos[i].distancia(this.pontos[j]);
                if ( nova_distancia > max_distancia){
                    max_distancia = nova_distancia;
                }
            }
        }
        return max_distancia;
    }

    public listaPonto pontos_circunferencia(double raio, Ponto p){
        Ponto[] pontos_circunferencia_list = new Ponto[this.pontos.length];
        for(int i = 0; i < this.pontos.length; i++){
            if(p.distancia(this.pontos[i]) <= raio){
                pontos_circunferencia_list[i] = this.pontos[i];
            }
        }
        listaPonto nova_lista = new listaPonto(pontos_circunferencia_list.length);
        for(int i = 0; i < pontos_circunferencia_list.length; i++){
            nova_lista.adiciona_final(pontos_circunferencia_list[i]);
        }
        return nova_lista;
    }
}
