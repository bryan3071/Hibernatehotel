package co.grandcircus.Hotel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class HotelDao {

	@PersistenceContext
	private EntityManager em;
	
}
