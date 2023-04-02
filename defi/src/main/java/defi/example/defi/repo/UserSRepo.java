package defi.example.defi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import defi.example.defi.model.User;


public interface UserSRepo extends JpaRepository<User, Integer> {

	User findByEmailId(String email);

	User findByEmailIdAndPassword(String email, String password);
}
