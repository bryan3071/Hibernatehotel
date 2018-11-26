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
	public Hotel findById (Long id) {
		return em.find(Hotel.class, id);
	}
	public Object findByCity(String city) {
		return em.createQuery(" FROM hotel_listing where city = city order by pricepernight", Hotel.class)
		.setParameter("city", city)
		.getResultList();
	}
}
