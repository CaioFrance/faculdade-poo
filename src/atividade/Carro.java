package atividade;

public class Carro {

    String numChassi;
    double velocidadeMaxima;
    double quilometragem;
    double potencia;
    String cor;
    int quantidadePortas;
    double velocidade;
    int marcha;
    boolean ligado;

    Carro() {}

    Carro(String numChassi, String cor) {
        this.numChassi = numChassi;
        velocidade = 0;
        velocidadeMaxima = 180;
        quilometragem = 0;
        potencia = 80;
        this.cor = cor;
        quantidadePortas = 4;
        marcha = 0;
        ligado = false;
    }

    void ligar() {
        ligado = true;
    }

    void desligar() {
        ligado = false;
    }

    void acelerar() {
        if (regraMarcha()) {
            velocidade += 5;
        }
    }

    void fear() {
        if (velocidade > 0) {
            velocidade -= 5;
        }
    }

    void girarVolante() {

    }

    void reduzirMarcha() {
        if (marcha > 0) {
            marcha--;
        }
    }

    void subirMarcha() {
        int totalMarcha = 5;
        if (marcha <= totalMarcha) {
            marcha++;
        }
    }

    boolean regraMarcha() {
        if (marcha == 1 && velocidade <= 20) {
            return true;
        } else if (marcha == 2 && velocidade < 30) {
            return true;
        } else if (marcha == 3 && velocidade < 40) {
            return true;
        } else if (marcha == 4 && velocidade < 65) {
            return true;
        } else return marcha == 5 && velocidade <= velocidadeMaxima;
    }

}
