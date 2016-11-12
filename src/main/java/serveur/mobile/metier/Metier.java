package serveur.mobile.metier;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class Metier implements IMetier {
    @Override
    public double getTemperature(String nomCapteurs) throws TemperatureException {


        // contrôle : le nom fourni est bien le nom d'un capteur connu
        if ( ! nomCapteurs.equals("Salon") && ! nomCapteurs.equals("Chambre-1") ) {
            throw new TemperatureException("Le nom du capteur est inconnu.");
        } //else if ()
        // génération d'une température aléatoire entre 10°C et 20°C
        Random random = new Random();
        int nombre = random.nextInt(100);
        double tre = (100+nombre)/10.0; // ex: 17.6
        // résultat
        return tre;
    }

}
