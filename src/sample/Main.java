package sample;
public class Main {

    public static void main(String[] args) {
        System.out.println("vou tomar sorvete");
        Sorvete sorvete1 = new Sorvete();
        sorvete1.setNome("neve do cambirela");
        sorvete1.setSabor("flocos");
        sorvete1.setPreço(5.80);

        Sorvete sorvete2 = new Sorvete();
        sorvete2.setNome("passas ao rum");
        sorvete2.setSabor("passas ao rum");
        sorvete2.setPreço(5.80);

        Sorvete sorvete3 = new Sorvete();
        sorvete3.setNome("creme");
        sorvete3.setSabor("leite");
        sorvete3.setPreço(5.80);


        System.out.println(sorvete1);
        System.out.println(sorvete2);
        System.out.println(sorvete3);
    }
}
