package Exo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryManagerTest {
    private InventoryManager inventoryManager;

    @BeforeEach
    public void setUp() {
        inventoryManager = new InventoryManager();
    }

    @Test
    public void testStockSuffisant() {
        inventoryManager.ajouterProduit("P1", 100);

        int quantiteP1 = inventoryManager.getDisponibiliteStock("P1");

        Assertions.assertEquals(100, quantiteP1);
        Assertions.assertEquals(100, inventoryManager.getDisponibiliteStock("P1"));
    }

    @Test
    public void testStockInsuffisant() {
        inventoryManager.ajouterProduit("P1", 5);

        int quantiteP1 = inventoryManager.getDisponibiliteStock("P1");

        Assertions.assertEquals(5, quantiteP1);
        Assertions.assertEquals(5, inventoryManager.getDisponibiliteStock("P1"));
    }

    @Test
    public void testStockEpuise() {
        inventoryManager.ajouterProduit("P1", 0);

        int quantiteP1 = inventoryManager.getDisponibiliteStock("P1");

        Assertions.assertEquals(0, quantiteP1);
        Assertions.assertEquals(0, inventoryManager.getDisponibiliteStock("P1"));
    }

    @Test
    public void testProduitInexistant() {
        int quantiteInexistante = inventoryManager.getDisponibiliteStock("P1");

        Assertions.assertEquals(0, quantiteInexistante);
    }
}
