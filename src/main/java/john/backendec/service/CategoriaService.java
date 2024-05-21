package john.backendec.service;

import john.backendec.entity.CategoriaEntity;
import john.backendec.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService{
    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaEntity buscar(Integer id) {
        var obj = categoriaRepository.findById(id);
        if(obj.isPresent()) return obj.get();
        return null;
    }

    public CategoriaEntity salvar(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }
}
