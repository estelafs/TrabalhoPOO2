package objetos;

import principal.ArcadeFramework;

public class Raquete {
    private int altura;
    private int largura;
    public int x_pos;
    public int y_pos;
    private int velocidade;
    
    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getX_pos() {
        return x_pos;
    }

    public int getY_pos() {
        return y_pos;
    }
    
    /*A string r diz se é a raqueta da esquerda ou a da direita */
    public Raquete(String r, int tamanho) {
        velocidade = 10;
        altura = tamanho;
        largura = 10;
        y_pos = (ArcadeFramework.altura / 2) - (altura / 2); //no centro

        if(r.equals("esquerda")){
            x_pos = 10;
        }
        if(r.equals("direita")){
            x_pos = ArcadeFramework.largura - 25;
        }
    }

    public void moveCima(){
        if(y_pos > 0)
            y_pos -= velocidade;
    }

    public void moveBaixo(){
        if(y_pos < (ArcadeFramework.altura - altura))
            y_pos += velocidade;
    }
}
