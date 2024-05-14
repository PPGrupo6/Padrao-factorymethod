package main.factorymethod;

public class DocumentoFactory {

    public enum Tipo {
        APRESENTACAO,
        PLANILHA,
        TEXTO
    }

    public Documento criarDocumento(Tipo documento) {
        switch (documento) {
            case TEXTO -> {
                return new Texto();
            }
            case PLANILHA -> {
                return new Planilha();
            }
            case APRESENTACAO -> {
                return new Apresentacao();
            }
            default -> throw new IllegalArgumentException("Tipo de documento inválido");
        }
    }

}
