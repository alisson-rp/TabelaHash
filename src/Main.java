public class Main {
    public static void main(String[] args) { // Metodo main
        Hash hash = new Hash(4); // Cria uma tabela Hash com operador 4
        hash.inserir(new Contato(2, "Saulo", "99990000")); // Insere n elementos
        hash.inserir(new Contato(6, "Joao", "99009900"));
        hash.inserir(new Contato(13, "Marta", "99778877"));
        hash.inserir(new Contato(12, "Roberta", "87872222"));
        hash.inserir(new Contato(7, "Maria", "77887777"));
        hash.inserir(new Contato(23, "Allysson", "83274367"));
        hash.inserir(new Contato(14,"Alisson" , "75632859"));
        hash.inserir(new Contato(33, "Igor", "39027583"));

        System.out.println(hash); // Imprime a tabela Hash e suas listas
        System.out.println("####################################\n####################################");
        System.out.println(hash.buscar(33));
        System.out.println("####################################\n####################################");
        System.out.println(hash.remover(33));
        System.out.println("####################################\n####################################");
        System.out.println(hash);

    }
}
