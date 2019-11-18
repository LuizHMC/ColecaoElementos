package colecaoelementos;
import java.util.Scanner;
import java.lang.Math;

public class colecaoElemento {
    private listaPonto lista1;
    private Ponto ponto1;


    public colecaoElemento(listaPonto lista1, Ponto ponto1) {
        this.lista1 = lista1;
        this.ponto1 = ponto1;
    }


    public static void main(String[] args) {
        Ponto p1;
        listaPonto l1;
        colecaoElemento colecao;
        p1 = new Ponto(1,2);
        Ponto list[] = {p1};
        l1 = new listaPonto(1);

        System.out.print(p1+"\n");
        System.out.print(l1.getPontos()+"\n");
        System.out.print(list+"\n");


    }

}