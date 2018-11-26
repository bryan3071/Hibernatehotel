package co.grandcircus.Hotel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class HotelDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Hotel> findAll() {
		return em.createQuery(" FROM hotel_listing", Hotel.class).getResultList();
	}
}
