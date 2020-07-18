package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        //Retourne les valeurs de la BDD
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // permet de generer un utilisateurs pour la BDD
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        //permet de supprimer un utilisateur de la BDD
        apiService.deleteUser(user);
    }
}
