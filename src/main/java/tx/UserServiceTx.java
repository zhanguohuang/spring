package tx;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jdbc.User;

@Transactional(propagation = Propagation.REQUIRED)
public interface UserServiceTx {

	public void save(User user) throws Exception;
}
