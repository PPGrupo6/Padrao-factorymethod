package main.factorymethod;

public class Planilha implements Documento {

    @Override
    public void descrever() {
        System.out.println("Planilha");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo planilha...");
    }

    @Override
    public void salvar() {
        System.out.println("Salvando planilha...");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo planilha...");
    }

}
