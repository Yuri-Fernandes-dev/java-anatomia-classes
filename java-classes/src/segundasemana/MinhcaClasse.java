package segundasemana;
public class MinhcaClasse {                         //classe - nomeclatura intuitiva
public static void main (String [] args){    //Método

    String primeiroNome = "Yuri";
    String segundoNome = "Fernandes";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
};



            // esse metodo foi criado como se fosse uma funcao no javascript para usar em outro lugar
public static String  nomeCompleto (String primeiroNome, String segundiNonme){   // método
    return "Resultado do método: "+ primeiroNome.concat(" ").concat(segundiNonme);
}


}
