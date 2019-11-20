package colecaoelementos;
import java.util.Scanner;
import java.lang.Math;

public class Ponto {
    private int x,y;
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y; }

    public double distancia( Ponto p){
        double c1 = this.x-p.x;
        double c2 = this.y-p.y;
        return Math.sqrt(c1*c1+c2*c2);
    }
}

