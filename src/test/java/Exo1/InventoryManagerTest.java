package Exo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * cette classe de test pour la classe InventoryManager.
 */
public class InventoryManagerTest {
    private InventoryManager inventoryManager;

    @BeforeEach
    public void setUp() {
        inventoryManager = new InventoryManager();
    }

    /**
     * Teste le scénario où le stock est suffisant.
     * On ajoute 100
     * La quantite doit être de 100
     */
    @Test
    public void testStockSuffisant() {
        inventoryManager.ajouterProduit("P1", 100);

        int quantiteP1 = inventoryManager.getDisponibiliteStock("P1");

        Assertions.assertEquals(100, quantiteP1);
        Assertions.assertEquals(100, inventoryManager.getDisponibiliteStock("P1"));
    }

    /**
     * Teste le scénario où le stock est insuffisant
     * On ajoute 5
     * La quantité doit donc être de 5.
     */
    @Test
    public void testStockInsuffisant() {
        inventoryManager.ajouterProduit("P1", 5);

        int quantiteP1 = inventoryManager.getDisponibiliteStock("P1");

        Assertions.assertEquals(5, quantiteP1);
        Assertions.assertEquals(5, inventoryManager.getDisponibiliteStock("P1"));
    }

    /**
     * La quantité disponible doit être de 0.
     */
    @Test
    public void testStockEpuise() {
        inventoryManager.ajouterProduit("P1", 0);

        int quantiteP1 = inventoryManager.getDisponibiliteStock("P1");

        Assertions.assertEquals(0, quantiteP1);
        Assertions.assertEquals(0, inventoryManager.getDisponibiliteStock("P1"));
    }

    /**
     * Teste le scénario où le produit n'est pas dans l'inventaire.
     */
    @Test
    public void testProduitInexistant() {
        int quantiteInexistante = inventoryManager.getDisponibiliteStock("P1");

        Assertions.assertEquals(0, quantiteInexistante);
    }
}
