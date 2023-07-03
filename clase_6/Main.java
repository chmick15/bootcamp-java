package clase_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        /*
        //Buscador de país
        String google = "https://www.google.com/maps/search/";
        System.out.println("To search a country on the world map, please introduce the name of the country you wanna search");
        String searchCountry = lector.next();
        System.out.println(google + searchCountry);
         */

        /*
        //Buscador de tweets
        String twitter = "https://twitter.com/search?q=";
        System.out.println("To search a tweet, please introduce the word you wanna find in Tweets");
        String searchTweet = lector.next();
        System.out.println(twitter + searchTweet);
         */

        /*
        //Para llamar a una persona por whatsapp
        String whatsapp = "https://api.whatsapp.com/send?phone=";
        System.out.println("To call someone with WhatsApp, please introduce the phone number you wanna reach");
        String searchPhone = lector.next();
        System.out.println(whatsapp + searchPhone);
         */

        //Programa para calcular el promedio de 3 números
        System.out.println("I am going to calculate the average of 3 numbers");
        System.out.println("Introduce the first one:");
        Integer num1 = lector.nextInt();
        System.out.println("Introduce the second one:");
        Integer num2 = lector.nextInt();
        System.out.println("Introduce the third one:");
        Integer num3 = lector.nextInt();

        Integer result = (num1 + num2 + num3)/3;
        System.out.println("The average of: " + num1 + ", " + num2 + " and " + num3 + " is: " + result);

        /*
        //Mostrar los numeros del 1 al 100 con While
        Integer i = 0;
        while (i<100){
            i++;
            System.out.println(i);
        }
         */

        /*
        //Piedra, Papel o Tijeras
        Integer piedra = 1;
        Integer papel = 2;
        Integer tijeras = 3;
        Integer random = (int)(Math.random() * 3 +1);

        System.out.println("We're going to play Rock, Paper, Scissors");
        System.out.println("To play Rock choose 1, to play Paper choose 2, to Play Scissors choose 3");
        Integer choice = lector.nextInt();
        if(choice == 1){
            System.out.println("You choose Rock");
        } else if (choice == 2) {
            System.out.println("You choose Paper");
        } else if (choice == 3) {
            System.out.println("You choose Scissors");
        } else {
            System.out.println("You didn't choose a correct choice");
        }
        if(random == choice){
            System.out.println("No one won, you choose the same");
        } else if (random == 1 && choice == papel ) {
            System.out.println("You choose: paper");
            System.out.println("The computer choose: rock");
            System.out.println("You win");
        } else if (random == 1 && choice == tijeras) {
            System.out.println("You choose: scissors");
            System.out.println("The computer choose: rock");
            System.out.println("You loose");
        } else if (random == 2 && choice == piedra) {
            System.out.println("You choose: rock");
            System.out.println("The computer choose: paper");
            System.out.println("You loose");
        } else if (random == 2 && choice == tijeras) {
            System.out.println("You choose: scissors");
            System.out.println("The computer choose: paper");
            System.out.println("You win");
        } else if (random == 3 && choice == piedra) {
            System.out.println("You choose: rock");
            System.out.println("The computer choose: scissors");
            System.out.println("You win");
        } else if (random == 3 && choice == papel) {
            System.out.println("You choose: paper");
            System.out.println("The computer choose: scissors");
            System.out.println("You loose");
        }
        */

        //Histoire à choisir

        System.out.println("I'm going to share with you a story, you can choose the option you want to know the story !");
        System.out.println("Te encuentras en un bosque encantado, rodeado de árboles altos y susurros misteriosos. A medida que avanzas, te das cuenta de que el camino se divide en dos. A tu izquierda, ves un sendero cubierto de musgo y con una luz tenue que se filtra entre los árboles. A tu derecha, hay un camino empedrado que se pierde en la oscuridad de la densa vegetación.\n" +
                "\n" +
                "Tienes que elegir tu camino:" +
                "\n");
        System.out.println("Por la izquierda: ESCRIBE 1");
        System.out.println("Por la derecha: ESCRIBE 2");

        Integer option1 = lector.nextInt();

        if(option1 == 1){
            System.out.println("Te adentras en un terreno pantanoso");
            System.out.println("El aire se vuelve denso y húmedo mientras avanzas.");
            System.out.println("De repente, te encuentras frente a un río profundo y caudaloso que bloquea tu camino.");
            System.out.println("¿Qué harás ahora? ");
            System.out.println("¿Construirás un puente improvisado? (ESCRIBE 1)");
            System.out.println("¿Buscarás una ruta alternativa? (ESCRIBE 2)");

            Integer option2 = lector.nextInt();

            if(option2 == 1){
                System.out.println("Reúnes palos y rocas para crear una estructura sólida que te permita cruzar el río.");
                System.out.println("Con éxito, logras superar el obstáculo y te adentras en una cueva misteriosa.");
                System.out.println("¿Te atreverás a explorarla en busca de tesoros ocultos?");
            } else if (option2 == 2) {
                System.out.println("Por otro lado, si decides buscar una ruta alternativa, te encuentras con un pueblo amigable en el bosque.");
                System.out.println("Sus habitantes te reciben con calidez, ofreciéndote comida y descanso.");
                System.out.println("Aprovechas la oportunidad para recargar energías antes de continuar tu aventura.");
            }else {
                System.out.println("No existe esta opción");
            }

        } else if (option1 == 2) {
            System.out.println("Te enfrentas a una montaña imponente.");
            System.out.println("La pendiente rocosa parece desafiante, pero algo en tu interior te insta a escalarla.");
            System.out.println("¿Aceptarás el desafío de la montaña?");
            System.out.println("Si (ESCRIBE 1)");
            System.out.println("Buscarás un túnel (ESCRIBE 2) que te permita atravesarla");

            Integer option3 = lector.nextInt();

            if(option3 == 1){
                System.out.println("Te enfrentas a una tarea peligrosa.");
                System.out.println("La ascensión se vuelve cada vez más difícil y arriesgada.");
                System.out.println("Finalmente, decides que es demasiado peligroso continuar y decides regresar por el otro camino.");
            } else if (option3 == 2) {
                System.out.println("Tienes suerte.");
                System.out.println("Descubres una entrada oculta que te lleva a través de la montaña.");
                System.out.println("Al otro lado, llegas a una pradera hermosa y serena.");
                System.out.println("Decides descansar aquí antes de continuar tu aventura, disfrutando de la paz y la belleza que te rodea.");
            }else {
                System.out.println("No existe esta opción");
            }

        } else {
            System.out.println("No existe esta opción");
        }
    }
}
