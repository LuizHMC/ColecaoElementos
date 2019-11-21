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

    public void mostra() {
        String resultado = "";
        String parcial = "";
        for (int i = 0; i < this.pontos.length; i++){
            if (this.pontos[i] != null) {
                parcial = "(" + this.pontos[i].getX() + "," + this.pontos[i].getY() + ")";
                resultado += parcial;
            }
        }
        System.out.println(resultado);
    }

    public void adiciona_final(Ponto p){
        if(this.validos != this.pontos.length){
            if (this.pontos[this.pontos.length-1] == null){
                this.pontos[this.pontos.length-1] = p;
            }
            else {
                for (int k = this.pontos.length-2; k > 0; k--){
                    this.pontos[k] =  this.pontos[k+1];
                }
            }
            this.pontos[this.pontos.length-1] = p;
        }
    }
    public void adiciona_posicao_especifica(Ponto p, int pos){
        if (pos <= this.pontos.length){
            this.validos ++;
            //for (int i = 0; i < pos; i++) {
            if (this.pontos[pos] == null){
                this.pontos[pos] = p;
            }
            else {
                for (int k = this.pontos.length-2; k > pos; k--){
                    this.pontos[k] =  this.pontos[k+1];
                }
            }
            this.pontos[pos] = p;
            //}
        }
        else{
            System.out.println("Posição inválida");
        }
    }

    public int busca_ponto(Ponto p){
        for (int i = 0; i < this.pontos.length; i++) {

            if (this.pontos[i] != null) {
                if (this.pontos[i].getX() == p.getX() && this.pontos[i].getY() == p.getY()) {
                    return i;
                }
            }
        }
        return -1;
    }





    public void remove_ponto(int indice) {
        if (indice <= this.pontos.length) {
            this.pontos[indice] = null;
            if (indice != this.pontos.length - 1) {
                for (int i = indice; i < this.pontos.length - 1; i++) {
                    this.pontos[i] = this.pontos[i + 1];
                }
                this.pontos[this.pontos.length - 1] = null;
                this.validos--;
            }
        }else{
            System.out.println("Posição inválida");
        }
    }

    public double calcula_distancia(){
        double max_distancia = 0;
        for(int i = 0; i < this.pontos.length; i++) {
            for (int j = 0; j < this.pontos.length; j++) {
                if (this.pontos[i] != null && this.pontos[j] != null) {
                    double nova_distancia = this.pontos[i].distancia(this.pontos[j]);
                    if (nova_distancia > max_distancia) {
                        max_distancia = nova_distancia;
                    }
                }
            }
        }
        return max_distancia;
    }

    public listaPonto pontos_circunferencia(double raio, Ponto p){
        Ponto[] pontos_circunferencia_list = new Ponto[this.pontos.length];
        for(int i = 0; i < this.pontos.length; i++){
            if (this.pontos[i] != null) {
                if (p.distancia(this.pontos[i]) <= raio) {
                    pontos_circunferencia_list[i] = this.pontos[i];
                }
            }
        }
        listaPonto nova_lista = new listaPonto(pontos_circunferencia_list.length);
        for(int i = 0; i < pontos_circunferencia_list.length; i++){
            nova_lista.adiciona_final(pontos_circunferencia_list[i]);
        }
        return nova_lista;
    }
}
