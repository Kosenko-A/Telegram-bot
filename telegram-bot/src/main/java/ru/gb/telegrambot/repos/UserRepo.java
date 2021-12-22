package ru.gb.telegrambot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.telegrambot.domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}