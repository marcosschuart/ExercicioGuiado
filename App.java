//Nome: Marcos Schuart Nobre de Lima Palhares
//Matrícula: 1261931350

public class App {
// 1. A Assinatura
public static int maior(int a, int b) {

    // 2. A Lógica Interna
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

    public static void main(String[] args) throws Exception {
    // 3. O uso no main
    int maximo = maior(10, 42);
    System.out.println(maximo);
    }
}
