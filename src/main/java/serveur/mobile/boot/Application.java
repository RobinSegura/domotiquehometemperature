package serveur.mobile.boot;

import org.springframework.boot.SpringApplication;
import serveur.mobile.config.Config;

public class Application {
    public static void main(String[] args) {
        // lancement du serveur d'application
        SpringApplication.run(Config.class, args);
        /**
         * 1er param : la classe de configuration générée par les annotations Spring
         *             (dans le package config)
         * 2nd param : le tableau des arguments passés à la méthode main()
         */
    }
}
