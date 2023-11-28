package fr.diginamic.demospring;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class VilleDao {
    @PersistenceContext
    private EntityManager em;
    public List<Ville> extractAll() {
        TypedQuery<Ville> query = em.createQuery("SELECT v FROM Ville v", Ville.class);
        return query.getResultList();
    }
    public Ville extractVille(Long id) {
        return em.find(Ville.class, id);
    }
    @Transactional
    public void insert(Ville nvVille) {
        em.persist(nvVille);
    }
}
