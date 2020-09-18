import java.util.Scanner;

class Calculator{

    private int nb1, nb2, result;
    private final String APP_TITLE = "------------\n" +
                                     "CALCULATRICE" +
                                     "\n------------";
    private final String QUESTION = "\nVoulez-vous effectuer une nouvelle opération ? [O/N]";
    private String operation = "";
    private String userResponse = "";

    Calculator(){}
    public void calcultate(){
        //Gestion des signes d'opération.
        Scanner sc = new Scanner(System.in);
        mainLoop: while (!userResponse.equals("N")) {
        System.out.println(APP_TITLE);
        
        //Gestion du calcul.
        try {
            System.out.print("1er nombre: ");
            nb1 = sc.nextInt();
            sc.nextLine();

            operation = sc.nextLine();
            sc.nextLine();
            
            System.out.print("2ème nombre: ");
            nb2 = sc.nextInt();
            sc.nextLine();

            int result = 0;
            switch (operation) {
              case "+":
                System.out.println("Ton opération : " + nb1+" + "+nb2);
                result = nb1 + nb2;
                break;
              case "-":
                System.out.println("Ton opération : " + nb1+" - "+nb2);
                result = nb1 - nb2;
                break;
              case "/":
               System.out.println("Ton opération : " + nb1+" / "+nb2);
                result = nb1 / nb2;
                break;
              case "*":
                System.out.println("Ton opération : " + nb1+" * "+nb2);
                result = nb1 * nb2;
                break;
              case "%":
                System.out.println("Ton opération : " + nb1+" % "+nb2);
                result = nb1 % nb2;
                break;
              default:
                System.out.println("Calcul imposssible !");
                continue mainLoop;
            }

            //Gestion du résultat.
            System.out.println("Résultat de l'opération: " + result);
            
            System.out.println(QUESTION);
            userResponse = sc.nextLine();
          }
          //Gestion des erreurs.
          catch (Exception e) {
            if (sc.hasNextLine()) {
              sc.nextLine();
            }
          }
        }
        System.out.println("La calculatrice à bien été fermée.");
        sc.close();
    }
}
