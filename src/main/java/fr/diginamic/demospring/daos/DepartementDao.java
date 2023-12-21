package fr.diginamic.demospring.daos;

import fr.diginamic.demospring.services.Departement;
import fr.diginamic.demospring.services.Ville;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartementDao {

    @PersistenceContext
    private EntityManager em;

    public List<Departement> extractAll() {
        TypedQuery<Departement> query = em.createQuery("SELECT d FROM Departement d", Departement.class);
        return query.getResultList();
    }

    public Departement extractDepartement(Long id) {
        return em.find(Departement.class, id);
    }

    public List<Ville> getNPlusGrandesVilles(Long departementId, int n) {
        // Logic to retrieve the N largest cities for a given department
        TypedQuery<Ville> query = em.createQuery(
                "SELECT v FROM Ville v WHERE v.departement.id = :departementId ORDER BY v.nbHabitant DESC",
                Ville.class
        );
        query.setParameter("departementId", departementId);
        query.setMaxResults(n);
        return query.getResultList();
    }

    @Transactional
    public void insert(Departement nouveauDepartement) {
        em.persist(nouveauDepartement);
    }

    @Transactional
    public void supprimerDepartement(Long id) {
        Departement departement = extractDepartement(id);
        if (departement != null) {
            em.remove(departement);
        }
    }

    @Transactional
    public void modifierDepartement(Departement nouveauDepartement) {
        em.merge(nouveauDepartement);
    }
}
