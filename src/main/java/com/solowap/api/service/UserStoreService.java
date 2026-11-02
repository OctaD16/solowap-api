package com.solowap.api.service;

import com.solowap.api.exception.ResourceNotFoundException;
import com.solowap.api.model.UserStore;
import com.solowap.api.repository.IUserStoreRepository;
import com.solowap.api.serviceJPA.IUserStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserStoreService implements IUserStoreService {
    @Autowired
    private IUserStoreRepository usRepo;

    @Override
    public UserStore guardar(UserStore userStore) {
        return usRepo.save(userStore);
    }

    @Override
    public UserStore buscarPorId(Long id) {
        Optional<UserStore> uStore = usRepo.findById(id);
        if(uStore.isPresent()){
            return uStore.get();
        }else{
            throw new ResourceNotFoundException("El usuario no existe");
        }
    }

    @Override
    public List<UserStore> buscarTodos() {
        return usRepo.findAll();
    }

    @Override
    public void eliminar(Long id) {
        UserStore userStore = this.buscarPorId(id);
        usRepo.delete(userStore);
    }

    @Override
    public UserStore actualizar(Long id, UserStore userStore) {
        UserStore uStore = this.buscarPorId(id);
        uStore.setStoreConfig(userStore.getStoreConfig());
        uStore.setRole(userStore.getRole());
        uStore.setUsername(userStore.getUsername());
        uStore.setPassword(userStore.getPassword());
        uStore.setStatus(userStore.getStatus());
        return usRepo.save(uStore);
    }

    @Override
    public boolean existe(Long id) {
        return usRepo.existsById(id);
    }
}
