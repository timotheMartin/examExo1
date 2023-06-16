package Exo1;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventaire;

    public InventoryManager() {
        inventaire = new HashMap<>();
    }

    public void ajouterProduit(String idProduit, int quantite) {
        if (quantite < 0) {
            throw new IllegalArgumentException("La quantité doit être supérieure ou égale à zéro.");
        }

        inventaire.put(idProduit, inventaire.getOrDefault(idProduit, 0) + quantite);
    }

    public void retirerProduit(String idProduit, int quantite) {
        if (quantite < 0) {
            throw new IllegalArgumentException("La quantité doit être supérieure ou égale à zéro.");
        }

        if (!inventaire.containsKey(idProduit)) {
            throw new IllegalArgumentException("Le produit n'est pas présent dans l'inventaire.");
        }

        int quantiteActuelle = inventaire.get(idProduit);
        if (quantite > quantiteActuelle) {
            throw new IllegalArgumentException("La quantité demandée est supérieure à celle disponible dans l'inventaire.");
        }

        inventaire.put(idProduit, quantiteActuelle - quantite);
    }

    public int getDisponibiliteStock(String idProduit) {
        return inventaire.getOrDefault(idProduit, 0);
    }
}
