package co.grandcircus.Hotel;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
	public List<Hotel> findByCity(String city) {
		return em.createQuery(" FROM Hotel where city = :city", Hotel.class)
		.setParameter("city", city)
		.getResultList();
	}
	
	public Set<String> findAllCities() {
		List<String> cityList = em.createQuery("Select Distinct city from Hotel", String.class)
				.getResultList();
		return new TreeSet<>(cityList);
	}
}
