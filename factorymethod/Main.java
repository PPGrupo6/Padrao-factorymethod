package main.factorymethod;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        DocumentoFactory documentoFactory = new DocumentoFactory();
        Documento doc = documentoFactory.criarDocumento(DocumentoFactory.Tipo.APRESENTACAO);
        Documento doc2 = documentoFactory.criarDocumento(DocumentoFactory.Tipo.PLANILHA);
        Documento doc3 = documentoFactory.criarDocumento(DocumentoFactory.Tipo.TEXTO);
        Consumer<Documento> interagir = documento -> {
            documento.descrever();
            documento.abrir();
            documento.salvar();
            documento.excluir();
        };
        interagir.accept(doc);
        System.out.println("-".repeat(50));
        interagir.accept(doc2);
        System.out.println("-".repeat(50));
        interagir.accept(doc3);
    }

}
