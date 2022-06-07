package expertostech.encriptarsenhausuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expertostech.encriptarsenhausuario.model.User;
import expertostech.encriptarsenhausuario.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
		
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}

	public Optional<User> findByLogin(String login) {		
		return userRepository.findByLogin(login);
	}
	
}
