package atividade;

public class CarroTeste {

    public static void main(String... args) {
        Carro carroVermelho = new Carro();
        carroVermelho.cor = "vermelho";
        carroVermelho.numChassi = "12321";
        carroVermelho.quilometragem = 0;
        carroVermelho.potencia = 100;
        carroVermelho.quantidadePortas = 4;
        carroVermelho.velocidade = 40;
        carroVermelho.marcha = 3;
        carroVermelho.ligado = true;
        carroVermelho.velocidadeMaxima = 180;

        // CARRO VERMELHO
        carroVermelho.subirMarcha();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();

        carroVermelho.subirMarcha();

        System.out.println("VELOCIDADE INICIAL CARRO VERMELHO: " + carroVermelho.velocidade);

        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();

        System.out.println("VELOCIDADE FINAL CARRO VERMELHO: " + carroVermelho.velocidade);

        // CARRO VERMELHO
        Carro carroPreto = new Carro("123213", "preto");

        carroPreto.velocidade = 50;
        carroPreto.marcha = 4;

        System.out.println("VELOCIDADE INICIAL CARRO PRETO: " + carroPreto.velocidade);

        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();

        carroPreto.subirMarcha();

        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();

        System.out.println("VELOCIDADE FINAL CARRO PRETO: " + carroPreto.velocidade);
    }

}
