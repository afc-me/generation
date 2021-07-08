package org.generation.afcblog.seguranca;

import java.util.Optional;

import org.generation.afcblog.model.Usuario;
import org.generation.afcblog.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
		Optional<Usuario> email = userRepository.findByEmail(userEmail);
		email.orElseThrow(() -> new UsernameNotFoundException(userEmail + " não foi encontrado"));
		
		return email.map(UserDetailsImpl::new).get();
	}
}
