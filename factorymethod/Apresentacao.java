package main.factorymethod;

public class Apresentacao implements Documento {

    @Override
    public void descrever() {
        System.out.println("Arquivo de apresentacao");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo apresentacao...");
    }

    @Override
    public void salvar() {
        System.out.println("Salvando apresentacao...");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo apresentacao...");
    }

}
