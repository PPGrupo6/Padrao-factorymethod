package main.factorymethod;

public class Texto implements Documento {

    @Override
    public void descrever() {
        System.out.println("Arquivo de texto");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo de texto...");
    }

    @Override
    public void salvar() {
        System.out.println("Salvando arquivo de texto...");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo arquivo de texto...");
    }

}
